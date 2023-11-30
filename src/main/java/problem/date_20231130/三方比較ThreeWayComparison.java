package problem.date_20231130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/27328
 */
public class 三方比較ThreeWayComparison {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String a = br.readLine();
			String b = br.readLine();
			if (a.compareTo(b) > 0) {
				bw.write("1");
			} else if (a.compareTo(b) == 0) {
				bw.write("0");
			} else {
				bw.write("-1");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
