package day03methodobjectcreationscanner;


import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
         byte age = input.nextByte();
        System.out.println("age = " + age);
    }

}
