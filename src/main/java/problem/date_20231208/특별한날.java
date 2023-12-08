package problem.date_20231208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDate;

/**
 * https://www.acmicpc.net/problem/10768
 */
public class 특별한날 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			LocalDate inputDate = LocalDate.of(2023, Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
			LocalDate date = LocalDate.of(2023, 2, 18);

			int result = date.compareTo(inputDate);
			if (result > 0) {
				bw.write("Before");
			} else if (result < 0) {
				bw.write("After");
			} else {
				bw.write("Special");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
