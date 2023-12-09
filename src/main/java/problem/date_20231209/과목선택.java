package problem.date_20231209;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/11948
 */
public class 과목선택 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int science[] = new int[4];
			int society[] = new int[2];
			for (int i = 0; i < science.length; i++) {
				science[i] = Integer.parseInt(br.readLine());
			}
			for (int i = 0; i < society.length; i++) {
				society[i] = Integer.parseInt(br.readLine());
			}

			int total = Arrays.stream(science).sum();
			int min = Arrays.stream(science).min().orElseGet(() -> 0);
			int max = Arrays.stream(society).max().orElseGet(() -> 0);
			int sum = total - min + max;

			bw.write(sum + "");
			bw.flush();

		} catch (IOException e) {

		}

	}
}
