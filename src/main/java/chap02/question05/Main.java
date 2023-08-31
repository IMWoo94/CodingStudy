package chap02.question05;

/*
    https://www.acmicpc.net/problem/2884
    알람 시계
    첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분을 의미한다.
	입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
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

		if (B >= 45) {
			B = B - 45;
		} else {
			if (A == 0) {
				A = 23;
			} else {
				A = A - 1;
			}
			B = B + 15;
		}

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			bw.write(A + " " + B);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
