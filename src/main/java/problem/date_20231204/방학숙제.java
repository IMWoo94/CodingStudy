package problem.date_20231204;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/5532
 */
public class 방학숙제 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int l = Integer.parseInt(br.readLine());
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
			int d = Integer.parseInt(br.readLine());

			while (true) {
				if (a <= 0 && b <= 0) {
					break;
				}
				a = a - c;
				b = b - d;
				l--;
			}
			bw.write(l + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
