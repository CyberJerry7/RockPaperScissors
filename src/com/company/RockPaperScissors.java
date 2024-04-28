package com.company;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        Random rand = new Random();

        int randNumb = rand.nextInt(25);
        int round = 1;
        int userScore = 0;
        int compScore = 0;
        boolean draw;

        int userDecisionInt;
        String userDecisionStr = " ";
        int compDecisionInt = 0;
        String compDecisionStr = " ";

        int randNum = rand.nextInt(24);
        randNum = randNum + 1;

        System.out.println("\n\t\t\t\t>>> Rock, Paper, Scissors <<<");
        System.out.println("\t\t\t\t*****************************");

        System.out.print("\n\nHey user, enter your good name: ");
        String name = scr.nextLine();
        System.out.println("\nHey "+ name+", There are 5 rounds, whoever scored the most will win!!");
        System.out.print("Enter any key to continue: ");
        String a = scr.nextLine();

        while(round<=5) {

            System.out.println("\n* Score * ");
            System.out.println("Round : " + round);
            System.out.println("1." + name + " : " + userScore);
            System.out.println("2.Computer : " + compScore);

            System.out.println("\n> Press 1 for Rock <");
            System.out.println("> Press 2 for Paper <");
            System.out.println("> Press 3 for Scissors <");
            System.out.print("\nYour Decision : ");
            userDecisionInt = scr.nextInt();

            if ((userDecisionInt > 3) || (userDecisionInt <= 0)) {
                while ((userDecisionInt > 3) || (userDecisionInt <= 0)) {

                    System.out.println("\nThere are only 3 Options!!! ");
                    System.out.println("> Press 1 for Rock <");
                    System.out.println("> Press 2 for Paper <");
                    System.out.println("> Press 3 for Scissors <");
                    System.out.print("\nYour Decision : ");
                    userDecisionInt = scr.nextInt();
                }
            }
            ;

//        user decision
            switch (userDecisionInt) {
                case 1:
                    userDecisionStr = "Rock";
                    break;

                case 2:
                    userDecisionStr = "Paper";
                    break;

                case 3:
                    userDecisionStr = "Scissors";
                    break;

                default:
                    System.out.println("Error");
            }

//      computer decision
            switch (randNumb) {
                case 1:
                case 4:
                case 7:
                case 10:
                case 13:
                case 16:
                case 19:
                case 22:
                    compDecisionStr = "Rock";
                    compDecisionInt = 1;
                    break;

                case 2:
                case 5:
                case 8:
                case 11:
                case 14:
                case 17:
                case 20:
                case 23:
                    compDecisionStr = "Paper";
                    compDecisionInt = 2;
                    break;

                case 3:
                case 6:
                case 9:
                case 12:
                case 15:
                case 18:
                case 21:
                case 24:
                    compDecisionStr = "Scissors";
                    compDecisionInt = 3;
                    break;

                default:
                    System.out.println("Error");

            }

            System.out.println("\n* Score * ");
            System.out.println("Round : " + round);
            System.out.println(name + " : " + userScore);
            System.out.println("Computer : " + compScore);
            System.out.println("\n");


            System.out.println("\n################################################\n");

            if (((userDecisionInt == 1) && (compDecisionInt == 1)) || ((userDecisionInt == 2) && (compDecisionInt == 2)) || ((userDecisionInt == 3) && (compDecisionInt == 3))) {
                draw = true;
                System.out.println(name + " : " + userDecisionStr + "  VS  " + "Computer : " + compDecisionStr);
                System.out.println("Round Draw!!!");
            }

//        rock vs paper
            else if ((userDecisionInt == 1) && (compDecisionInt == 2)) {

//            paper(2) wins!
                compScore++;

                System.out.println(name + " : " + userDecisionStr + "  VS  " + "Computer : " + compDecisionStr);
                System.out.println("Paper ate the Rock!!! Paper Won!!!");
                System.out.println("Point goes to >> Computer <<");
            } else if ((userDecisionInt == 2) && (compDecisionInt == 1)) {

//          paper(2) wins!
                userScore++;

                System.out.println(name + " : " + userDecisionStr + "  VS  " + "Computer : " + compDecisionStr);
                System.out.println("Paper ate the Rock!!! Paper Won!!!");
                System.out.println("Point goes to >> " + name + " <<");
            }

//        rock vs scissors
            else if ((userDecisionInt == 1) & (compDecisionInt == 3)) {
//            rock(1) wins!
                userScore++;

                System.out.println(name + " : " + userDecisionStr + "  VS  " + "Computer : " + compDecisionStr);
                System.out.println("Rock destroyed the Scissor!!! Rock Won!!!");
                System.out.println("Point goes to >> " + name + " <<");

            }

            else if ((userDecisionInt == 3) & (compDecisionInt == 1)) {
//            rock(1) wins!
                compScore++;

                System.out.println(name + " : " + userDecisionStr + "  VS  " + "Computer : " + compDecisionStr);
                System.out.println("Rock destroyed the Scissor!!! Rock Won!!!");
                System.out.println("Point goes to >> Computer <<");

            }

//        paper vs scissors
            else if ((userDecisionInt == 2) & (compDecisionInt == 3)) {
//            scissors(3) wins!
                compScore++;

                System.out.println(name + " : " + userDecisionStr + "  VS  " + "Computer : " + compDecisionStr);
                System.out.println("Scissor teared the Paper!!! Scissor Won!!!");
                System.out.println("Point goes to >> Computer <<");

            }

            else if ((userDecisionInt == 3) & (compDecisionInt == 2)) {
//            scissors(3) wins!
                userScore++;

                System.out.println(name + " : " + userDecisionStr + "  VS  " + "Computer : " + compDecisionStr);
                System.out.println("Scissor teared the Paper!!! Scissor Won!!!");
                System.out.println("Point goes to >> " + name + " <<");

            } else {
                System.out.println("Error!!!");
            }

            System.out.println("\n################################################\n");

            round++;
        };

        System.out.println("\n* Score * ");
        System.out.println(name + " : " + userScore);
        System.out.println("Computer : " + compScore);
        System.out.println("\n");

        if (userScore>compScore){

            System.out.println(">>>>>   " + name + " won!!!   <<<<<");
        }

        else if (userScore<compScore){

            System.out.println(">>>>>   Computer won!!!   <<<<<");
        }

        else if (userScore == compScore){

            System.out.println("Game Draw -_-");
        }

        else {
            System.out.println("Error");
        }

    };
};
