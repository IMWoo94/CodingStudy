package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/30328
 */
public class JavaWarriors {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int team = Integer.parseInt(br.readLine());
			int sum = team * 4000;

			bw.write(sum + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
