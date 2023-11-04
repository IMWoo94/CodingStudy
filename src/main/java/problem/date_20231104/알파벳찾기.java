package problem.date_20231104;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10809
 */
public class 알파벳찾기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))) {
            for (int i = 0; i < 26; i++) {
                char temp = (char) (97 + i);
                int index = word.indexOf(temp);
                bw.write(String.valueOf(index) + " ");
            }
            bw.flush();
        } catch (IOException e) {

        }
    }
}
