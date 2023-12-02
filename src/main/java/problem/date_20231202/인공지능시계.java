package problem.date_20231202;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2530
 */
public class 인공지능시계 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int hour = Integer.parseInt(st.nextToken()) * 60 * 60;
			int minute = Integer.parseInt(st.nextToken()) * 60;
			int second = Integer.parseInt(st.nextToken());
			int timer = Integer.parseInt(br.readLine());
			int result = hour + minute + second + timer;
			int answerHour = result / (60 * 60) % 24;
			int answerMin = result % (60 * 60) / 60 % 60;
			int answerSecond = result % (60 * 60) % 60 % 60;
			// LocalTime start = LocalTime.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
			// 	Integer.parseInt(st.nextToken()));
			// int timer = Integer.parseInt(br.readLine());
			// LocalTime end = start.plusSeconds(timer);

			// bw.write(end.getHour() + " " + end.getMinute() + " " + end.getSecond());
			bw.write(answerHour + " " + answerMin + " " + answerSecond);
			bw.flush();
		} catch (IOException e) {

		}

	}
}
