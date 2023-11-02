package problem.date_20231102;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1152
 */
public class 단어의갯수 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		if (input.trim().length() == 0) {
			System.out.println(0);
		} else {
			String[] split = input.trim().split(" ");
			System.out.println(split.length);
		}
	}
}
