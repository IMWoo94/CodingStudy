package problem.date_20231202;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2845
 */
public class 파티가끝나고난뒤 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer people = new StringTokenizer(br.readLine(), " ");
			int answer = Integer.parseInt(people.nextToken()) * Integer.parseInt(people.nextToken());
			StringTokenizer news = new StringTokenizer(br.readLine(), " ");
			while (news.hasMoreTokens()) {
				bw.write(Integer.parseInt(news.nextToken()) - answer + " ");
			}

			bw.flush();
		} catch (IOException e) {

		}

	}
}
