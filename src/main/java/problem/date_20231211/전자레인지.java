package problem.date_20231211;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/14470
 */
public class 전자레인지 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			int C = Integer.parseInt(br.readLine());
			int D = Integer.parseInt(br.readLine());
			int E = Integer.parseInt(br.readLine());
			int count = 0;
			while (A < B) {
				if (A < 0) {
					count += C;
					A++;
					continue;
				} else {
					if (A == 0) {
						count += D;
					}
					count += E;
					A++;
				}
			}

			bw.write(count + "");
			bw.flush();

		} catch (IOException e) {

		}

	}
}
