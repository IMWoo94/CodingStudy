package problem.date_20231213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/17009
 */
public class WinnginScore {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int[] A = new int[3];
			int[] B = new int[3];
			for (int i = 0; i < 3; i++) {
				A[i] = Integer.parseInt(br.readLine()) * (3 - i);
			}
			for (int i = 0; i < 3; i++) {
				B[i] = Integer.parseInt(br.readLine()) * (3 - i);
			}
			int sumA = Arrays.stream(A).sum();
			int sumB = Arrays.stream(B).sum();
			if (sumA == sumB) {
				bw.write("T");
			} else if (sumA > sumB) {
				bw.write("A");
			} else {
				bw.write("B");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
