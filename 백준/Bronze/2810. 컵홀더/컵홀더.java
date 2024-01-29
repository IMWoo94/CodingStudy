import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		// 좌석의 왼쪽은 무조건 홀더가 존재한다.
		// 좌석의 마지막은 오른쪽에 홀더가 존재한다.
		// 이를 통해서 좌석의 왼쪽의 홀더 갯수 + 마지막 홀더의 갯수를 찾아낸 후 컵홀더 사용 줄여나간다.
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			int count = Integer.parseInt(br.readLine());
			int answer = count;
			String seats = br.readLine();

			int len = seats.length();
			for (int i = 0; i < len; i++) {
				if (String.valueOf(seats.charAt(i)).equals("S")) {
					count--;
				} else {
					count--;
					i++;
				}

				if (count == 0) {
					break;
				}
				// 마지막자리의 경우 오른쪽 컵홀더 사용 가능
				if (i == len - 1) {
					count--;
				}
			}
			if (count == 0) {
				bw.write(answer + "");
			} else {
				bw.write(answer - count + "");
			}
			bw.flush();

		} catch (Exception e) {

		}
	}
}
