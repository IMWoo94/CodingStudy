package problem.date_20231102;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.acmicpc.net/problem/3052
 */
public class 나머지 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<Integer> result = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			int num = in.nextInt();
			result.add(num % 42);
		}

		System.out.println(result.size());
	}
}
