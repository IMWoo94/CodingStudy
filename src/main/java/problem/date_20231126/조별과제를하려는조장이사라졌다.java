package problem.date_20231126;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/15727
 */
public class 조별과제를하려는조장이사라졌다 {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int dis = Integer.parseInt(br.readLine());
			int count = 0;
			while (dis > 0) {
				dis -= 5;
				count++;
			}

			bw.write("" + count);
			bw.flush();
		} catch (IOException e) {

		}
	}
}
