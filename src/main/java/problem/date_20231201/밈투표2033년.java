package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * https://www.acmicpc.net/problem/29731
 */
public class 밈투표2033년 {
	public static void main(String[] args) {
		Set<String> list = new HashSet<>() {{
			add("Never gonna give you up");
			add("Never gonna let you down");
			add("Never gonna run around and desert you");
			add("Never gonna make you cry");
			add("Never gonna say goodbye");
			add("Never gonna tell a lie and hurt you");
			add("Never gonna stop");
		}};
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int originSize = list.size();
			int count = Integer.parseInt(br.readLine());
			for (int i = 0; i < count; i++) {
				list.add(br.readLine());
			}
			String result = originSize == list.size() ? "No" : "Yes";
			bw.write(result);
			bw.flush();
		} catch (IOException e) {

		}

	}
}
