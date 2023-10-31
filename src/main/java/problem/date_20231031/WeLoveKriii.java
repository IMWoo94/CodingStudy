package problem.date_20231031;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * https://www.acmicpc.net/problem/10718
 */
public class WeLoveKriii {

	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			bw.write("강한친구 대한육군");
			bw.write("\n");
			bw.write("강한친구 대한육군");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
