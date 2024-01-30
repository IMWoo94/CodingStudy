import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		// 가장 많은 회의실을 배정하는 것
		// 가장 많은 회의실을 배정하기 위해서는 종료시간이 빨라야 한다.
		// 종료시간으로 오름차순 정렬 후 차례로 돌아가면서 배정이 가능한지를 확인한다.
		// 그 결과로 최대로 배정할 수 있는 값이 나오게 된다.
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			int total = Integer.parseInt(br.readLine());
			List<List<Integer>> meet = new ArrayList<>();
			for (int i = 0; i < total; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				List<Integer> temp = new ArrayList<>();
				temp.add(Integer.parseInt(st.nextToken()));
				temp.add(Integer.parseInt(st.nextToken()));
				meet.add(temp);
			}

			// 종료 시간을 기준으로 오름차순 정렬
			meet.sort((o1, o2) -> {
				int a = o1.get(1);
				int b = o2.get(1);
				if (a > b) {
					return 1;
				} else if (a == b) {
					return o1.get(0) - o2.get(0);
				} else {
					return -1;
				}

			});

			List<List<Integer>> res = new ArrayList<>();
			for (List<Integer> l : meet) {
				if (res.isEmpty()) {
					res.add(l);
				} else {
					int index = res.size() - 1;
					List<Integer> pre = res.get(index);
					if (pre.get(1) <= l.get(0)) {
						res.add(l);
					}
				}
			}

			int answer = res.size();
			bw.write(answer + "");
			bw.flush();
		} catch (Exception e) {

		}
	}
}
