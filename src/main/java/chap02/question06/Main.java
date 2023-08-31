package chap02.question06;

/*
    https://www.acmicpc.net/problem/2525
    오븐 시계
    첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다. 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
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
		int min = Integer.parseInt(br.readLine());

		B = B + min;
		A = (B / 60) + A;
		B = B % 60;

		if (A >= 24) {
			A = A % 24;
		}

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			bw.write(A + " " + B);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
