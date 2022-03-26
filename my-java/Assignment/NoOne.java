// Write a java program to check if a number is divisible by 7 or not?

import java.util.Scanner;

class NoOne {
    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Any Number: ");

        n = s.nextInt();
        if (n % 7 == 0) {
            System.out.println(" It is divisible by 7");
        } else {
            System.out.println(" It is not divisible by 7");
        }
    }
}

/*
 * import java.util.Scanner;
 * 
 * class NoTwo {
 * public static void main(String[] args) {
 * Scanner s = new Scanner(System.in);
 * System.out.println("Enter a number: ");
 * String num = s.nextLine();
 * 
 * int digitSum = 0;
 * 
 * for (int i = 0; i < num.length(); i++) {
 * digitSum = digitSum + num.charAt(i) - '0';
 * }
 * 
 * if (digitSum * 3 == 0) {
 * System.out.println("Given number is divisible by 3 ");
 * } else {
 * System.out.println("Given number is not divisible by 3 ");
 * }
 * }
 * }
 */