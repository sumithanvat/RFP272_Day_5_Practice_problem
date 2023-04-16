package com.bridgelabz;

import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 4 digit year which you want to check");
        int year = input.nextInt();
        if (year<1000||year>9999){
            System.out.println("you enterd invalid year ");
        }
        if (year%4==0 && year%100!=0||year%400==0){
            System.out.println(year+" year is leep year");
        }else{
            System.out.println(year+"year is not a leep year");
        }
    }
}
