package chap03.question01;

/*
	https://www.acmicpc.net/problem/2739
    구구단
    N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = Integer.parseInt(br.readLine());

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			for (int i = 1; i < 10; i++) {
				bw.write(result + " * " + i + " = " + (result * i));
				if (i != 9) {
					bw.write("\n");
				}
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
