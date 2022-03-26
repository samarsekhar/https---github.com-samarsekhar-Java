// Write a program to check if a number is positive or not?

import java.util.Scanner;

class NoThree {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number you want to Check: ");
        n = s.nextInt();

        if (n > 0) {
            System.out.println("The given number" + n + "is Positive");
        } else if (n < 0) {
            System.out.println("The given number" + n + "is Negative");
        } else {
            System.out.println("The given number" + n + "is neither Positive nor Negative");
        }
    }
}
