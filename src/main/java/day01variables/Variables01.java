package day01variables;

public class Variables01 {

    public static void main(String[] args) {
        // Data Type + variable name + assigment operatör + Variable degeri ;
            int             age         = 13 ;
       //java cumlesi statement
        //statement bittigini ; gosterir
        //assigment yapmazsanız java kendi default değerini koyar
        //default değeri sayılar için 0dır
        //javada = assigment operatordür
        //java bu operatörü görünce sağ tarafı alır soldaki sepete koyar.
        // javada eşittir demek ==
        //data type+variablename ==> variable decloriton
        //assigmentoperator+ değer ==> assigment
        /*
        javada iki tip data var
        1)primitive data type
        char boolean byte short int long float double

        2)non-primitive data type
        string
         */
        //Ornek1: öğrenci ismi için variable oluştur ali can ata
        String ogrenciAdi = "Ali Can";
        // Stringlere verilen değerler daima " " içinde yazılmalıdır.
        //null:hiçlik içi boş obje
        //stringler için default valve (varsayılan değer) null dır

        /* char data type: tek karakter için. sayı sembol harf
        örneğin A 5 ?
        */
        //ornek2: char data type inde bir ismin ilk harfi olarak variable oluştur ve değer ata
        char isminİlkHarfi = 'S';

        //boolean data type true or false
        // soru ingilizce olacaksa başına is konur.
        //ornek3:emekli misin i.in variable oluştur false ata
        boolean emeklimisin = false;

        //byte data type tam sayılar için kullanılır hafızada 1 byte yer kaplar
        //-128den +127
        //ornek4 byte data tipinde öğrenci yaşı içi
        byte studentAge = 15;

        //short data type tam sayılar için 2 byte
        // -32768 +32767
        //ornek5:site nüfusu
        short siteNüfüsü= 1300;

        //int 4 byte yer kaplar --2.147.483.648 +2.147.483.647
        //örnek6:int tipinde ülke nüsüları
        int turkiyeNüfüsü= 80654789;

        //long data type 8byte yer kaplar
        //ornek7: insan vücudundaki hucre sayısı için
        long cellNumberİnHumanBody = 362154856635154L;

        //float data type ondalıklı sayılar için. 4 byte
        //java ondalıklı sayılar double kabul eder. f yazmak lazım.
        //ornek8: gömlek ve ayakkabı fiyatı için iki tane variable
        float gomlekFiyati = 12.99f;
        float ayakkabiFiyati = 15.99f;

        //double 8 byte yer kaplar ondalıklı kısmını için daha fazla rakam alabilir
        //ornek9:hücre agirligi ve amipin agirligi icin iki variable
        double hucreAgirligi = 0.32156488364544;
        double amipAğirligi = 0.5654845464;

        //ornek10: ogrenci notları için iki adet veriable oluştur tolamlarını ekrana yazdırın.
        byte note1 = 50;
        byte note2 = 70;

        //System.out.println(); ekrana yazdırır.
        System.out.print(note1);
        System.out.print(note2);
        //System.out.println(); ekrana yazdırır ve pointeri bir sonraki satıra koyar
        //System.out.print(); ekrana yazdırır aynı satırda tutar










    }
}
