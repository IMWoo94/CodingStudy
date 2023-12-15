package problem.date_20231215;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/25640
 */
public class MBTI {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String my = br.readLine();
			int people = Integer.parseInt(br.readLine());
			int count = 0;
			for (int i = 0; i < people; i++) {
				if (my.equals(br.readLine())) {
					count++;
				}
			}
			bw.write(count + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
