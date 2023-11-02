package problem.date_20231102;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2577
 */
public class 숫자의개수 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int result = num1 * num2 * num3;

		List<Integer> list = new ArrayList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		String[] split = String.valueOf(result).split("");
		for (String s : split) {
			int number = Integer.parseInt(s);
			list.set(number, list.get(number) + 1);
		}

		for (Integer i : list) {
			System.out.println(i);
		}
	}
}
