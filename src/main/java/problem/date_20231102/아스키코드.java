package problem.date_20231102;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11654
 */
public class 아스키코드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		char[] charArray = str.toCharArray();
		System.out.println((int)charArray[0]);

	}
}
