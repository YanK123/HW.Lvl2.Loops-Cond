package yo;

import java.util.Scanner;

public class SubstringsCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = sc.nextLine();
        System.out.println("enter word");
        String word = sc.nextLine();
        int count = 0;
        int fromIndex = 0;

        while ((fromIndex = sentence.indexOf(word, fromIndex)) != -1) {

            count++;
            fromIndex++;

        }

        System.out.println("Word Count: " + count);
    }
}


