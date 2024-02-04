import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			int n = Integer.parseInt(br.readLine());
			int answer = 0;
			if (n < 100) {
				bw.write(n + "");
				bw.flush();
				return;
			}
			answer += 99;
			for (int i = 100; i <= n; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				if ((hun - ten) == (ten - one)) {
					answer++;
				}
			}
			bw.write(answer + "");
			bw.flush();

		} catch (Exception e) {

		}

	}
}
