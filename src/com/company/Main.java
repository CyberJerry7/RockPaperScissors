package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        Random rand = new Random();

        int randNumb = rand.nextInt(12);
        randNumb = randNumb+1;




//
        switch (randNumb){
            case 1 : case  4: case 7: case 10:
                System.out.println("Rock");
                break;

            case 2 : case 5 : case 8: case 11:
                System.out.println("Paper");
                break;

            case 3: case 6 : case 9: case 12:
                System.out.println("Scissors");
                break;

            default:
                System.out.println("Error");

        }


//        System.out.print("Enter number : ");
//        int n = scr.nextInt();
//
//        System.out.println(n%2);

//        for(int i=n; i>0; i--){
//            System.out.println(i);
//
//        }

    };
};