package problem.date_20231127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/17256
 */
public class 달달함이넘쳐흘러 {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int a[] = new int[3];
			String b[] = new String[3];
			int c[] = new int[3];
			StringTokenizer ast = new StringTokenizer(br.readLine(), " ");
			a[0] = Integer.parseInt(ast.nextToken());
			a[1] = Integer.parseInt(ast.nextToken());
			a[2] = Integer.parseInt(ast.nextToken());

			StringTokenizer cst = new StringTokenizer(br.readLine(), " ");
			c[0] = Integer.parseInt(cst.nextToken());
			c[1] = Integer.parseInt(cst.nextToken());
			c[2] = Integer.parseInt(cst.nextToken());

			b[0] = c[0] - a[2] + "";
			b[1] = c[1] / a[1] + "";
			b[2] = c[2] - a[0] + "";
			String result = String.join(" ", b);
			bw.write(result);
			bw.flush();

		} catch (IOException e) {

		}
	}
}
