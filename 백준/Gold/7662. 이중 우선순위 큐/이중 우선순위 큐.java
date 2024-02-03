import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			int T = Integer.parseInt(br.readLine());
			while (T > 0) {
				int K = Integer.parseInt(br.readLine());
				TreeMap<Integer, Integer> q = new TreeMap<>();
				for (int i = 0; i < K; i++) {
					StringTokenizer st = new StringTokenizer(br.readLine(), " ");
					String op = st.nextToken();
					int num = Integer.parseInt(st.nextToken());
					if (op.equals("I")) {
						q.put(num, q.getOrDefault(num, 0) + 1);
					} else {
						if (q.isEmpty())
							continue;

						int key = num == 1 ? q.lastKey() : q.firstKey();
						if (q.put(key, q.get(key) - 1) == 1)
							q.remove(key);
					}
				}

				if (q.isEmpty()) {
					bw.write("EMPTY");
				} else {
					bw.write(q.lastKey() + " " + q.firstKey());
				}
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {

		}

	}
}
