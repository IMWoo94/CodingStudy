package chap02.question04;

/*
    https://www.acmicpc.net/problem/14681
    사분면 고르기
    점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
    단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
    첫 줄에는 정수 x가 주어진다.
    1 : +x, +y
    2 : -x, +y
    3 : -x, -y
    4 : +x, -y
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		String result;
		if (x > 0) {
			if (y > 0) {
				result = "1";
			} else {
				result = "4";
			}
		} else {
			if (y > 0) {
				result = "2";
			} else {
				result = "3";
			}
		}

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			bw.write(result);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
