import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			int n = Integer.parseInt(br.readLine());
			int[][] board = new int[n][n];
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int k = 0; k < n; k++) {
					board[i][k] = Integer.parseInt(st.nextToken());
				}
			}

			int answer = 0;
            if(board[n-1][n-1] == 1){
                bw.write("0");
                bw.flush();
                return;
            }
			Queue<int[]> q = new LinkedList<>();
			q.offer(new int[] {0, 0, 0});

			while (!q.isEmpty()) {
				int size = q.size();
				for (int i = 0; i < size; i++) {
					int[] temp = q.poll();
					int x = temp[0];
					int y = temp[1];
					int o = temp[2];

					// 최종 목적지 도달 가능
					if ((o == 0 && x == n - 2 && y == n - 1) ||
						(o == 1 && x == n - 1 && y == n - 2) ||
						(o == 2 && x == n - 2 && y == n - 2)
					) {
						answer++;
					}
                    
                    if(o == 0 && x + 2 >= n){
                        continue;
                    }else if(o == 1 && y + 2 >= n){
                        continue;
                    }else if(o == 2 && y + 1 >= n && x + 1 >= n){
                        continue;
                    }

					// 가로
					if (o == 0) {
						// 오른쪽
						// ((x + 2) < n) AND ((x + 2) == 빈 곳)
						if (x + 2 < n && board[y][x + 2] == 0) {
							handle(x + 1, y, o, q);

							// 오른쪽 아래 대각선
							// ((x+2) < n ) AND ((x + 2) == 빈 곳) AND ((y + 1) < n) AND (x + 2, y + 1 ) == 빈 곳 AND ( x + 1, y + 1 ) == 빈 곳
							if (y + 1 < n && board[y + 1][x + 2] == 0 && board[y + 1][x + 1] == 0) {
								handle(x + 1, y, 2, q);
							}
						}
					}
					// 세로
					else if (o == 1) {
						// 아래
						// ((y+2) < n) AND (y+2) == 빈 곳
						if (y + 2 < n && board[y + 2][x] == 0) {
							handle(x, y + 1, o, q);

							// 오른쪽 아래 대각선
							//((y+2) < n) AND (y+2) == 빈 곳 AND ((x + 1) < n) AND (x + 1, y + 1 ) == 빈 곳 AND ( x + 1, y + 2 ) == 빈 곳
							if (x + 1 < n && board[y + 1][x + 1] == 0 && board[y + 2][x + 1] == 0) {
								handle(x, y + 1, 2, q);
							}
						}
					}
					// 대각선
					else {
						// 오른쪽
						// x + 2 < n AND y + 1 < n AND (y+1, x+2) == 빈 곳
						if (x + 2 < n && y + 1 < n && board[y + 1][x + 2] == 0) {
							handle(x + 1, y + 1, 0, q);
						}

						// 아래
						// x + 1 < n AND y + 2 < n AND (y+2, x+1) == 빈 곳
						if (x + 1 < n && y + 2 < n && board[y + 2][x + 1] == 0) {
							handle(x + 1, y + 1, 1, q);
						}

						// 오른쪽 아래 대각선
						// x + 2 < n AND y + 2 < n AND (y+2, x+1 ) == 빈 곳 AND (y+2, x+2) == 빈 곳 AND (y+1, x+2) == 빈곳
						if (x + 2 < n && y + 2 < n && board[y + 2][x + 1] == 0 && board[y + 2][x + 2] == 0
							&& board[y + 1][x + 2] == 0) {
							handle(x + 1, y + 1, o, q);
						}
					}

				}
			}

			bw.write(answer + "");
			bw.flush();
		} catch (Exception e) {

		}
	}

	public static void handle(int x, int y, int o, Queue<int[]> q) {
		String str = x + "_" + y + "_" + o;
		q.offer(new int[] {x, y, o});
	}

}
