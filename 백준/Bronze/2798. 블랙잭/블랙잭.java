import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static Set<Integer> combs = new HashSet<>();

	public static void main(String[] args) {
		// 주어진 카드 정보를 통해서 3장을 합하여 주어진 값과 가까운 값 혹은 일치하는 값을 리턴
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			// 카드 수 + 블랙잭 번호 받기
			StringTokenizer config = new StringTokenizer(br.readLine(), " ");
			int cardCount = Integer.parseInt(config.nextToken());
			int blackJack = Integer.parseInt(config.nextToken());

			// 카드 정보 받기
			StringTokenizer card = new StringTokenizer(br.readLine(), " ");
			List<Integer> cards = new ArrayList<>();
			while (card.hasMoreTokens()) {
				int number = Integer.parseInt(card.nextToken());
				cards.add(number);
			}

			// 주어진 카드 3 장으로 만들 수 있는 모든 경우의 수 확인
			comb(cards);

			// 내림차순 정렬 후 최초로 blackJack 번호보다 작거나 같은 경우 리턴
			int answer = combs.stream()
				.sorted(Collections.reverseOrder())
				.mapToInt(Integer::intValue)
				.filter(n -> n <= blackJack)
				.findFirst()
				.getAsInt();

			bw.write(answer + "");
			bw.flush();

		} catch (Exception e) {

		}
	}

	public static void comb(List<Integer> cards) {
		for (int a = 0; a < cards.size() - 2; a++) {
			for (int b = a + 1; b < cards.size() - 1; b++) {
				for (int c = b + 1; c < cards.size(); c++) {
					int sum = cards.get(a) + cards.get(b) + cards.get(c);
					combs.add(sum);
				}
			}
		}
	}
}
