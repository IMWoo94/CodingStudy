package problem.date_20231127;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/23234
 */
public class TheWorldResponds {
	public static void main(String[] args) {
		try (
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			bw.write("The world says hello!");
			bw.flush();

		} catch (IOException e) {

		}
	}
}
