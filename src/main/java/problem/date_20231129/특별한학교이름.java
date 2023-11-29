package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.acmicpc.net/problem/27889
 */
public class 특별한학교이름 {
	public static void main(String[] args) {
		Map<String, String> names = new HashMap<>() {{
			put("NLCS", "North London Collegiate School");
			put("BHA", "Branksome Hall Asia");
			put("KIS", "Korea International School");
			put("SJA", "St. Johnsbury Academy");
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
