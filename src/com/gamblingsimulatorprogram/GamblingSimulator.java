package com.gamblingsimulatorprogram;

public class GamblingSimulator {

    int stake = 100;
    static final int dailyBet = 1;

    public static void gambler() {

        int result = (int) Math.floor(Math.random() * 10 % 2);
        if( dailyBet == result) {
            System.out.println("Winner");
        }else {
            System.out.println("loser");
        }
    }

}
