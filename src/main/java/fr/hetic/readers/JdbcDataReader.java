package fr.hetic;

import java.sql.*;
import java.io.*;

public class JdbcDataReader implements DataReader {

    private String url = "jdbc:postgresql://SG-hetic-mt4-java-5275-pgsql-master.servers.mongodirector.com:5432/TP";
    private String user = "etudiant";
    private String password = "MT4@hetic2324";

    @Override
    public void process() {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sqlFichier = "SELECT * FROM FICHIER WHERE TYPE = 'OP'";

            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sqlFichier)) {

                while (rs.next()) {
                    Fichier fichier = new Fichier();
                    fichier.setId(rs.getInt("ID"));
                    fichier.setNom(rs.getString("NOM"));
                    fichier.setType(rs.getString("TYPE"));

                    processFichierFromDB(fichier, conn);
                }
            }
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }

    private static void processFichierFromDB(Fichier fichier, Connection conn) {
        String outputFilePath = fichier.getNom().replace(".op", ".res");
        File outputFile = new File(outputFilePath);

        String sqlLigne = "SELECT * FROM LIGNE WHERE FICHIER_ID = " + fichier.getId();

        try (Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlLigne);
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            while (rs.next()) {
                Ligne ligne = new Ligne();
                ligne.setId(rs.getInt("ID"));
                ligne.setParam1(rs.getInt("PARAM1"));
                ligne.setParam2(rs.getInt("PARAM2"));
                ligne.setOperateur(rs.getString("OPERATEUR").charAt(0));
                ligne.setFichierId(rs.getInt("FICHIER_ID"));

                try {
                    Operation operation = OperationFactory.getOperation(String.valueOf(ligne.getOperateur()));
                    int result = operation.execute(ligne.getParam1(), ligne.getParam2());
                    writer.write(String.valueOf(result));
                    writer.newLine();
                } catch (IllegalArgumentException | ArithmeticException e) {
                    writer.write("Error: " + e.getMessage());
                    writer.newLine();
                }
            }
        } catch (SQLException | IOException e) {
            System.out.println("An error occurred processing file " + fichier.getNom() + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}