package problem.date_20231123;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/4101
 */
public class 크냐 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))) {
			String input;
			while ((input = br.readLine()) != null && !input.equals("0 0")) {
				StringTokenizer st = new StringTokenizer(input, " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write(a > b ? "Yes" : "No");
				bw.newLine();
				bw.flush();
			}

		} catch (IOException e) {

		}
	}
}
