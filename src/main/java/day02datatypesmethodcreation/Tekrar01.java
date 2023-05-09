package day02datatypesmethodcreation;

public class Tekrar01 {
    public static void main(String[] args) {
        dikdortgenAlani(6,8);
        System.out.println(dikdortgenAlani(6,8));

        dikdortgenCevresi(6,8);
        System.out.println(dikdortgenCevresi(6,8));

        toplamaYap(5,3);
        System.out.println(toplamaYap(5,3));

        carpma(5,6);

        carpmaYap(3.545514445454, 6.352146655);
        System.out.println(carpmaYap(3.545514445454, 6.352146655));

        System.out.println(carpma(5,6));
    }
    private static int dikdortgenAlani (int a,int b){
        return a*b;
    }


    public static int dikdortgenCevresi (int a, int b){
        return (2*a + 2*b);
    }

    public static int toplamaYap (int a, int b) {
        return a+b;
    }
    protected static int carpma (int a, int b){
        return a*b;
    }

    private static double carpmaYap (double a, double b){
        return (a*b);
    }

    public static byte bolmeYap (byte a, byte b){
        return (byte) (a/b);
    }

}

