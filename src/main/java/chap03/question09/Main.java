package chap03.question09;

/*
	https://www.acmicpc.net/problem/10952
	A+B -5
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

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			while (true) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				int result = A + B;
				if (result == 0) {
					break;
				}
				bw.write(result + "\n");
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
