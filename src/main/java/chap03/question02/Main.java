package chap03.question02;

/*
	https://www.acmicpc.net/problem/10950
    A + B -3
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());

		List<Integer> resultList = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int sum = A + B;
			resultList.add(sum);
		}

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			int loop = resultList.size();
			for (int i = 0; i < loop; i++) {
				bw.write(resultList.get(i) + "");
				if (i != loop - 1) {
					bw.write("\n");
				}
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
