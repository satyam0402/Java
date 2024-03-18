import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        sum();

         int ans = sum2();
         System.out.println("Ans is : " + ans);

    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Num 1 : ");
        int num1 = in.nextInt();

        System.out.print("Num 2 : ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);


    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Num 1 : ");
        int num1 = in.nextInt();

        System.out.print("Num 2 : ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;

    }
}