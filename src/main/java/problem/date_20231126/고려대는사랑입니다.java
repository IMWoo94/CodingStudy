package problem.date_20231126;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/11942
 */
public class 고려대는사랑입니다 {
	public static void main(String[] args) {
		try (
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			bw.write("고려대학교");
			bw.flush();
		} catch (IOException e) {

		}
	}
}
