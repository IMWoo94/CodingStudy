import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		// 세탁소 거스름돈 -> 이 문제도 거스름돈의 종류가 정해져 있으며, 이를 통해서 가장 적은 거스름돈을 주는 경우를 찾아야 한다.
		// 내림차순으로 거스름돈을 계산하면 문제를 해결 할수 있다.

		int[] coins = {25, 10, 5, 1};
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			int loop = Integer.parseInt(br.readLine());
			for (int i = 0; i < loop; i++) {
				StringBuilder coinsCount = new StringBuilder();
				int remind = Integer.parseInt(br.readLine());
				for (int coin : coins) {
					int count = remind / coin;
					remind = remind % coin;
					coinsCount.append(count).append(" ");
				}
				bw.write(coinsCount.toString());
				bw.flush();
			}
		} catch (Exception e) {

		}
	}
}
