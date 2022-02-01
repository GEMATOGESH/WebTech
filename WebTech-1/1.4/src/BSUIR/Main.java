package BSUIR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = Integer.parseInt(scanner.nextLine());
        double[] mas = filling(n);
        calculate(mas);
    }

    private static double[] filling(int n) {
        Scanner scanner = new Scanner(System.in);
        double[] mas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element number " + (i + 1) + ": ");
            mas[i] = Double.parseDouble(scanner.nextLine());
        }
        return mas;
    }

    private static void calculate(double[] mas) {
        System.out.println("This numbers are prime: ");
        for (int i = 0; i < mas.length; i++) {
            boolean flag = isPrime(mas[i]);
            if (flag) {
                System.out.println("Number " + (i + 1));
            }
        }
    }

    private static boolean isPrime(double num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }
}
