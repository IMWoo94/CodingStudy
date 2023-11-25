package problem.date_20231125;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/5337
 */
public class 웰컴 {
	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {

			bw.write(".  .   .");
			bw.newLine();
			bw.write("|  | _ | _. _ ._ _  _");
			bw.newLine();
			bw.write("|/\\|(/.|(_.(_)[ | )(/.\n");
			bw.flush();
		} catch (IOException e) {

		}
	}
}
