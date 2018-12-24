package yo;

import java.util.Scanner;
import java.util.Random;

public class RandomGameApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int random = rd.nextInt(101);
        System.out.println("I' ve  chosen the number. Try to guess it, u have 5 tries");
        System.out.println("Enter your answer. The number must be from 1 to 100");
        int number = sc.nextInt();
        int minNumber = 1;
        int maxNumber = 100;


        if (number <= 0 || number > 101) {
            System.out.println("Number u have entered is incorrect");

        }
            if (number >= 1 && number <= 101) {
                for (int count = 1; count <= 4 ; count++) {
                    if (number == random) {
                        System.out.println("You win!. Random number was " + random + ".");
                        break;
                    }
                    if (number > random) {
                        maxNumber = number - 5;
                        System.out.print(count + 1 + " step. Try again. Enter another number (" + minNumber + ".."
                                + maxNumber + ") :");
                        number = sc.nextInt();
                    }
                    if (number < random) {
                        minNumber = number + 5;
                        System.out.print((count + 1) + " step. Try again. Enter another number (" + minNumber + ".."
                                + maxNumber + ") :");
                        number = sc.nextInt();
                    }
                    if (number == random) {
                        System.out.println("You win!. Random number was " + random + ".");
                        break;}
                    if (count == 4) {
                        System.out.println("Game is over . Random number was " + random + ".");
                    }

                }
            }


        }
    }


