package problem.date_20231101;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2562
 */
public class 최댓값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> nums = new ArrayList<>();
		int max = 0;
		for (int i = 0; i < 9; i++) {
			int num = sc.nextInt();
			nums.add(num);
			if (max < num) {
				max = num;
			}
		}
		try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))) {
			bw.write(String.valueOf(max) + "\n");
			bw.write(String.valueOf(nums.indexOf(max) + 1));
		} catch (IOException e) {

		}
	}
}
