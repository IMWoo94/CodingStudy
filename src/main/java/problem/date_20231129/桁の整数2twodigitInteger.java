package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/27331
 */
public class 桁の整数2twodigitInteger {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String result = br.readLine() + br.readLine();
			bw.write(Integer.parseInt(result) + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
