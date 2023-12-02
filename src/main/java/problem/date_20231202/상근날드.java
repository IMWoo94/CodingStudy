package problem.date_20231202;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/5543
 */
public class 상근날드 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int[] burger = new int[3];
			int[] drink = new int[2];
			int burgerPrice = 0;
			int drinkPrice = 0;

			for (int i = 0; i < burger.length; i++) {
				burger[i] = Integer.parseInt(br.readLine());
			}
			for (int i = 0; i < drink.length; i++) {
				drink[i] = Integer.parseInt(br.readLine());
			}

			burgerPrice = Arrays.stream(burger).min().getAsInt();
			drinkPrice = Arrays.stream(drink).min().getAsInt();

			bw.write(burgerPrice + drinkPrice - 50 + "");
			bw.flush();

		} catch (IOException e) {

		}

	}
}
