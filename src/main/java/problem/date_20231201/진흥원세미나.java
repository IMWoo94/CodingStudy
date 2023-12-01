package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.acmicpc.net/problem/30087
 */
public class 진흥원세미나 {
	public static void main(String[] args) {
		Map<String, String> classes = new HashMap<>() {{
			put("Algorithm", "204");
			put("DataAnalysis", "207");
			put("ArtificialIntelligence", "302");
			put("CyberSecurity", "B101");
			put("Network", "303");
			put("Startup", "501");
			put("TestStrategy", "105");
		}};
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = Integer.parseInt(br.readLine());
			for (int i = 0; i < count; i++) {
				String cla = br.readLine();
				bw.write(classes.get(cla) + "\n");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
