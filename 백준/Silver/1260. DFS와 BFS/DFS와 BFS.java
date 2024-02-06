import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static StringBuilder dfsAns = new StringBuilder();
	public static StringBuilder bfsAns = new StringBuilder();

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int vertex = Integer.parseInt(st.nextToken());
			int edge = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());

			// 인접 행렬 생성
			// int[][] vertexes = new int[vertex + 1][vertex + 1];
			// for (int i = 0; i < edge; i++) {
			// 	StringTokenizer temp = new StringTokenizer(br.readLine(), " ");
			// 	int begin = Integer.parseInt(temp.nextToken());
			// 	int end = Integer.parseInt(temp.nextToken());
			// 	vertexes[begin][end] = 1;
			// 	vertexes[end][begin] = 1;
			// }
			// 인접 리스트 생성
			ArrayList<Integer>[] vertexes = new ArrayList[vertex + 1];
			for (int i = 0; i < vertex + 1; i++) {
				vertexes[i] = new ArrayList<>();
			}
			for (int i = 0; i < edge; i++) {
				StringTokenizer temp = new StringTokenizer(br.readLine(), " ");
				int begin = Integer.parseInt(temp.nextToken());
				int end = Integer.parseInt(temp.nextToken());
				vertexes[begin].add(end);
				vertexes[end].add(begin);
			}

			boolean[] visited = new boolean[vertex + 1];
			dfs(start, visited, vertexes);

			visited = new boolean[vertex + 1];
			bfs(start, visited, vertexes);

			bw.write(dfsAns.toString());
			bw.newLine();
			bw.write(bfsAns.toString());
			bw.flush();
		} catch (Exception e) {

		}

	}

	public static void dfs(int now, boolean[] visited, ArrayList<Integer>[] vertexes) {
		visited[now] = true;
		dfsAns.append(now).append(" ");
		ArrayList<Integer> temp = vertexes[now];
		Collections.sort(temp);
		for (int i = 0; i < temp.size(); i++) {
			int index = temp.get(i);
			if (!visited[index]) {
				dfs(index, visited, vertexes);
			}
		}
	}

	public static void bfs(int now, boolean[] visited, ArrayList<Integer>[] vertexes) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(now);
		visited[now] = true;

		while (!q.isEmpty()) {
			int start = q.poll();
			bfsAns.append(start).append(" ");

			PriorityQueue<Integer> temp = new PriorityQueue<>();
			for (int i = 0; i < vertexes[start].size(); i++) {
				int index = vertexes[start].get(i);

				if (!visited[index]) {
					temp.offer(index);
					visited[index] = true;
				}
			}
			for (int min : temp) {
				q.offer(min);
			}
		}
	}

}