package BSUIR;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = Integer.parseInt(scanner.nextLine());
        double[] masA = filling(n);
        System.out.print("Enter M: ");
        int m = Integer.parseInt(scanner.nextLine());
        double[] masB = filling(m);
        ArrayList<Integer> results = calculate(masA, masB);
        System.out.println("On the places with numbers: ");
        for(int i = 0; i < results.size(); i++) {
            System.out.print(results.get(i) + " ");
        }
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

    private static ArrayList<Integer> calculate(double[] masA, double[] masB) {
        ArrayList<Integer> places = new ArrayList<Integer>();
        for (int i = 0; i < masA.length; i++) {
            if (masB[0] < masA[i]) {
                masB = shift(masB);
                places.add(i + 1);
            }
        }
        return places;
    }

    private static double[] shift(double[] mas) {
        double[] buf = new double[mas.length - 1];
        for (int i = 1; i < mas.length; i++) {
            buf[i - 1] = mas[i];
        }
        return buf;
    }
}
