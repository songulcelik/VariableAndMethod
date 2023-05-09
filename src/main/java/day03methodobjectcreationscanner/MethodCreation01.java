package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {
        double kup =getCub(5);
        System.out.println("kup = " + kup);
        print("Java is easy.");


        //method olusturmak icin 2.yol
        //ornek2: girilen bir kelimeyi ekrana yazdiran bir method olusturup kullanın
        //main icinde methodda kullanilacak variableyi yaz
        String str = "TechproEdu";
        //method ismi ve parametleri yaz
        printConsole(str);

        //verilen iki sayiyi carpan ve sonucu ekrana yazdiran methodu olusturn ve kullan
        int a = 3;
        int b = 5;
        carpmaYap(a,b);

        int x = 3;
        kareAl(x);

    }

    private static void kareAl(int x) {
        System.out.println(x*x);
    }

    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    public static void printConsole(String str) {
        System.out.println(str);
    }

    //ornek1: verilen bir ondalik sayinin kupunu hesaplayan method olustur kullan
    static double getCub (double a){
        return a*a*a;
    }

//ornek2: girilen bir kelimeyi ekrana yazdiran bir method olusturup kullanın
    public static void print(String str){
        System.out.println(str);
    }
//eger bir method yeni bir data uretiyor ise return type olur.
    //eger bir methodun return type void ise method body icinde return keyworduyazilmaz
    //access modifieri defoult yapmak isterseniz default yazmayin.
    /*
    cemberin cevresini hesaplayan methodu olusturun ve kullanın
     */




}