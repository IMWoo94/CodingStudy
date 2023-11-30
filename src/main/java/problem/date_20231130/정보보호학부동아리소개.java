package problem.date_20231130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.acmicpc.net/problem/28691
 */
public class 정보보호학부동아리소개 {
	public static void main(String[] args) {
		Map<String, String> names = new HashMap<>() {{
			put("M", "MatKor");
			put("W", "WiCys");
			put("C", "CyKor");
			put("A", "AlKor");
			put("$", "$clear");
		}};
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String input = br.readLine();
			bw.write(names.get(input));
			bw.flush();
		} catch (IOException e) {

		}

	}
}
