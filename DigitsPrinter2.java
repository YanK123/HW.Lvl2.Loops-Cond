package yo;
import java.util.Scanner;
public class DigitsPrinter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        int n = 100000;

        if (x<0) {
            System.out.print("-");
        }
        for (int i = 0; i <= 5; i++) {
            System.out.print (Math.abs(x)/n % 10 + " ");
            n = n / 10;

        }
    }
}
