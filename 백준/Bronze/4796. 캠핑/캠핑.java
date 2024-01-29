import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		// 캠핑을 연속적으로 하기 위해서는 연속된 주기를 기반으로 count 를 하고
		// 이 후 가능한 기간을 계산 하면 되는 듯

		int index = 1;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			while (true) {
				String input = br.readLine();
				if (input.equals("0 0 0")) {
					break;
				}

				StringTokenizer st = new StringTokenizer(input, " ");
				int count = 0;
				int L = Integer.parseInt(st.nextToken());
				int P = Integer.parseInt(st.nextToken());
				int V = Integer.parseInt(st.nextToken());

				count += (V / P) * L;
				V = V % P;
				count += Math.min(V, L);

				String format = String.format("Case %d: %d", index++, count);
				bw.write(format);
				bw.newLine();
				bw.flush();
			}
		} catch (Exception e) {

		}
	}
}
