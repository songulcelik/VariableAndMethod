package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        //ORNEK KULLANİCİDAN ADRESİNİ ALİNİZ VE EKRANA YAZDİRİN
        Scanner input = new Scanner(System.in);
        System.out.println("Adresinizi girin");
        String adres = input.nextLine();
        System.out.println(adres);


    }
}
