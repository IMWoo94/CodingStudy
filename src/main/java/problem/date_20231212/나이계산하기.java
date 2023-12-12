package problem.date_20231212;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/16199
 */
public class 나이계산하기 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int year1 = 0;
			int year2 = 0;
			int year3 = 0;
			StringTokenizer happyDays = new StringTokenizer(br.readLine(), " ");
			StringTokenizer days = new StringTokenizer(br.readLine(), " ");

			LocalDate birth = LocalDate.of(Integer.parseInt(happyDays.nextToken()),
				Integer.parseInt(happyDays.nextToken()), Integer.parseInt(happyDays.nextToken()));
			LocalDate today = LocalDate.of(Integer.parseInt(days.nextToken()),
				Integer.parseInt(days.nextToken()), Integer.parseInt(days.nextToken()));
			if (birth.getMonthValue() < today.getMonthValue()
				|| (birth.getMonthValue() == today.getMonthValue() && birth.getDayOfMonth() <= today.getDayOfMonth())) {
				year1 = today.getYear() - birth.getYear();
			} else {
				year1 = today.getYear() - birth.getYear() - 1;
			}
			year2 = today.getYear() - birth.getYear() + 1;
			year3 = today.getYear() - birth.getYear();

			bw.write(year1 + "\n");
			bw.write(year2 + "\n");
			bw.write(year3 + "\n");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
