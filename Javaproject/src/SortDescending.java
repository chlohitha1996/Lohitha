import java.util.Scanner;
public class SortDescending
{
    public static void main(String[] args) {
        int n, temp, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending: ");
        for (int i = 0; i <= n - 1; i++) {
            if (a[i] % 2 == 0) {
                sum = sum + a[i];
            }
            System.out.print(a[i] + ",");
        }
        System.out.println(a[n - 1]);


        if(sum>15){
            System.out.println("sum of even numbers : " +sum);
            System.out.println("True");
        }
        else{
            System.out.println("sum of even numbers : " +sum);
            System.out.println("False");
        }

    }


}