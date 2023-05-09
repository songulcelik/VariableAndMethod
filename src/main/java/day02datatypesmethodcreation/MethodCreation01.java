package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    javada method nasıl olusturulur
    1) main methodun disında classin icinde olusturulur
    2)access modifier + return type + methodismi + () + {}
    olusrutulan methodlar nasil kullanilir?
    methodu olusturmak methodu calistirmak icin yeterli değildir
    kullanilmak istenen method main methodun icinden kullanilir
    2)  methodun ismi+ () yazin

     */

    public static void main(String[] args) {
     int sonuc = toplamaYap(3,5);
     System.out.println(sonuc);
     long carpmaSonucu = multiply(4,5);
     System.out.println(carpmaSonucu);

     firstTwoMultiplyThirdAdd(2,3,4);
        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));


    }
    //ornek1: toplama islemi yapan bir method olusturun ve kullanin.
    public static int toplamaYap(int a, int b){
        return a+b;
        //return methodu bu methodun çagrildigi yere return et demek
        /*
       main method static oldugu icin main meyhod icinde kullanacagimiz method
       static olmalıdır
         */




    }

    //ornek2: 2 sayıyı carpma islemi yapan method olustur ve kullan
    protected static long multiply (int a, int b){
       return a*b;
    }

    //ornek3: verilen 3 sayıdan ilk ikisini çarpan ücüncü sayıyıile sonucu top

    private static int firstTwoMultiplyThirdAdd (int a, int b, int c){
        return a*b+c;}

    /*
    tekrar yap
    soru bankasındaki tüm soruları çöz
    1) dikdörtgenin alanını hesaplayan methodu olusturunve kullanın
    2)dikdörtgenin cevresini hesaplayan methodu olusurun ve kullanın

     */


}
