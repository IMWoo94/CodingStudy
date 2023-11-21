package problem.date_20231121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1271
 */
public class 엄청난부자 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			BigInteger money = new BigInteger(st.nextToken());
			BigInteger mod = new BigInteger(st.nextToken());

			BigInteger receive = money.divide(mod);
			BigInteger remainder = money.mod(mod);
			bw.write(receive + "");
			bw.newLine();
			bw.write(remainder + "");
			bw.flush();
		} catch (IOException e) {

		}
	}
}
