import java.util.Scanner;

public class GuesstheRandom {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int a = 1 + (int) (Math.random() * 99);


        int tries=0;
        boolean win=false;


        while(win==false){

            System.out.println("Guess the number");
            int n=sc.nextInt();
            tries++;

            if (n > a)
            {
                System.out.println("Number Guessed is more than original number");
                System.out.print("Random Number is");
                System.out.print(a);

            }
            else if (n < a)
            {
                System.out.println("Number Guessed is less than original number");
                System.out.print("Random Number is ");
                System.out.print(a);
                System.out.println(" ");
            }
            else
            {
                win=true;
            }


        }

        System.out.println("Number guessed matches the original number");

        System.out.print("Random Number is");
        System.out.print(a);
    }

}