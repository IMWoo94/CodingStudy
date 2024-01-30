import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		// N 개의 동전이 존재하고, 주어진 값을 최소한의 동전으로 값을 만들어낸다.
		// 동전을 오름차순으로 돌아가면서 차감하면서 처리 하면 될듯.
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			int[] coins = new int[N];
			for (int i = 0; i < N; i++) {
				coins[i] = Integer.parseInt(br.readLine());
			}

			int[] array = Arrays.stream(coins).mapToObj(Integer::valueOf).sorted(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					if (o1 > o2) {
						return -1;
					} else if (o1 == o2) {
						return 0;
					} else {
						return 1;
					}
				}
			}).mapToInt(Integer::intValue).toArray();

			int count = 0;
			for (int coin : array) {
				count += K / coin;
				K = K % coin;
			}

			bw.write(count + "");
			bw.flush();

		} catch (Exception e) {

		}
	}
}
