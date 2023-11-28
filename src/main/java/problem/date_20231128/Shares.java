package problem.date_20231128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/3733
 */
public class Shares {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String input;
			while ((input = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(input, " ");
				int person = Integer.parseInt(st.nextToken()) + 1;
				int total = Integer.parseInt(st.nextToken());

				int result = total / person;
				bw.write(result + "");
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {

		}
	}
}
