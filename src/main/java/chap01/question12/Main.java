package chap01.question12;

/*
    https://www.acmicpc.net/problem/10171
    아래 예제와 같이 고양이를 출력하시오.
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();

		sb.append("\\    /\\");
		sb.append('\n');
		sb.append(" )  ( ')");
		sb.append('\n');
		sb.append("(  /  )");
		sb.append('\n');
		sb.append(" \\(__)|");
		
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
