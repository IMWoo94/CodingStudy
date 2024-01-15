import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        int size = phone_book.length-1;
        for ( int i = 0; i < size; i++ ){
            String number = phone_book[i];
            if(phone_book[i+1].startsWith(number)){
                return false;
            }
        }
        
        return answer;
    }
}