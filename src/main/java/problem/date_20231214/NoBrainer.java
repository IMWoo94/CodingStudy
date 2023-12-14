package problem.date_20231214;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/4562
 */
public class NoBrainer {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = Integer.parseInt(br.readLine());
			for (int i = 0; i < count; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int eats = Integer.parseInt(st.nextToken());
				int req = Integer.parseInt(st.nextToken());
				if (eats >= req) {
					bw.write("MMM BRAINS\n");
				} else {
					bw.write("NO BRAINS\n");
				}
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
