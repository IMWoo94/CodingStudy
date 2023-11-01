package problem.date_20231101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1546
 */
public class 평균 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		double max = 0;
		double[] scores = new double[n];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			double score = Double.parseDouble(st.nextToken());
			if (max < score) {
				max = score;
			}
			scores[count] = score;
			count++;
		}

		reScore(scores, max);
		double result = average(scores);

		System.out.println(result);
	}

	private static void reScore(double[] nums, double max) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] / max * 100;
		}
	}

	private static double average(double[] nums) {
		return Arrays.stream(nums).average().orElseGet(() -> 0);
	}
}
