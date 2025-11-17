package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");

        String make = "BMW";
        String model = "530D";
        double engineSize = 3.0;
        byte gear = 3;
        short speed = (short)(gear * 20);

        System.out.println("The make is " + make);
        System.out.println("The model is " + model);
        System.out.println("The engine size is " + engineSize);

//        if (engineSize <= 1.3) {
//            System.out.println("You have a weak car");
//        }
//        else {
//            System.out.println("You have a powerful car");
//        }

       String str1 = engineSize <= 1.3 ? "You have a weak car" : "You have a powerful car";
        System.out.println(str1);
//
//        if (gear == 1) {
//            System.out.println("Suitable speed for first gear: up to 10mph");
//        } else if (gear == 2) {
//            System.out.println("Suitable speed for 2nd gear: 11 to 20mph");
//        } else if (gear == 3) {
//            System.out.println("Suitable speed for 3rd gear: 21 to 30mph");
//        } else if (gear == 4) {
//            System.out.println("Suitable speed for 4th gear: 31 to 45mph");
//        } else {
//            System.out.println("Suitable speed for 5th gear: over 45mph");
//        }

        switch(gear){
            case 1:
                System.out.println("Suitable speed for first gear: up to 10mph");
                break;
            case 2:
                System.out.println("Suitable speed for 2nd gear: 11 to 20mph");
                break;
            case 3:
                System.out.println("Suitable speed for 3rd gear: 21 to 30mph");
                break;
            case 4:
                System.out.println("Suitable speed for 4th gear: 31 to 45mph");
                break;
            case 5:
                System.out.println("Suitable speed for 5th gear: over 45mph");
                break;

        }


        int year = 1900;
        int found = 0;
        while (year <= 2000) {
            if (year % 4 == 0) {
                System.out.println(year + " is a leap year");
                found++;
                if (found == 5)
                    break;
            }
            year++;
        }

//        int[] years = new int[10];
//
//        int year = 1900;
//        int found = 0;
//        while (year <= 2000) {
//            if (year % 4 == 0) {
//                years[found] = year;
//                found++;
//                if (found == 10)
//                    break;
//            }
//            year++;
//        }
//
//        for (int i = 0; i < years.length; i++) {
//            System.out.println(years[i]);
//        }


    }

}


