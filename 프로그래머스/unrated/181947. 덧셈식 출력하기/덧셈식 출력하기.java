import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        if(1 <= a && a <= 100 && 1 <= b && b <= 100){
            String answer = Integer.toString(a) + " + " + Integer.toString(b) + " = " + (a + b);
            System.out.println(answer);           
        }
    }
}