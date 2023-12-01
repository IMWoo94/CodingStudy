package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/28927
 */
public class Киноманы {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer max = new StringTokenizer(br.readLine(), " ");
			StringTokenizer mel = new StringTokenizer(br.readLine(), " ");
			int maxSum = Integer.parseInt(max.nextToken()) * 3
				+ Integer.parseInt(max.nextToken()) * 20
				+ Integer.parseInt(max.nextToken()) * 120;
			int melSum = Integer.parseInt(mel.nextToken()) * 3
				+ Integer.parseInt(mel.nextToken()) * 20
				+ Integer.parseInt(mel.nextToken()) * 120;

			if (maxSum == melSum) {
				bw.write("Draw");
			} else if (maxSum > melSum) {
				bw.write("Max");
			} else {
				bw.write("Mel");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
