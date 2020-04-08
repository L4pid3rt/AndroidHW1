public class Main {

    public static void main(String[] args) {

        byte byteValue = 100;
        short shortValue = 30000;
        int intValue = 2000000000;
        long longValue = 20000000000L;
        double doubleValue = 5.6;
        float floatValue = 12.24f;
        char val2 = '\u2242';
        boolean boolValue = true;
        String stringValue = "Hello";

        // Вызов написанных методов:
        System.out.println(multiply(2,3,5,7));

        if (checkSum(1,12)) {
            System.out.println("Сумма чисел входит в обозначенный промежуток");
        } else {
            System.out.println("Сумма чисел не входит в обозначенный промежуток");
        }

        checkValue(-45);

        printPhrase("Дмитрий");

        checkYear(1100);


    }

    static double multiply (double a, double b, double c, double d){
        return a * (b + (c / d));
    }

    static boolean checkSum (double a, double b){
        if (((a + b) >= 10) && ((a + b) <= 20) ) {
            return true;
        } else {
            return false;
        }
        /*
         idea предложила записать вот так:
        return ((a + b) >= 10) && ((a + b) <= 20);
        Но я решил оставить свой вариант, мне пока так понятней
        */
    }

    static void checkValue (int a){
        if (a >= 0){
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    static void printPhrase(String name){
        System.out.println("Привет, " + name + "!");
    }

    static void checkYear(int year){
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

}
