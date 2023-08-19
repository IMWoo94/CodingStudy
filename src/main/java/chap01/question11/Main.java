package chap01.question11;

/*
    https://www.acmicpc.net/problem/11382
    꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
    첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigInteger bA = new BigInteger(st.nextToken());
		BigInteger bB = new BigInteger(st.nextToken());
		BigInteger bC = new BigInteger(st.nextToken());
		BigInteger bAB = bA.add(bB);
		BigInteger bABC = bAB.add(bC);

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			bw.write(bABC.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
