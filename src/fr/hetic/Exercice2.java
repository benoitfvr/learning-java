package fr.hetic;
import java.io.*;

public class Exercice2 {
    public static void main(String[] args) {
        String inputFilePath = args[0];
        String outputFilePath = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             FileWriter writer = new FileWriter(outputFilePath)) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");
                int a = Integer.parseInt(tokens[0]);
                int b = Integer.parseInt(tokens[1]);
                String operationSymbol = tokens[2];

                try {
                    Operation operation = OperationFactory.getOperation(operationSymbol);
                    int result = operation.execute(a, b);
                    writer.write(String.valueOf(result));
                    writer.write(System.lineSeparator());
                } catch (IllegalArgumentException | ArithmeticException e) {
                    writer.write("Error: " + e.getMessage());
                    writer.write(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.exit(1);
        }
    }
}
