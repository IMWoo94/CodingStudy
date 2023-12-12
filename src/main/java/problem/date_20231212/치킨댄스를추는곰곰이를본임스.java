package problem.date_20231212;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/25191
 */
public class 치킨댄스를추는곰곰이를본임스 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int order = 0;
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			// 콜라는 2개당 한마리 가능 즉, 2의 몫이 주문할 수 있는 치킨 마리수
			order = B + (A / 2);

			if (order >= N) {
				order = N;
			}
			bw.write(order + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
