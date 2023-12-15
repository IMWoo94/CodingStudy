package problem.date_20231215;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/6763
 */
public class Speedfinesarenotfine {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int limit = Integer.parseInt(br.readLine());
			int speed = Integer.parseInt(br.readLine());
			if (limit >= speed) {
				bw.write("Congratulations, you are within the speed limit!");
			} else {
				int s = speed - limit;
				String message = "You are speeding and your fine is $%d.";
				if (s >= 31) {
					bw.write(String.format(message, 500));
				} else if (s >= 21) {
					bw.write(String.format(message, 270));
				} else {
					bw.write(String.format(message, 100));
				}
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
