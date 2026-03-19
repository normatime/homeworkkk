

public class Main {
    public static void main(String[] args) {

        //task 1

        byte b = 9;
        short s = 15;
        int i = 500;
        long l = 5000L;
        float fl = 10.4f;
        double d = 80.9;

        System.out.println("Значение переменной \"b\" " + "с типом \"byte\" = " + b);
        System.out.println("Значение переменной \"s\" " + "с типом \"short\" = " + s);
        System.out.println("Значение переменной \"i\" " + "с типом \"int\" = " + i);
        System.out.println("Значение переменной \"l\" " + "с типом \"long\" = " + l);
        System.out.println("Значение переменной \"fl\" " + "с типом \"float\" = " + fl);
        System.out.println("Значение переменной \"d\" " + "с типом \"double\" = " + d);


// task 2

        float f = 27.12F;
        long lon = 987678965549L;
        short sh = 569;
        short shh = -159;
        int inn = 27897;
        byte by = 67;
        double dob = 2.786;

        System.out.println(f);
        System.out.println(lon);
        System.out.println(sh);
        System.out.println(shh);
        System.out.println(inn);
        System.out.println(by);
        System.out.println(dob);
// task 3

        int ludmila = 23;
        int anna = 27;
        int ekaterina = 30;

        int paper = 480;
        int students = ludmila + anna + ekaterina;
        int perPupil = paper / students;
        System.out.println("На каждого ученика расчитано " + perPupil + " листов бумаги.");


//task 4 //task number 4

        double oneBottle = 2 / 16d;
        System.out.println("За " + oneBottle + " сек. машина поризводит одну бутылку.");

        double twentyMin = 20 / oneBottle;
        System.out.println("За 20 минут машина произвела " + twentyMin + " бутылок.");

        double dayOfWork = 1440 / oneBottle;
        System.out.println("За сутки машина произвела " + dayOfWork + " бутылок.");

        double threeDaysOfWork = 4320 / oneBottle;
        System.out.println("За 3 дня машина произвела " + threeDaysOfWork + " бутылок.");

        double monthOfWork = 44640 / oneBottle;
        System.out.println("За месяц машина произвела " + monthOfWork + " бутылок.");


//task 5

        int totalCans = 120;
        int cansWhitePerClass = 2;
        int cansBrownPerClass = 4;
        int totalClasses = totalCans / (cansWhitePerClass + cansBrownPerClass);
        int totalWhitePaint = cansWhitePerClass * totalClasses;
        int totalBrownPaint = cansBrownPerClass * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");


        //task 6


        /*
          Бананы — 5 штук (1 банан — 80 грамм).
 Молоко — 200 мл (100 мл = 105 грамм).
 Мороженое-пломбир — 2 брикета по 100 грамм.
 Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
         */

        double bananasFive = 5 * 0.08;
        double milk200 = 2 * 0.105;
        double iceCream = 2 * 0.1;
        double eggs = 4 * 0.07;
        double allInKg = bananasFive + milk200 + iceCream + eggs;
        System.out.println("weight all products in KG: " + allInKg + " kg");
        double allInGrams = allInKg * 1000;
        System.out.println("weight all products in GR: " + allInGrams + " gr");

        // task 7
        double sevenKgOf250 = 7 / 0.25;

        double sevenKgOf500 = 7 / 0.5;
        double theAverageValue = (sevenKgOf250 + sevenKgOf500) / 2;

        System.out.println("В среднем дней для результата от похудения может потребоваться " + theAverageValue);



//task 8

        /*
        Маша получает 67 760 рублей в месяц.
Денис получает 83 690 рублей в месяц.
Кристина получает 76 230 рублей в месяц.
         */


        double salaryMaria = 67760;
        salaryMaria = salaryMaria * (1 + 0.10);

        double salaryDenis = 83690;
        salaryDenis = salaryDenis * (1 + 0.10);

        double salaryKristina = 76230;
        salaryKristina = salaryKristina * (1 + 0.10);

        double differenceMaria = (salaryMaria * 12) - (67760 * 12);

        double differenceDenis = (salaryDenis * 12) - (83690 * 12);

        double differenceKristina = (salaryKristina * 12) - (76230 * 12);

        System.out.println("Маша теперь получает " + salaryMaria + " рублей. Годовой доход вырос на " + differenceMaria + " рублей");

        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");

        System.out.println("Кристина теперь получает " + salaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");
    }
}
