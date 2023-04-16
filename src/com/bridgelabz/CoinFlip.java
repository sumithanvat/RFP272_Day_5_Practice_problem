package com.bridgelabz;

import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        int numFlips = Integer.parseInt(args[0]);
        int numHeads = 0, numTails = 0;
        Random rand = new Random();

        for (int i = 0; i < numFlips; i++) {
            if (rand.nextDouble() < 0.5) {
                numTails++;
            } else {
                numHeads++;
            }
        }

        double percentHeads = (double) numHeads / numFlips * 100;
        double percentTails = (double) numTails / numFlips * 100;

        System.out.printf("Heads: %.2f%%\n", percentHeads);
        System.out.printf("Tails: %.2f%%\n", percentTails);
    }
}

