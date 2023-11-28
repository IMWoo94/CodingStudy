package problem.date_20231128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/7891
 */
public class Canyouaddthis {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = Integer.parseInt(br.readLine());
			for (int i = 0; i < count; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				BigInteger a = new BigInteger(st.nextToken());
				BigInteger b = new BigInteger(st.nextToken());
				BigInteger add = a.add(b);
				bw.write(add.toString());
				bw.newLine();
			}
			bw.flush();

		} catch (IOException e) {

		}
	}
}
