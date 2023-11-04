package problem.date_20231104;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2675
 */
public class 문자열반복 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tryCount = Integer.parseInt(br.readLine());
        List<StringTokenizer> words = new ArrayList<>();

        for (int i = 0; i < tryCount; i++) {
            words.add(new StringTokenizer(br.readLine(), " "));
        }
        wordPrint(words);
    }

    private static void wordPrint(List<StringTokenizer> words) {
        int size = words.size();
        try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))) {
            for (StringTokenizer word : words) {
                int count = Integer.parseInt(word.nextToken());
                String context = word.nextToken();
                for (char c : context.toCharArray()) {
                    bw.write(String.valueOf(c).repeat(count));
                }
                if (size > 1) {
                    bw.write("\n");
                    size--;
                }
            }
            bw.flush();
        } catch (IOException e) {

        }
    }
}
