package chap03.question08;

/*
	https://www.acmicpc.net/problem/2439
	별 찍기 -2
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int size = Integer.parseInt(br.readLine());

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			for (int i = 0; i < size; i++) {
				sb.append(" ".repeat(size - 1 - i)).append("*".repeat(i + 1)).append("\n");
			}
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
