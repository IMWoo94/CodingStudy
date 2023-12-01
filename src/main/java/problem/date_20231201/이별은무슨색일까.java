package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/30676
 */
public class 이별은무슨색일까 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int num = Integer.parseInt(br.readLine());
			String color;
			if (num < 425) {
				color = "Violet";
			} else if (num < 450) {
				color = "Indigo";
			} else if (num < 495) {
				color = "Blue";
			} else if (num < 570) {
				color = "Green";
			} else if (num < 590) {
				color = "Yellow";
			} else if (num < 620) {
				color = "Orange";
			} else {
				color = "Red";
			}
			bw.write(color);
			bw.flush();

		} catch (IOException e) {

		}

	}
}
