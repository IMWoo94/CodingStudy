package problem.date_20231101;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2742
 */
public class 기찍N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))) {
			while (n > 0) {
				bw.write(String.valueOf(n--));
				bw.write("\n");
			}
			bw.flush();
		} catch (IOException e) {

		}
	}
}
