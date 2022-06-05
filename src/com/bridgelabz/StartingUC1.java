package com.bridgelabz;
import com.bridgelabz.practicingExtra.snLadderExtra;

import java.util.Random;
public class StartingUC1 {
    public static void main(String[] args) {
        final int LADDER = 1;
        final int SNAKEBITE = 2;
        final int NOPLAY = 0;
        int positionCount = 0;
        int positionCount2 = 0;
        int checkOption = 0;
        int diceCount = 0;
        int diceCount2 = 0;

        int flag=0;
        int player;

        System.out.println("Welcome to Snake and Ladder Program on Master Branch");
        System.out.println("Initial position of the player1 is at 0");
        System.out.println("Initial position of the player2 is at 0");
        SankeAndLadder obj = new SankeAndLadder();
        obj.diceRoll();
        System.out.println("Number of times player 1 rolls the dice "+obj.diceCount);
        System.out.println("player 1 is at position "+obj.positionCount);
        System.out.println("Number of times player 2 rolls the dice "+obj.diceCount2);
        System.out.println("player 2 is position "+obj.positionCount2);
        if(obj.positionCount == 100){
            System.out.println("Player 1 won the match ");
        }else{
            System.out.println("Player 2 won the match ");
        }
    }
    void diceRoll() {


        Random random = new Random();
        while (positionCount < 100 && positionCount2 < 100) {
            if (flag % 2 == 0) {


                int dice = random.nextInt(6) + 1;

                checkOption = random.nextInt(3);
                if (checkOption == LADDER) {
                    int check100 = positionCount;
                    positionCount += dice;
                    if (positionCount > 100) {
                        positionCount = check100;
                    }
                    diceRoll();

                } else if (checkOption == NOPLAY) {
                } else {
                    positionCount -= dice;
                    if (positionCount < 0) {
                        positionCount = 0;
                    }
                }
                diceCount++;
                flag++;


            } else {
                int dice = random.nextInt(6) + 1;
                checkOption = random.nextInt(3);
                if (checkOption == LADDER) {
                    int check100 = positionCount2;
                    positionCount2 += dice;
                    if (positionCount2 > 100) {
                        positionCount2 = check100;
                    }
                    diceRoll();
                } else if (checkOption == NOPLAY) {
                } else {
                    positionCount2 -= dice;
                    if (positionCount2 < 0) {
                        positionCount2 = 0;
                    }
                }
                flag++;
                diceCount2++;
            }
        }

    }



}
