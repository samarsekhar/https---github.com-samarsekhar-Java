import java.util.Scanner;

class NoFive {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        num = s.nextInt();

        if (num > 99 && num < 1000) {
            System.out.println("It is a 3 Digit Number.");
        } else {
            System.out.println("It is Not a 3 Digit Number.");
        }
    }
}