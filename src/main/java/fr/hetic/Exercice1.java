package fr.hetic;
import java.io.*;

public class Exercice1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Exercice1 <a> <b> <operation>");
            System.exit(1);
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String operationSymbol = args[2];

        try {
            Operation operation = OperationFactory.getOperation(operationSymbol);
            int result = operation.execute(a, b);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Unknown operation: " + operationSymbol);
            System.exit(1);
        } catch (ArithmeticException e) {
            System.out.println("Error during operation: " + e.getMessage());
            System.exit(1);
        }
    }
}
