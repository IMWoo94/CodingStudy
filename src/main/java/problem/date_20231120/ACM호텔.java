package problem.date_20231120;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/10250
 */
public class ACM호텔 {
	public static void main(String[] args) {
		int[][] hotel;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
		) {
			int count = Integer.parseInt(br.readLine());
			for (int i = 0; i < count; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int h = Integer.parseInt(st.nextToken());
				int w = Integer.parseInt(st.nextToken());
				int guest = Integer.parseInt(st.nextToken());

				String room;

				// 층수 손님 수를 나머지를 구할때, 0 이라면 꼭대기 층을 배정한다.
				// 방의 번호는 몫
				if (guest % h == 0) {
					room = h + ((guest / h) < 10 ? "0" + (guest / h) : "" + (guest / h));
				} else {
					// 층수 손님 수를 나머지를 구할떄, 0 이 아니라면.
					// 층 수는 나머지
					// 방 수는 몫 + 1 -> 몫은 0인 경우 1호방을 사용하기 때문
					String high = "" + guest % h;
					String roomNum = ((guest / h + 1) < 10 ? "0" + (guest / h + 1) : "" + (guest / h + 1));
					room = high + roomNum;
				}

				bw.write(room);
				bw.newLine();
			}
		} catch (IOException e) {

		}
	}
}
