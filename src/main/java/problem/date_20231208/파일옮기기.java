package problem.date_20231208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11943
 */
public class 파일옮기기 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer one = new StringTokenizer(br.readLine(), " ");
			StringTokenizer two = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(one.nextToken());
			int B = Integer.parseInt(one.nextToken());

			int C = Integer.parseInt(two.nextToken());
			int D = Integer.parseInt(two.nextToken());

			int answer1 = A + D;
			int answer2 = B + C;
			if (answer1 > answer2) {
				bw.write(answer2 + "");
			} else {
				bw.write(answer1 + "");
			}
			bw.flush();

		} catch (IOException e) {

		}

	}
}
