
//Task One: Calculator in Java.
import java.util.*;

public class task1 {
    static int a, b, result, n;
    static char d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        do {
            System.out.println("Enter Your First Number:");
            a = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Your Second Number:");
            b = sc.nextInt();
            sc.nextLine();

            System.out.println("Choose Your Operation:\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    result = a + b;
                    System.out.println("The Addition of " + a + " and " + b + " is: " + result);
                    break;

                case 2:
                    result = a - b;
                    System.out.println("The Substration of " + a + " and " + b + " is: " + result);
                    break;

                case 3:
                    result = a * b;
                    System.out.println("The Multiplication of " + a + " and " + b + " is: " + result);
                    break;

                case 4:
                    result = a / b;
                    System.out.println("The Division of " + a + " and " + b + " is: " + result);
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }

            System.out.println("Do you want to continue? (y/n)");
            d = sc.nextLine().charAt(0);
            if (d == 'n' || d == 'N') {
                repeat = false;
                System.out.println("Thank you for using the calculator.");
            }

        } while (repeat);

    }
}
