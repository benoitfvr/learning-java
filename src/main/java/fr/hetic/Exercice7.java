package fr.hetic;

import java.io.*;
import java.util.Properties;

public class Exercice7 {

    public static void main(String[] args) {
        Properties properties = new Properties();
        try (InputStream input = Exercice7.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find application.properties");
                return;
            }

            properties.load(input);
            String implementation = properties.getProperty("reader.implementation");
            DataReader dataReader;

            if ("JDBC".equals(implementation)) {
                dataReader = new JdbcDataReader();
            } else if ("FILE".equals(implementation)) {
                if (args.length != 1) {
                    System.out.println("Usage: java -jar Exercice7.jar <input directory>");
                    return;
                }
                String inputDirectoryPath = args[0];
                dataReader = new FileDataReader(inputDirectoryPath);
            } else {
                System.out.println("Invalid implementation specified");
                return;
            }

            dataReader.process();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
