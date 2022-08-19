package com.gamblingsimulatorprogram;

import java.util.Scanner;

public class GamblingSimulator {

    static int stake = 100;
    final static int dailyBet = 1;
    static final int numOfDays = 20;
    static int wins = 0;
    static int lose = 0;
    static int stakeWin = 0;
    static int stakeLose = 0;
    public static void gambler() {

        for (int i = 1; i <= numOfDays; i++) {

            int result = (int) Math.floor(Math.random() * 10 % 2);

            if (dailyBet == result) {
                System.out.println("Winner");
                stakeWin = stake + 50;
                stake = stakeWin;
                System.out.println("Day " +i+ " Stake after Win : $" +stakeWin);
                wins++;
                stakeWin++;
            } else {
                System.out.println("loser");
                stakeLose = stake - 50;
                stake = stakeLose;
                System.out.println("Day " +i+ " Stake after Losings : $" +stake);
                lose++;
                stakeLose++;
            }
        }

        System.out.println("Stake left after 20 days: $" + (stakeWin + stakeLose));
        System.out.println("Total wins in month : " +wins+ " Stake won in month : $" +stakeWin);
        System.out.println("Total loses in month : " +lose+ " Stake lose in month $: " +stakeLose);

    }
        static void askUser() {

        System.out.println("press 1 If you like to play again" );
        System.out.println("press 2 If you would like to stop gambling");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number) {
        case 1:
            gambler();
            break;
        case 2:
            System.out.println("Exit");

        }
    }
}
