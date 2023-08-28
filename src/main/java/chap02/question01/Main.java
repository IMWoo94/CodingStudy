package chap02.question01;

/*
    https://www.acmicpc.net/problem/1330
    두 수 비교하기
    첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

    첫째 줄에 다음 세 가지 중 하나를 출력한다.
	A가 B보다 큰 경우에는 '>'를 출력한다.
	A가 B보다 작은 경우에는 '<'를 출력한다.
	A와 B가 같은 경우에는 '=='를 출력한다.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		String result;
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			if (A > B) {
				result = ">";
			} else if (A < B) {
				result = "<";
			} else {
				result = "==";
			}
			bw.write(result);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
