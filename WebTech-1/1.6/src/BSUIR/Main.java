package BSUIR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] mas = filling(n);
        int[][] matrix = toMatrix(mas);
        printMatrix(matrix);
    }

    private static int[] filling(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element number " + (i + 1) + ": ");
            mas[i] = Integer.parseInt(scanner.nextLine());
        }
        return mas;
    }

    private static int[][] toMatrix(int[] mas) {
        int[][] matrix = new int[mas.length][mas.length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                matrix[i][j] = mas[j];
            }
            mas = shifting(mas);
        }
        return matrix;
    }

    private static int[] shifting(int[] mas) {
        int[] buf = new int[mas.length];
        for (int i = 1; i < mas.length; i++) {
           buf[i - 1] = mas[i];
        }
        buf[mas.length - 1] = mas[0];
        return buf;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println("");
        }
    }
}