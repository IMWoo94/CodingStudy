package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/28113
 */
public class 정보섬의대중교통 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int bus = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int subway = n > b ? n : b;

			if (bus > subway) {
				bw.write("Subway");
			} else if (bus == subway) {
				bw.write("Anything");
			} else {
				bw.write("Bus");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
