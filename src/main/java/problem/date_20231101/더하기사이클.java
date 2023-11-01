package problem.date_20231101;

import java.util.Scanner;

public class 더하기사이클 {
	private static int count = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		makeNumber(n, n);
		System.out.println(count);

	}

	private static void makeNumber(int num, int originNum) {
		String makeNum;
		if (num < 10) {
			makeNum = "0" + num;
		} else {
			makeNum = num + "";
		}
		String[] numArr = makeNum.split("");
		int a = Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[1]);
		a = a % 10;
		int newNum = Integer.parseInt(numArr[1] + a);
		if (newNum != originNum) {
			count++;
			makeNumber(newNum, originNum);
		}
	}
}
