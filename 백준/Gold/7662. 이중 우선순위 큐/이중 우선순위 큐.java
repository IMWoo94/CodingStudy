import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			int T = Integer.parseInt(br.readLine());
			while (T > 0) {
				int K = Integer.parseInt(br.readLine());
				PriorityQueue<Integer> min = new PriorityQueue<>();
				PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
				Map<Integer, Integer> index = new HashMap<>();
				for (int i = 0; i < K; i++) {
					StringTokenizer st = new StringTokenizer(br.readLine(), " ");
					String op = st.nextToken();
					int num = Integer.parseInt(st.nextToken());

					if (op.equals("I")) {
						min.offer(num);
						max.offer(num);
						index.put(num, index.getOrDefault(num, 0) + 1);
					} else {
						if (index.isEmpty())
							continue;

						if (num == -1) {
							// 최솟값 제거
							removeMap(min, index);
						} else {
							// 최댓값 제거
							removeMap(max, index);
						}
					}
				}
				if (index.size() == 0)
					bw.write("EMPTY");
				else {
					int n = removeMap(max, index);
					int m = !index.isEmpty() ? removeMap(min, index) : n;
					bw.write(n + " " + m);
				}
				bw.newLine();
				T--;
			}
			bw.flush();
		} catch (Exception e) {

		}

	}

	static int removeMap(PriorityQueue<Integer> que, Map<Integer, Integer> map) {
		int num;
		while (true) {
			num = que.poll();
			int cnt = map.getOrDefault(num, 0);
			if (cnt == 0)
				continue;
			if (cnt == 1)
				map.remove(num);
			else
				map.put(num, cnt - 1);
			break;
		}
		return num;
	}

}
