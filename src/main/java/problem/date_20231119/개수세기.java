package problem.date_20231119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/10807
 */
public class 개수세기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String count = br.readLine();
		String before = br.readLine();
		String find = br.readLine();
		int result = 0;

		String[] split = before.split(" ");
		for (String s : split) {
			if (s.equals(find)) {
				result++;
			}
		}

		System.out.println(result);

		// int findSize = find.length();
		// int beforeSize = before.length();
		// String after = before.replaceAll(find, "");
		// int afterSize = after.length();
		// int size = beforeSize - afterSize;
		//
		// System.out.println(size / findSize);
	}
}
