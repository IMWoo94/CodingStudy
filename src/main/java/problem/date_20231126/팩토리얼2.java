package problem.date_20231126;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/27433
 */
public class 팩토리얼2 {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int num = Integer.parseInt(br.readLine());
			BigInteger result = pact(num);
			bw.write(result.toString());
			bw.flush();
		} catch (IOException e) {

		}
	}

	public static BigInteger pact(int num) {
		if (num <= 1) {
			return new BigInteger("1");
		}
		BigInteger big = new BigInteger(num + "");
		return big.multiply(pact(num - 1));
	}

}
