package problem.date_20231130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/26766
 */
public class Serca {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringBuilder sb = new StringBuilder();
			sb.append(" @@@   @@@ \n"
				+ "@   @ @   @\n"
				+ "@    @    @\n"
				+ "@         @\n"
				+ " @       @ \n"
				+ "  @     @  \n"
				+ "   @   @   \n"
				+ "    @ @    \n"
				+ "     @     \n");
			int count = Integer.parseInt(br.readLine());

			bw.write(sb.toString().repeat(count));
			bw.flush();
		} catch (IOException e) {

		}

	}
}
