package problem.date_20231130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/16099
 */
public class LargerSportFacility {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = Integer.parseInt(br.readLine());
			String team1 = "TelecomParisTech";
			String team2 = "Eurecom";
			for (int i = 0; i < count; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				BigInteger t1Len = new BigInteger(st.nextToken());
				BigInteger t1Wid = new BigInteger(st.nextToken());
				BigInteger t1 = t1Len.multiply(t1Wid);

				BigInteger t2Len = new BigInteger(st.nextToken());
				BigInteger t2Wid = new BigInteger(st.nextToken());
				BigInteger t2 = t2Len.multiply(t2Wid);

				if (t1.compareTo(t2) > 0) {
					bw.write(team1);
					bw.newLine();
				} else if (t1.compareTo(t2) < 0) {
					bw.write(team2);
					bw.newLine();
				} else {
					bw.write("Tie");
					bw.newLine();
				}

			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
