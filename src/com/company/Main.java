package com.company;

public class Main {

    public static void main(String[] args) {
	// Defining Variables
    String intro = "Today's date is ";
    String day = "Tuesday ";
    String date = "7th ";
    String month = "September ";
    int year = 2021;

    //American standard
    System.out.print((intro) + (day)  + (month) + (date));
    System.out.println(year);

    //European standard
    System.out.print((intro) + (day) + (date) + (month));
    System.out.println(year);
    }
}
