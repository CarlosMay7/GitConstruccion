package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. Potencia");
        int operation = scanner.nextInt();

        double result = 0;
        switch (operation) {
            case 1:
                printResult(result);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (secondNumber != 0) {
                    
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            case 5:
                break;
            case 6:
                double base = (double) firstNumber;
                int exponent = (int) secondNumber;

                double powerResult = power(base, exponent);

                printResult(powerResult);
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }

    }

    public static double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("El exponente debe ser un número no negativo");
        }
        
        if (exponent == 0) {
            return 1.0;
        }
        
        return base * power(base, exponent - 1);
    }
    
    public static void printResult(double result){
        System.out.println("El resultado es: " + result);
    }
}