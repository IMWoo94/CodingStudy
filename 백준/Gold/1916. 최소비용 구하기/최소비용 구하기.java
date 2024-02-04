import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			// 노드의 갯수
			int n = Integer.parseInt(br.readLine());
			// 간선의 갯수
			int m = Integer.parseInt(br.readLine());

			// 버스 방문 여부
			boolean[] visited = new boolean[n + 1];
			// 최소 비용을 만들어 갈 저장소
			int[] dist = new int[n + 1];
			int INF = Integer.MAX_VALUE;
			// 최소 비용 초기화
			Arrays.fill(dist, INF);

			// 간선 정보를 주입
			List<Bus>[] busStop = new List[n + 1];
			for (int i = 0; i < busStop.length; i++) {
				busStop[i] = new ArrayList<>();
			}

			for (int i = 0; i < m; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				int cost = Integer.parseInt(st.nextToken());
				busStop[start].add(new Bus(end, cost));
			}

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			// 출발 버스정류쟝
			int start = Integer.parseInt(st.nextToken());
			// 도착지 버스정류장
			int end = Integer.parseInt(st.nextToken());

			// 다익스트라 알고리즘 적용 시작
			PriorityQueue<Bus> q = new PriorityQueue<>();
			q.offer(new Bus(start, 0));
			dist[start] = 0;

			while (!q.isEmpty()) {
				Bus nowBus = q.poll();

				// 도착 지점에 도달한 경우 cost 가 가장 적은 비용
				if (nowBus.nowState == end) {
					bw.write(nowBus.totalCost + "");
					break;
				}
				// 방문 처리
				if (!visited[nowBus.nowState]) {
					visited[nowBus.nowState] = true;
				}

				for (int i = 0; i < busStop[nowBus.nowState].size(); i++) {
					Bus nextBus = busStop[nowBus.nowState].get(i);
					int cost = nowBus.totalCost + nextBus.totalCost;
					if (!visited[nextBus.nowState] && cost < dist[nextBus.nowState]) {
						dist[nextBus.nowState] = cost;
						q.offer(new Bus(nextBus.nowState, dist[nextBus.nowState]));
					}
				}
			}

			bw.flush();
		} catch (Exception e) {

		}

	}

}

class Bus implements Comparable<Bus> {
	int nowState;
	int totalCost;

	public Bus(int nowState, int totalCost) {
		this.nowState = nowState;
		this.totalCost = totalCost;
	}

	@Override
	public int compareTo(Bus o) {
		return this.totalCost - o.totalCost;
	}
}
