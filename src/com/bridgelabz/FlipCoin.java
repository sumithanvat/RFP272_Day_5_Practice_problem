package com.bridgelabz;

import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        int noHead = 0;
        int noTail = 0;
        int noFlips = Integer.parseInt(args[1]);
        Random random = new Random();

        for (int i=0;i<noFlips;i++){
            if (random.nextDouble() < 0.5){
                noHead++;
            }
            else{
                noTail++;
            }
        }
        double percentHead= (double) noHead / noFlips * 100;
        double percentTail = (double) noTail / noFlips * 100;
        System.out.println("Heads: %.2f%%\n" +percentHead);
        System.out.println("Tails: %.2f%%\n" +percentHead);
    }
}
