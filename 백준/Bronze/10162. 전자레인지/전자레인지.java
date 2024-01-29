import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 전자레인지를 돌리기 위해서 최소 버튼을 구해야한다.
		// 해당 문제도 가장 큰 값을 먼저 누르고 이후 다음 단위를 누르면서 처리하면 최소 이다.
		// 즉 내림차순으로 처리하면 된다.
		List<Integer> buttons = List.of(300, 60, 10);

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			int timer = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < buttons.size(); i++) {
				int second = buttons.get(i);
				sb.append(timer / second).append(" ");
				timer = timer % second;
			}

			if (timer != 0) {
				bw.write(-1 + "");
			} else {
				bw.write(sb.toString());
			}

			bw.flush();
		} catch (Exception e) {

		}
	}
}
