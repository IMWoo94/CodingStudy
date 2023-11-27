package problem.date_20231127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/25372
 */
public class 성택이의은밀한비밀번호 {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = Integer.parseInt(br.readLine());
			String[] arr = new String[count];
			for (int i = 0; i < count; i++) {
				String passwd = br.readLine();
				int len = passwd.length();
				if (len >= 6 && len <= 9) {
					arr[i] = "yes";
					continue;
				}
				arr[i] = "no";
			}
			bw.write(String.join("\n", arr));
			bw.flush();

		} catch (IOException e) {

		}
	}
}
