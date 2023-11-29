package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.acmicpc.net/problem/28235
 */
public class 코드마스터2023 {
	public static void main(String[] args) {
		Map<String, String> names = new HashMap<>() {{
			put("SONGDO", "HIGHSCHOOL");
			put("CODE", "MASTER");
			put("2023", "0611");
			put("ALGORITHM", "CONTEST");
		}};
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			bw.write(names.get(br.readLine()));
			bw.flush();
		} catch (IOException e) {

		}

	}
}
