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
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(br.readLine());
			int INF = Integer.MAX_VALUE;

			boolean[] visited = new boolean[V + 1];
			int[] dist = new int[V + 1];
			List<Node3>[] list = new List[V + 1];
			Arrays.fill(dist, INF);
			for (int i = 1; i <= V; i++) {
				list[i] = new ArrayList<>();
			}

			for (int i = 0; i < E; i++) {
				StringTokenizer temp = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(temp.nextToken());
				int b = Integer.parseInt(temp.nextToken());
				int cost = Integer.parseInt(temp.nextToken());

				list[a].add(new Node3(b, cost));
			}

			// 우선 순위 큐를 사용해서 연결되어 있는 간선에서 최소 비용의 간선을 찾아낸다.
			PriorityQueue<Node3> queue = new PriorityQueue<>(((o1, o2) -> o1.cost - o2.cost));
			dist[start] = 0;
			queue.add(new Node3(start, 0));

			while (!queue.isEmpty()) {
				// 현재 방문 노드
				Node3 curr = queue.poll();

				if (visited[curr.end])
					continue;
				// 방문 처리
				visited[curr.end] = true;

				// 즉, 현재 노드가 갈 수 있는 모든 노드를 다 돌아본다.
				for (int i = 0; i < list[curr.end].size(); i++) {
					Node3 next = list[curr.end].get(i);
					// next 지점을 방문 하지 않았어야 하며
					// 현재 가중치 + 해당 정점으로 향하는 가중치 값 < 해당 점정으로의 최단 경로의 값
					if (!visited[next.end] && curr.cost + next.cost < dist[next.end]) {
						// 해당 정점으로 최단 경로 값 update
						dist[next.end] = curr.cost + next.cost;
						// 다음으로 방문 해야 하니깐 queue 등록
						queue.add(new Node3(next.end, dist[next.end]));
					}
				}
			}

			for (int i = 1; i < dist.length; i++) {
				if (dist[i] == INF) {
					bw.write("INF");
					bw.newLine();
				} else {
					bw.write(dist[i] + "");
					bw.newLine();
				}
			}
			bw.flush();
		} catch (Exception e) {

		}

	}

}

class Node3 implements Comparable<Node3> {
	int end, cost;

	public Node3(int end, int cost) {
		this.end = end;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node3 o) {
		return this.cost - o.cost;
	}
}
