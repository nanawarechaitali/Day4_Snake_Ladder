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
        int dice= random.nextInt(6)+1;
        System.out.println("Player is rolling dice and get "+dice);


        checkOption = random.nextInt(3);
        if (checkOption == LADDER){
            System.out.println("player got ladder");
            positionCount += dice;
        } else if (checkOption == NOPLAY) {
            System.out.println("Player will stay at same position ");
        }else{
            System.out.println("Player got bite by the snake ");
            positionCount -= dice;
        }
        System.out.println("player is position "+positionCount);


    }
}
