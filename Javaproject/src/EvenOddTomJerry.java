import java.util.Scanner;

public class EvenOddTomJerry {

    public static void main(String[] args) {

        System.out.println("Enter a digit...");
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        if(n>19 & n<31){


            if(n%2==0)
                System.out.println("Jery");
            else
                System.out.println("Tom");

        }

        else
            System.out.println("Number is not in a range of 20 to 30");


    }
}
