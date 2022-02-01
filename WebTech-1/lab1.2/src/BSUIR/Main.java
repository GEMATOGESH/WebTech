package BSUIR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter y: ");
        double y = Double.parseDouble(scanner.nextLine());
        System.out.print("Result: " + calculate(x, y));
    }

    private static boolean calculate(double x, double y) {
        return ((y > 0) && (y < 5) && (x > -4) && (x < 4)) || ((y <= 0) && (y > -3) && (x > -6) && (x < 6));
    }
}
