package problem.date_20231127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/8437
 */
public class Julka {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			BigInteger total = new BigInteger(br.readLine());
			BigInteger value = new BigInteger(br.readLine());
			BigInteger k = (total.add(value)).divide(BigInteger.valueOf(2));
			BigInteger n = k.subtract(value);
			bw.write(k.toString());
			bw.newLine();
			bw.write(n.toString());
			bw.flush();

		} catch (IOException e) {

		}
	}
}
