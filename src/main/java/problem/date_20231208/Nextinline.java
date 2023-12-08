package problem.date_20231208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/6749
 */
public class Nextinline {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int youngAge = Integer.parseInt(br.readLine());
			int middleAge = Integer.parseInt(br.readLine());
			int diff = middleAge - youngAge;
			int oldAge = middleAge + diff;

			bw.write(oldAge + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
