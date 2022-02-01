package BSUIR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = Integer.parseInt(scanner.nextLine());
        double[] mas = filling(n);
        printArray(mas);
        mas = sort(mas);
        printArray(mas);
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

    private static void printArray(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println("");
    }

    private static double[] sort(double[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] > mas[i + 1]) {
                double buf = mas[i + 1];
                mas[i + 1] = mas[i];
                mas[i] = buf;

                if (i > 0) {
                    i -= 2;
                }
                else {
                    i -= 1;
                }
            }
        }
        return mas;
    }
}