package chap01.question10;

/*
    https://www.acmicpc.net/problem/2588
    (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
          4 7 2 -----(1)
        X 3 8 5 -----(2)
    -----------------
        2 3 6 0 -----(3)
      3 7 7 6   -----(4)
    1 4 1 6     -----(5)
    -----------------
    1 8 1 7 2 0 -----(6)
    (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();

		StringBuilder sb = new StringBuilder(B + "");
		StringBuilder re = sb.reverse();
		for (String temp : re.toString().split("")) {
			int num = Integer.parseInt(temp);
			System.out.println(num * A);
		}
		System.out.println(A * B);
	}
}
