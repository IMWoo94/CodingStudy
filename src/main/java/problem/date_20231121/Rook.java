package problem.date_20231121;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/2393
 */
public class Rook {
	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))) {
			bw.write("  ___  ___  ___\n");
			bw.write("  | |__| |__| |\n");
			bw.write("  |           |\n");
			bw.write("   \\_________/\n");
			bw.write("    \\_______/\n");
			bw.write("     |     |\n");
			bw.write("     |     |\n");
			bw.write("     |     |\n");
			bw.write("     |     |\n");
			bw.write("     |_____|\n");
			bw.write("  __/       \\__\n");
			bw.write(" /             \\\n");
			bw.write("/_______________\\\n");

			bw.flush();
		} catch (IOException e) {

		}
	}
}
