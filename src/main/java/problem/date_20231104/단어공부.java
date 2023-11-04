package problem.date_20231104;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1157
 */
public class 단어공부 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String temp = word.toUpperCase();
        int[] arr = new int[26];
        for (char c : temp.toCharArray()) {
            int index = (int) c - 65;
            arr[index]++;
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
            } else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);

    }
}
