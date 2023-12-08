package problem.date_20231208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/5717
 */
public class 상근이의친구들 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			while (true) {
				String friend = br.readLine();
				if (friend.equals("0 0"))
					break;

				StringTokenizer st = new StringTokenizer(friend, " ");
				int m = Integer.parseInt(st.nextToken());
				int f = Integer.parseInt(st.nextToken());
				bw.write(m + f + "");
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
