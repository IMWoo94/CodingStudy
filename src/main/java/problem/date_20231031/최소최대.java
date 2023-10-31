package problem.date_20231031;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/10818
 */
public class 최소최대 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int min = 1000000;
		int max = -1000000;
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if (num >= max) {
				max = num;
			}
			if (num <= min) {
				min = num;
			}
		}
		// List<Integer> nums = new ArrayList<>();
		// while (st.hasMoreTokens()) {
		// 	nums.add(Integer.parseInt(st.nextToken()));
		// }
		//
		// int max = nums.stream().max(Integer::compareTo).get();
		// int min = nums.stream().min(Integer::compareTo).get();
		try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))) {
			bw.write(String.valueOf(min) + " " + String.valueOf(max));
			bw.flush();
		} catch (IOException e) {

		}
	}
}
