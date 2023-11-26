package problem.date_20231126;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 * https://www.acmicpc.net/problem/16170
 */
public class 오늘의날짜 {
	public static void main(String[] args) {
		try (
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			LocalDate today = LocalDate.now(ZoneId.of("UTC"));

			bw.write(today.getYear() + "");
			bw.newLine();
			bw.write(today.getMonthValue() + "");
			bw.newLine();
			bw.write(today.getDayOfMonth() + "");
			bw.flush();
		} catch (IOException e) {

		}
	}
}
