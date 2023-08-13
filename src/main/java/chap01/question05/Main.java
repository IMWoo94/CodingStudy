package chap01.question05;

/*
    https://www.acmicpc.net/problem/1008
    A/B
    두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
    실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        BigDecimal ba = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        if(b == 0 ){
            System.out.println(0);
            return;
        }
        System.out.println(ba.divide(bb, 9 ,BigDecimal.ROUND_HALF_UP));

    }
}
