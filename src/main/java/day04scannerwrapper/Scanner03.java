package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı al sonuclari yazdir
        Scanner input = new Scanner(System.in);
        System.out.println("İki sayi giriniz");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);



    }
}
