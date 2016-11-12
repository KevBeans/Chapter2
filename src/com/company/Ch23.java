package com.company;

public class Ch23 {

    public static void main(String[] args) {

        //variables
        int hour = 13;
        int minute = 40;
        int second = 30;

        //seconds since midnight
        String message1 = "Seconds since midnight: ";
        System.out.print(message1);
        System.out.println(((hour * 3600) + (minute * 60) + second));

        //seconds remaining in day
        String message2 = "Seconds remaining today: ";
        System.out.print(message2);
        System.out.println(((24 - hour) * 3600) + ((60 - minute) * 60) + (60 - second));

        //fractional variables
        double hour2 = 13.0;
        double minute2 = 40.0;
        double second2 = 30.0;
        double secinday = 86400.0;

        //percentage of day passed
        String message3 = "Fraction of day passed since midnight: ";
        System.out.print(message3);
        System.out.print((((hour2 * 3600.0) + (minute2 * 60.0) + (second2)) / secinday) * 100.0);
        System.out.println("%");

        //end variables
        int hourend = 16;
        int minuteend = 38;
        int secondend = 40;

        //elapsed time between start and finish
        String message4 = "Time taken to complete exercise: ";
        System.out.print(message4);
        System.out.print((hourend - hour) + " hours, " + (60 + (minuteend - minute)) + " minutes and " + (secondend - second) + " seconds.");
    }
}