package problem.date_20231125;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/5339
 */
public class 콜센터 {
	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {

			StringBuilder sb = new StringBuilder();
			sb.append("     /~\\\n"
				+ "    ( oo|\n"
				+ "    _\\=/_\n"
				+ "   /  _  \\\n"
				+ "  //|/.\\|\\\\\n"
				+ " ||  \\ /  ||\n"
				+ "============\n"
				+ "|          |\n"
				+ "|          |\n"
				+ "|          |");
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {

		}
	}
}
