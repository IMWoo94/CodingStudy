package problem.date_20231126;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/27323
 */
public class 직사각형 {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int result = a * b;
			bw.write("" + result);
			bw.flush();
		} catch (IOException e) {

		}
	}
}
