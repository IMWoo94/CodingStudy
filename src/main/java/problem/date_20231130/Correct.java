package problem.date_20231130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/26307
 */
public class Correct {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int hour = Integer.parseInt(st.nextToken());
			int minute = Integer.parseInt(st.nextToken());
			LocalTime start = LocalTime.of(9, 0);
			LocalTime end = LocalTime.of(hour, minute);

			if (start.equals(end)) {
				bw.write("0");
			} else {
				int startM = start.getHour() * 60 + start.getMinute();
				int endM = end.getHour() * 60 + end.getMinute();
				bw.write(endM - startM + "");
			}

			bw.flush();
		} catch (IOException e) {

		}

	}
}
