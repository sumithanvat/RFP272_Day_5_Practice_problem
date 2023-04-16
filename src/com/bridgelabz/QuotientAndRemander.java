package com.bridgelabz;

import java.util.Scanner;

public class QuotientAndRemander {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        System.out.println("enter diviser");
        int number= input.nextInt();
        int diviser= input.nextInt();
        int Quotient = number / diviser;
        int Remender = number % diviser;
        System.out.println("Quotient of "+number+"    "+"is   "+"   "+Quotient);
        System.out.println("Remender of "+number+"    "+"is   "+"   "+Remender);
    }
}
