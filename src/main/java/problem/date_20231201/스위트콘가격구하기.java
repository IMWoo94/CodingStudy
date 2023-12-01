package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/30030
 */
public class 스위트콘가격구하기 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int price = Integer.parseInt(br.readLine());
			int origin = 10 * price / 11;
			bw.write(origin + "");
			bw.flush();

		} catch (IOException e) {

		}

	}
}
