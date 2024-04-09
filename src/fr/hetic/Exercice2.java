package fr.hetic;
import java.io.*;


public class Exercice2 {
    public static void main(String[] args) {
        String inputFilePath = args[0];
        String outputFilePath = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            FileWriter writer = new FileWriter(outputFilePath)) {
                
            Calculateur calculateur = new Calculateur();

            String line;
            while ((line = reader.readLine()) != null) {
               String[] tokens = line.split(" ");
               int a = Integer.parseInt(tokens[0]);
               int b = Integer.parseInt(tokens[1]);
               String operation = tokens[2];

               int result;
               switch (operation) {
                  case "+":
                     result = calculateur.addition(a, b);
                     break;
                  case "-":
                     result = calculateur.substraction(a, b);
                     break;
                  case "*":
                     result = calculateur.multiplication(a, b);
                     break;
                  case "/":
                     result = calculateur.division(a, b);
                     break;
                  default:
                     System.out.println("Unknown operation: " + operation);
                     continue;
               }

               writer.write(String.valueOf(result));
               writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.exit(1);
        }
    }
}