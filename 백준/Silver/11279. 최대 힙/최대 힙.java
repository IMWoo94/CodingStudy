import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			int n = Integer.parseInt(br.readLine());
			PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
			for (int i = 0; i < n; i++) {
				int num = Integer.parseInt(br.readLine());
				if (num == 0 && !q.isEmpty()) {
					bw.write(q.poll() + "");
					bw.newLine();
				} else if (num == 0 && q.isEmpty()) {
					bw.write(0 + "");
					bw.newLine();
				} else {
					q.offer(num);
				}
			}
			bw.flush();
		} catch (Exception e) {

		}

	}

}
