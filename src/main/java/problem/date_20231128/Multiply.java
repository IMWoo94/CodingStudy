package problem.date_20231128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/22193
 */
public class Multiply {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			br.readLine();
			BigInteger a = new BigInteger(br.readLine());
			BigInteger b = new BigInteger(br.readLine());
			BigInteger multiply = a.multiply(b);
			bw.write(multiply.toString());
			bw.flush();
		} catch (IOException e) {

		}
	}
}
