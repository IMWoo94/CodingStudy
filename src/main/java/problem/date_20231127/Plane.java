package problem.date_20231127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/8370
 */
public class Plane {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			long businessRow = Long.parseLong(st.nextToken());
			long businessSeat = Long.parseLong(st.nextToken());
			long economicRow = Long.parseLong(st.nextToken());
			long economicSeat = Long.parseLong(st.nextToken());

			long totalSeat = businessRow * businessSeat + economicRow * economicSeat;

			bw.write("" + totalSeat);
			bw.flush();

		} catch (IOException e) {

		}
	}
}
