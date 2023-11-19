package problem.date_20231119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * https://www.acmicpc.net/problem/5597
 */
public class 과제안내신분 {
	public static void main(String[] args) throws IOException {
		int[] array = IntStream.range(1, 31).toArray();
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 28; i++) {
			String find = br.readLine();
			int findNum = Integer.parseInt(find);
			map.put(findNum, 0);
		}
		Arrays.stream(array).filter(num -> map.containsKey(num) != true).forEach(n -> System.out.println(n));
	}
}
