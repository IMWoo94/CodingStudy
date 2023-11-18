package problem.date_20231118;

import java.time.LocalDate;
import java.time.ZoneId;

/**
 * https://www.acmicpc.net/problem/10699
 */
public class 오늘날짜 {
	public static void main(String[] args) {
		System.out.println(LocalDate.now(ZoneId.systemDefault()));
	}
}
