package problem.date_20231126;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/10170
 */
public class NFCWestvsNorth {

	public static void main(String[] args) {
		try (
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringBuilder sb = new StringBuilder();
			sb.append("NFC West       W   L  T\n"
				+ "-----------------------\n"
				+ "Seattle        13  3  0\n"
				+ "San Francisco  12  4  0\n"
				+ "Arizona        10  6  0\n"
				+ "St. Louis      7   9  0\n"
				+ "\n"
				+ "NFC North      W   L  T\n"
				+ "-----------------------\n"
				+ "Green Bay      8   7  1\n"
				+ "Chicago        8   8  0\n"
				+ "Detroit        7   9  0\n"
				+ "Minnesota      5  10  1");

			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {

		}
	}

}
