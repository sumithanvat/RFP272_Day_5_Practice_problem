package com.bridgelabz;

import java.util.Scanner;

public class CheckVowelsOrConsonent {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter any alphabet");
        char ch = input.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a consonent");
        } else {
            System.out.println(ch + " is not an alphabet");
        }

    }
}
