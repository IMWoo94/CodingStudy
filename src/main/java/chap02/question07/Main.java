package chap02.question07;

/*
    https://www.acmicpc.net/problem/2480
    주사위 세개
    1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
	예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
	3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Map<Integer, Integer> map = new HashMap<>();
		int max = 0;
		for (int i = 0; i < 3; ++i) {
			int num = Integer.parseInt(st.nextToken());
			if (num > max) {
				max = num;
			}
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int size = map.size();
		if (size == 1) {
			result = 10000 + (max * 1000);
		} else if (size == 2) {
			Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
			Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
			while (iterator.hasNext()) {
				Map.Entry<Integer, Integer> entry = iterator.next();
				if (entry.getValue() == 2) {
					result = 1000 + entry.getKey() * 100;
					break;
				}
			}
		} else {
			result = max * 100;
		}

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			bw.write(result + "");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
