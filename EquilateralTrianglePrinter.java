package yo;

import java.util.Scanner;

public class EquilateralTrianglePrinter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number ");
        int size = scan.nextInt();


        if (size <= 0) {
            System.out.println("error");

        } else {
            String space = " ";
            String house = "^";

            for (int i = 1; i < size; i++) {
                String k = house;
                house =  k + "^^";
                int m = size;
                while (m > i) {
                    k = space + k;
                    m--;
                }
                System.out.println(k);


            }


        }

    }
}
