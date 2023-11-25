package problem.date_20231125;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/5338
 */
public class 마이크로소프트로고 {
	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {

			bw.write("       _.-;;-._");
			bw.newLine();
			bw.write("'-..-'|   ||   |");
			bw.newLine();
			bw.write("'-..-'|_.-;;-._|");
			bw.newLine();
			bw.write("'-..-'|   ||   |");
			bw.newLine();
			bw.write("'-..-'|_.-''-._|");
			bw.flush();
		} catch (IOException e) {

		}
	}
}
