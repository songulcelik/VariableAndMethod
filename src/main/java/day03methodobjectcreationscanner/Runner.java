package day03methodobjectcreationscanner;

public class Runner {
    public static void main(String[] args) {
        //obje olusturma
        //Constructor javada objeleri olusturmak icin kullanilan ozel bir method
        // new keywordu sifirdan yeni bir object olusturmak icin kullanilir

        //class ismi + object ismi + assigment operator + "new" keyword + Constructor
        Car               myCar              =        new               Car();

        System.out.println("myCar.model = " + myCar.model);
        System.out.println("myCar.fiyat = " + myCar.fiyat);
        myCar.hareket();
        myCar.dur();

        Student songul = new Student();
        System.out.println("songul.adress = " + songul.adress);
        System.out.println("songul.grade = " + songul.grade);
        System.out.println("songul.name = " + songul.name);
        songul.study();
        songul.feed();

    }




}
