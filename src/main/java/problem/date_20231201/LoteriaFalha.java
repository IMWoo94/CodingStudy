package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/30664
 */
public class LoteriaFalha {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			while (true) {
				String input = br.readLine();
				if (input.equals("0")) {
					break;
				}
				BigInteger num = new BigInteger(input);
				BigInteger mod = num.mod(new BigInteger("42"));
				if (mod.toString().equals("0")) {
					bw.write("PREMIADO\n");
				} else {
					bw.write("TENTE NOVAMENTE\n");
				}
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
