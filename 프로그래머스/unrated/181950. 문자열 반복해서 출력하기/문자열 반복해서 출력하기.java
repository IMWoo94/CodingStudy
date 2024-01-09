import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        String resultStr = "";
        for(int i = 1; i <= n; i++){
            resultStr = resultStr + str;
        }
        
        System.out.println(resultStr);
        
    }
}