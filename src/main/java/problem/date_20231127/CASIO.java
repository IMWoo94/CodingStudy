package problem.date_20231127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/15963
 */
public class CASIO {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String n = st.nextToken();
			String m = st.nextToken();

			String result = n.equals(m) ? "1" : "0";
			bw.write(result);
			bw.flush();

		} catch (IOException e) {

		}
	}
}
