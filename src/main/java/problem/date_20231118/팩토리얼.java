package problem.date_20231118;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10872
 */
public class 팩토리얼 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long result = fac(n);

		System.out.println(result);
	}

	public static long fac(int n) {
		if (n <= 0) {
			return 1;
		}
		return fac(n - 1) * n;
	}
}
