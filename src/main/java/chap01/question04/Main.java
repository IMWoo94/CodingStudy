package chap01.question04;

/*
    https://www.acmicpc.net/problem/10998
    A*B
    두 정수 A와 B를 입력받은 다음, A*B를 출력하는 프로그램을 작성하시오.
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        int multiply = a*b;
        resultPrint(multiply);
    }

    public static void resultPrint(int num){
//        // 1. System.out.println 사용
//        System.out.println(num);
//
//        // 2. StringBuilder, StringBuffer 사용
//        StringBuilder sb1 = new StringBuilder();
//        sb1.append(num);
//        System.out.println(sb1.toString());
//
//        StringBuffer sb2 = new StringBuffer();
//        sb2.append(num);
//        System.out.println(sb2.toString());

        // 3. BufferedWriter 사용
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
            bw.write(num +"");
            bw.flush();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
