package problem.date_20231031;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://www.acmicpc.net/problem/10871
 */
public class X보다작은수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		String[] values = value.split(" ");
		int x = Integer.parseInt(values[1]);

		String arr = sc.nextLine();

		List<String> collect = Arrays.stream(arr.split(" "))
			.filter(num -> Integer.parseInt(num) < x)
			.collect(Collectors.toList());

		String join = String.join(" ", collect);

		try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))) {
			bw.write(join);
			bw.flush();
		} catch (IOException e) {

		}
	}
}
