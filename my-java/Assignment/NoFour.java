//import java.io.*;

class NoFour {
    static int get_unit_digit(int i) {

        if (i == 0 || i == 1)
            return 1;
        else if (i == 2)
            return 3;
        else if (i == 3)
            return 9;

        else
            return 4;
    }

    public static void main(String[] args) {
        int i = 1;

        for (i = 0; i <= 10; i++)
            System.out.println("For i = " + i + " : " + get_unit_digit(i));
    }
}

/*
 * import javax.lo.*;
 * 
 * class NoFour {
 * 
 * // Function to find the unit's place digit
 * static int get_unit_digit(int N) {
 * 
 * // Let us write for cases when
 * // N is smaller then or equal
 * // to 4.
 * 
 * if (N == 0 || N == 1)
 * return 1;
 * else if (N == 2)
 * return 3;
 * else if (N == 3)
 * return 9;
 * 
 * // We know following
 * // (1! + 2! + 3! + 4!) % 10 = 3
 * else // (N >= 4)
 * return 3;
 * }
 * 
 * // Driver code
 * 
 * public static void main(String[] args) {
 * 
 * int N = 1;
 * 
 * for (N = 0; N <= 10; N++)
 * System.out.println("For N = " + N +
 * " : " + get_unit_digit(N));
 * }
 * }
 * 
 * 
 */