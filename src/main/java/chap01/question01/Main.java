package chap01.question01;

/*
    https://www.acmicpc.net/problem/2557
    Hello World
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args){
        // 1. System.out.println 사용
        System.out.println("Hello World!");

        // 2. StringBuilder, StringBuffer 사용
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hello World!");
        System.out.println(sb1.toString());

        StringBuffer sb2 = new StringBuffer();
        sb2.append("Hello World!");
        System.out.println(sb2.toString());

        // 3. BufferedWriter 사용
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
            bw.write("Hello World!");
            bw.flush();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
