package chap03.question04;

/*
	https://www.acmicpc.net/problem/25314
	코딩은 체육과목 입니다

 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		size = size / 4;
		String result = "long ";
		result = result.repeat(size);

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			bw.write(result + "int");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
