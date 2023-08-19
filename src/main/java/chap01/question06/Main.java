package chap01.question06;

/*
    https://www.acmicpc.net/problem/10869
    사칙연산
    두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();

		add(a, b);
		substract(a, b);
		multiply(a, b);
		divide(a, b);
		remain(a, b);
	}

	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void substract(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public static void multiply(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public static void divide(int num1, int num2) {
		System.out.println(num1 / num2);
	}

	public static void remain(int num1, int num2) {
		System.out.println(num1 % num2);
	}
}
