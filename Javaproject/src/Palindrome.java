
import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]) {
        int n, m, a = 0, x, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        m = n;
        while (n > 0) {
            x = n % 10;
            if (x % 2 == 0) {
                sum = sum + x;
            }
            a = a * 10 + x;
            n = n / 10;
        }
        if (a == m) {

            System.out.println("Step 1 Success");
            System.out.println("Palindrome");
        } else {
            System.out.println("Step 1 fail");
            System.out.println("Not a Palindrome");
        }


        if (sum > 25) {
            System.out.println("Step 2 Success");
            System.out.println("Sum of Even numbers is greater than 25");
        }
        if (sum == 25) {
            System.out.println("Step 2 fail");
            System.out.println("Sum of Even numbers is 25");
        }
        if (sum < 25) {
            System.out.println("Step 2 fail");
            System.out.println("Sum of Even numbers is less than 25");
        }


    }
}