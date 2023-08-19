package chap01.question13;

/*
    https://www.acmicpc.net/problem/10172
    아래 예제와 같이 개를 출력하시오.
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();

		sb.append("|\\_/|");
		sb.append('\n');
		sb.append("|q p|   /}");
		sb.append('\n');
		sb.append("( 0 )\"\"\"\\");
		sb.append('\n');
		sb.append("|\"^\"`    |");
		sb.append('\n');
		sb.append("||_/=\\\\__|");

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
