package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Bir dikdörtgen icin kısa kenar ve uzun kenar giriniz");
        double kisaKenar = input.nextDouble();
        double uzunKenar = input.nextDouble();
        System.out.println( " Alan= " +(kisaKenar * uzunKenar));
        System.out.println("Cevre =" + (2 * kisaKenar + 2 * uzunKenar));


    }
}
