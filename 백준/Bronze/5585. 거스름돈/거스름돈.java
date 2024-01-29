import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 잔돈을 제공하지만, 최대한의 동전의 갯수로 전달하고자 한다.
		// 이 과정에서 그리디 과정을 사용한다면 정렬은 가장 큰 동전 부터 채워 나가면 가장 적게 전달할 수 있다.
		// 거스름돈 동전을 내림차순으로 하여서 잔돈의 갯수를 맞춰 보자.
		List<Integer> coins = Arrays.asList(500, 100, 50, 10, 5, 1);
		int price = 1000;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			int consumer = Integer.parseInt(br.readLine());
			int remind = price - consumer;
			int count = 0;
			if (remind <= 0) {
				bw.write(0 + "");
				bw.flush();
				return;
			}

			for (int coin : coins) {
				count += remind / coin;
                remind = remind % coin;
			}
			bw.write(count + "");
			bw.flush();
		} catch (Exception e) {

		}
	}
}
