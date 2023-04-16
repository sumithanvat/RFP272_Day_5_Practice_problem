package com.bridgelabz;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("factors of number"+number+"is :-");

        for (int i=2;i*i<=number;i++){
            while(number % i==0){
                System.out.println(i +"");
                number /=i;
            }
        }
        if (number>2){
            System.out.println(number);
        }
    }
}
