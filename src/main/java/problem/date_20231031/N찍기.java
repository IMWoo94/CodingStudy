package problem.date_20231031;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2741
 */
public class N찍기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));) {
			for (int i = 1; i <= n; i++) {
				bw.write(String.valueOf(i));
				bw.write("\n");
			}
			bw.flush();
		} catch (IOException e) {

		}
	}
}
