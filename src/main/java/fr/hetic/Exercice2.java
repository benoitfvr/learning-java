package fr.hetic;

import java.io.*;

public class Exercice2 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar Exercice2.jar <input directory>");
            System.exit(1);
        }

        String inputDirectoryPath = args[0];
        File inputDirectory = new File(inputDirectoryPath);

        processDirectory(inputDirectory);
    }

    private static void processDirectory(File directory) {
        File[] files = directory.listFiles(file -> file.isDirectory() || file.getName().endsWith(".op"));

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    processDirectory(file);
                } else {
                    String outputFilePath = file.getPath().replace(".op", ".res");
                    processFile(file, new File(outputFilePath));
                }
            }
        }
    }

    private static void processFile(File inputFile, File outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] tokens = line.split(" ");
                    int a = Integer.parseInt(tokens[0]);
                    int b = Integer.parseInt(tokens[1]);
                    String operationSymbol = tokens[2];

                    Operation operation = OperationFactory.getOperation(operationSymbol);
                    int result = operation.execute(a, b);
                    writer.write(String.valueOf(result));
                    writer.newLine();
                } catch (IllegalArgumentException | ArithmeticException e) {
                    writer.write("Error: " + e.getMessage());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred processing file " + inputFile.getPath() + ": " + e.getMessage());
        }
    }
}