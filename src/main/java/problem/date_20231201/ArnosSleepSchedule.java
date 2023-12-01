package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/29863
 */
public class ArnosSleepSchedule {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int sleep = Integer.parseInt(br.readLine());
			int wake = Integer.parseInt(br.readLine());
			sleep = sleep >= 20 ? 24 - sleep + wake : wake - sleep;

			bw.write(sleep + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
