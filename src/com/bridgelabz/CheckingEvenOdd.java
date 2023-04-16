package com.bridgelabz;

import java.util.Scanner;

public class CheckingEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        if (number%2==0){
            System.out.println(number +"   is even number");

        }else {
            System.out.println(number+"    is odd number");
        }
    }
}
