import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int len = a.length();
        
        String answer = "";
        if( 1 <= len && len <= 20){
            for(int i = 0; i < len; i++){
                char temp = a.charAt(i);
                if(Character.isUpperCase(temp)){
                    answer += Character.toLowerCase(temp) + "";
                }else if(Character.isLowerCase(temp)){
                    answer += Character.toUpperCase(temp) + "";
                }
            }
        }
        
        System.out.println(answer);
    }
}