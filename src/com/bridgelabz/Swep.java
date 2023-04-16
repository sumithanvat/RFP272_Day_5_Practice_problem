package com.bridgelabz;

import java.util.Scanner;

public class Swep {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st number");
        int number1= input.nextInt();
        System.out.println("enter 2nd number");
        int number2= input.nextInt();
        System.out.println("before sweeping ");
        System.out.println("number1 is  :-"+number1);
        System.out.println("number2 is :-"+number2);
        int temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("After Swepping");
        System.out.println("number1 is :-"+number1);
        System.out.println("number 2 is :-"+number2);
    }
}
