package BSUIR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter h: ");
        double h = Double.parseDouble(scanner.nextLine());
        calculate(a, b, h);
    }

    private static void calculate(double a, double b, double h) {
        System.out.println("Results: ");
        for (double i = a; i <= b; i = i + h) {
            double res = Math.tan(i);
            System.out.println(i + " | " + res);
        }
    }
}
