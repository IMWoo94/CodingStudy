package problem.date_20231210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/17362
 */
public class 수학은체육과목입니다2 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int N = Integer.parseInt(br.readLine());
			if (N % 8 == 0) {
				System.out.println(2);
			} else if (N % 4 == 3) {
				System.out.println(3);
			} else if (N % 8 == 6) {
				System.out.println(4);
			} else {
				System.out.println(N % 8);
			}
		} catch (IOException e) {

		}

	}
}
