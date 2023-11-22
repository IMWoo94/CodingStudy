package problem.date_20231122;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/2231
 */
public class 분해합 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
		) {
			int num = Integer.parseInt(br.readLine());
			int temp = num;
			int min = num;
			while (temp > 0) {
				temp--;
				String number = String.valueOf(temp);
				int result = temp;
				String[] split = number.split("");
				for (String s : split) {
					result += Integer.parseInt(s);
				}

				if (result == num) {
					if (min >= temp) {
						min = temp;
					}
				}
			}
			if (min == num) {
				min = 0;
			}
			bw.write(min + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
