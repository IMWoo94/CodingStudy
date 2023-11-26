package problem.date_20231126;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/9654
 */
public class 나부함대데이터 {

	public static void main(String[] args) {
		try (
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringBuilder sb = new StringBuilder();

			sb.append("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n"
				+ "N2 Bomber      Heavy Fighter  Limited    21        \n"
				+ "J-Type 327     Light Combat   Unlimited  1         \n"
				+ "NX Cruiser     Medium Fighter Limited    18        \n"
				+ "N1 Starfighter Medium Fighter Unlimited  25        \n"
				+ "Royal Cruiser  Light Combat   Limited    4          ");
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {

		}
	}

}
