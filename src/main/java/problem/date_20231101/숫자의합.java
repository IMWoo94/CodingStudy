package problem.date_20231101;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11720
 */
public class 숫자의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String numstr = sc.next();

		String[] numarr = numstr.split("");
		int sum = Arrays.stream(numarr).mapToInt(k -> Integer.parseInt(k)).sum();
		System.out.println(sum);
	}
}
