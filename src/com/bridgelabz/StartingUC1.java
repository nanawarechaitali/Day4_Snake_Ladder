package com.bridgelabz;
import java.util.Random;
public class StartingUC1 {
    public static void main(String[] args) {
        final int LADDER = 1;
        final int SNAKEBITE = 2;
        final int NOPLAY = 0;
        int positionCount = 0;
        int checkOption = 0;
        System.out.println("Welcome to Snake and Ladder Program on Master Branch");
        System.out.println("Initial position of the player1 is at 0");


        Random random = new Random();
        while (positionCount < 100){
            int dice= random.nextInt(6)+1;

            checkOption = random.nextInt(3);
            if (checkOption == LADDER){
                int check100 = positionCount;
                positionCount += dice;
                if (positionCount > 100) {
                    positionCount = check100;
                }
            } else if (checkOption == NOPLAY) {
            }else{
                positionCount -= dice;
                if(positionCount < 0){
                    positionCount = 0;
                }
            }
        }
        System.out.println("player is position "+positionCount);


    }
}
