package BSUIR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] mas = filling(n);
        int k = calculate(mas);
        System.out.print("K: " + k);
    }

    private static int[] filling(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element number " + (i + 1) + " : ");
            mas[i] = Integer.parseInt(scanner.nextLine());
        }
        return mas;
    }

    private static int calculate(int[] mas) {
        int k = 0;
        while (true) {
            boolean notReady = false;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] >= mas[i + 1]) {
                    mas = shift(mas, i);
                    k++;
                    notReady = true;
                }
            }
            if (!notReady)
                break;
        }
        return k;
    }

    private static int[] shift(int[] mas, int id) {
        int[] buf = new int[mas.length - 1];
        for (int i = 0; i < id; i++) {
            buf[i] = mas[i];
        }
        for (int i = id + 1; i < mas.length; i++) {
            buf[i - 1] = mas[i];
        }
        return buf;
    }
}
