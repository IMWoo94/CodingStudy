package problem.date_20231122;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1978
 */
public class 소수찾기 {
	public static List<Integer> result = new ArrayList<>();

	public static void main(String[] args) {
		List<Integer> prime = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
		) {
			int count = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while (st.hasMoreTokens()) {
				int number = Integer.parseInt(st.nextToken());
				prime.add(number);
			}
			findPrime(prime);
			bw.write(result.size() + "");
			bw.flush();

		} catch (IOException e) {

		}
	}

	public static void findPrime(List<Integer> list) {
		Collections.sort(list);
		for (Integer i : list) {
			if (i == 2 || i == 3) {
				result.add(i);
			} else {
				int k;
				for (k = 2; k < i; k++) {
					if (i % k == 0) {
						break;
					}
				}
				if (k == i) {
					result.add(i);
				}
			}
		}

	}
}
