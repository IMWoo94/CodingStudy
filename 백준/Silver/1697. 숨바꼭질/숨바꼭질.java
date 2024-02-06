import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int[] visited = new int[100_001];
			int answer = bfs(a, b, visited);

			bw.write(answer + "");
			bw.flush();
		} catch (Exception e) {

		}

	}

	private static int bfs(int a, int b, int[] visited) {
		int time = 0;
		Queue<Integer> q = new LinkedList<>();
		q.offer(a);
		// 현재 위치의 Time 정보 등록
		visited[a] = 1;

		while (!q.isEmpty()) {
			// 현재 위치
			int n = q.poll();

			if (n == b) {
				return visited[n] - 1;
			}
			// 뒤로 한칸
			if (n - 1 >= 0 && visited[n - 1] == 0) {
				visited[n - 1] = visited[n] + 1;
				q.offer(n - 1);
			}

			// 앞으로 한칸
			if (n + 1 <= 100_000 && visited[n + 1] == 0) {
				visited[n + 1] = visited[n] + 1;
				q.offer(n + 1);
			}

			// 순간이동
			if (n * 2 <= 100_000 && visited[n * 2] == 0) {
				visited[n * 2] = visited[n] + 1;
				q.offer(n * 2);
			}
		}
		return -1;
	}

}
