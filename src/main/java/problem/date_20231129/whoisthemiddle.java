package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/6840
 */
public class whoisthemiddle {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int[] arr = new int[3];
			arr[0] = Integer.parseInt(br.readLine());
			arr[1] = Integer.parseInt(br.readLine());
			arr[2] = Integer.parseInt(br.readLine());

			int[] array = Arrays.stream(arr).sorted().toArray();

			bw.write(array[1] + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
