package problem.date_20231214;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/6810
 */
public class ISBN {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			List<Integer> list = new ArrayList<>(List.of(9, 7, 8, 0, 9, 2, 1, 4, 1, 8));
			for (int i = 0; i < 3; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			int sum = 0;
			boolean flag = true;
			for (int num : list) {
				if (flag) {
					sum += num;
					flag = false;
				} else {
					sum += num * 3;
					flag = true;
				}
			}
			bw.write("The 1-3-sum is " + sum);
			bw.flush();

		} catch (IOException e) {

		}

	}
}
