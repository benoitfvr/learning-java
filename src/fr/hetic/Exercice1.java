package fr.hetic;
import java.io.*;


public class Exercice1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Main <a> <b> <operation>");
            System.exit(1);
        }

        if (args.length == 3) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            String operation = args[2];

            Calculateur calculateur = new Calculateur();

            switch (operation) {
                case "+":
                    System.out.println(calculateur.addition(a, b));
                    break;
                case "-":
                    System.out.println(calculateur.substraction(a, b));
                    break;
                case "*":
                    System.out.println(calculateur.multiplication(a, b));
                    break;
                case "/":
                    System.out.println(calculateur.division(a, b));
                    break;
                default:
                    System.out.println("Unknown operation: " + operation);
                    System.exit(1);
            }
        }
    }
}