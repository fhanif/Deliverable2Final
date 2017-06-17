package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException { // not sure about the neccessity of the parse exceptions
        // prompts user to enter first date
        System.out.println("Enter the first date in format MM/DD/YYYY: ");
        Scanner d1 = new Scanner(System.in);
        String d1AsString = d1.next();

        // prompts user to enter second date
        System.out.println("Enter the second date in format MM/DD/YYYY: ");
        Scanner d2 = new Scanner(System.in);
        String d2AsString = d2.next();

        // sets format of date
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        // initializing string dates into date objects
        Date date1 = sdf.parse(d1AsString);
        Date date2 = sdf.parse(d2AsString);

        // finding difference (absolute value) between dates in milliseconds
        long diffinMilliseconds = Math.abs(date2.getTime() - date1.getTime());

        //intitializing calendar object & setting difference in milliseconds to the time in in milliseconds
        Calendar cal1 = Calendar.getInstance();
        cal1.setTimeInMillis(diffinMilliseconds);

        //changing time in milliseconds to individual year, month, and days
        int year = cal1.get(Calendar.YEAR) - 1970; //why only 1970 if it works for dates b/f then as well???
        int month = cal1.get(Calendar.MONTH);
        int day = cal1.get(Calendar.DATE); //is the day one day off? should I add 1????

        //priinting answers
        System.out.println("The difference between " + sdf.format(date1) + " and " + sdf.format(date2) + " is");
        System.out.println("Years: " + year);
        System.out.println("Months: " + month);
        System.out.println("Days: " + day);

    }

}

/* Task: Write a Java console application to calculate the duration between two dates in Years, Months and Days.
The user should enter two dates as input, then the program will show the result
of the difference in time between these two dates.*/
