package problem.date_20231202;

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
 * https://www.acmicpc.net/problem/2752
 */
public class 세수정렬 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			List<Integer> arr = new ArrayList<>();
			while (st.hasMoreTokens()) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(arr);
			arr.forEach(num -> {
				try {
					bw.write(num + " ");
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			});
			bw.flush();
		} catch (IOException e) {

		}

	}
}
