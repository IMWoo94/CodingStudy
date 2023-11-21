package problem.date_20231121;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/1809
 */
public class Moo {
	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))) {
			bw.write("(___)");
			bw.newLine();
			bw.write("(o o)____/");
			bw.newLine();
			bw.write(" @@      \\");
			bw.newLine();
			bw.write("  \\ ____,/");
			bw.newLine();
			bw.write("  //   //");
			bw.newLine();
			bw.write(" ^^   ^^");

			bw.flush();
		} catch (IOException e) {

		}
	}
}
