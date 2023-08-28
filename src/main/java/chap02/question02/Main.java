package chap02.question02;

/*
    https://www.acmicpc.net/problem/9498
    시험 성적
    시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int score = Integer.parseInt(br.readLine());
		String result;
		if (score >= 90) {
			result = "A";
		} else if (score >= 80) {
			result = "B";
		} else if (score >= 70) {
			result = "C";
		} else if (score >= 60) {
			result = "D";
		} else {
			result = "F";
		}

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			bw.write(result);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
