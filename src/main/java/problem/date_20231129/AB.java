package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/26711
 */
public class AB {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			BigInteger a = new BigInteger(br.readLine());
			BigInteger b = new BigInteger(br.readLine());
			bw.write(a.add(b).toString());
			bw.flush();
		} catch (IOException e) {

		}

	}
}
