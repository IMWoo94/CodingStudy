package chap03.question05;

/*
	https://www.acmicpc.net/problem/15552
	빠른 A+B
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
		int size = Integer.parseInt(br.readLine());

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			for (int i = 0; i < size; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				int result = A + B;
				bw.write(result + "\n");
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
