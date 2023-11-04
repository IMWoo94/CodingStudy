package problem.date_20231104;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2839
 */
public class 설탕가게 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        while (true) {
            if (number % 5 == 0) {
                count += number / 5;
                System.out.println(count);
                return;
            } else {
                number -= 3;
                count++;
            }

            if (number < 0) {
                System.out.println(-1);
                return;
            }
        }
    }

}
