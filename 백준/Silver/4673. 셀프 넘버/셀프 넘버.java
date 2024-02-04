import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {

		boolean[] numbers = new boolean[10001];
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			for (int i = 1; i <= 10000; i++) {
				int number = i;
				int sum = i;
				while (number != 0) {
					sum += number % 10;
					number = number / 10;
				}

				if (sum <= 10000) {
					numbers[sum] = true;
				}
			}
			for (int k = 1; k <= 100000; k++) {
				if (!numbers[k]) {
					bw.write(k + "");
					bw.newLine();
				}
			}
			bw.flush();
		} catch (Exception e) {

		}

	}
}
