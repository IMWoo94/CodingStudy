package problem.date_20231031;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/8393
 */
public class 합 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int sum = (1 + n) * (n - 1 + 1) / 2;

		try (BufferedWriter br = new BufferedWriter(new PrintWriter(System.out))) {
			br.write(String.valueOf(sum));
			br.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
