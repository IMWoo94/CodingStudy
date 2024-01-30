import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		// - 가 나오기 전에는 + 하고 - 가 나오면 거기서 부터 다시 - 가 나올때 까지 괄호
		// 즉, - 로 나누어서 첫번째 값을 제외하고 나머지는 음수로 만들 수 있는 수
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			String eval = br.readLine();
			String[] temp = eval.split("-");
			StringBuilder sb = new StringBuilder();
			int a = 0;
			int b = 0;
			for (int i = 0; i < temp.length; i++) {
				String[] numbers = temp[i].split("\\+");
				int sum = 0;
				for (String s : numbers) {
					sum += Integer.parseInt(s);
				}

				if (i == 0) {
					a += sum;
					sb.append(temp[i]);
				} else {
					b += sum;
					sb.append("-(").append(temp[i]).append(")");
				}

			}
			// System.out.println(sb.toString());
			int answer = a - b;

			bw.write(answer + "");
			bw.flush();
		} catch (Exception e) {

		}
	}
}
