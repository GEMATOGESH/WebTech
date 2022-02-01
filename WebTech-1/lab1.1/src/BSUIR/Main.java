package BSUIR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter y: ");
        double y = Double.parseDouble(scanner.nextLine());
        double result = calculate(x, y);
        System.out.print("Result: " + result);
    }

    private static double calculate(double x, double y) {
        double result = (1.0D + Math.pow(Math.sin(x + y), 2.0D)) / (2.0D + Math.abs(x - 2.0D * x / (1.0D + Math.pow(x, 2.0D) * Math.pow(y, 2.0D))));
        return result;
    }
}