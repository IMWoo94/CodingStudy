package chap03.question06;

/*
	https://www.acmicpc.net/problem/11021
	A+B -7
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
				bw.write("Case #" + (i + 1) + ": " + result + "\n");
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
