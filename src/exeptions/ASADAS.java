package exeptions;

import java.util.Scanner;

public class ASADAS {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        double d = 0;
        System.out.println("Pdaj liczbę: ");
        try {
            d = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Watość nie jest liczbą");
            System.exit(-1);
        } finally {
            System.out.println("Koniec!");
        }
        if (d<0) {
            throw new IllegalAccessException();
        }
        System.out.println(java.lang.Math.sqrt(d));


    }
}
