import java.util.*;

class Solution {
    public int[] solution(String[] words, String[] queries) {
        Map<Integer, Trie> map = new HashMap<>();
        Map<Integer, Trie> reverseMap = new HashMap<>();
        
        for(String str : words){
            map.putIfAbsent(str.length(), new Trie());
            reverseMap.putIfAbsent(str.length(), new Trie());
            insert(str, map.get(str.length()));
            insert(new StringBuilder(str).reverse().toString(), reverseMap.get(str.length()));
        }
        
        int size = queries.length;
        int[] answer = new int[size];
        for(int i = 0; i < size; i++){
            String find = queries[i];
            int wc = 0;
            
            // 자리수가 일치하는지 확인
            if(map.containsKey(find.length())){
                if(find.charAt(0) == '?'){
                    // reverseMap 탐색
                    wc = count(new StringBuilder(find).reverse().toString(), reverseMap.get(find.length()), 0);
                }else{
                    // map 탐색
                    wc = count(find, map.get(find.length()), 0);
                }
            }
            
            answer[i] = wc;
        }
        
        
        return answer;
    }
    
    class Trie {
        // 알파벳 소문자
        Trie[] next = new Trie[26];
        int childCount = 0;
    }
    
    private void insert(String str, Trie node){
        node.childCount++;
        
        for(char c : str.toCharArray()){
            if(node.next[c - 'a'] == null)
                node.next[c - 'a'] = new Trie();
            
            node = node.next[c - 'a'];
            node.childCount++;
        }
    }
    
    private int count(String str, Trie node, int idx){
        char c = str.charAt(idx);
        
        if(c == '?'){
            return node.childCount;
        }
        
        if(node.next[c - 'a'] == null){
            return 0;
        }
        
        return count(str, node.next[c - 'a'], idx + 1);
    }
}