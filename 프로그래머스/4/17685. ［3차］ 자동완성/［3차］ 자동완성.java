import java.util.*;

class Solution {
    public int solution(String[] words) {
        // 결론! 접두사가 존재하는지 확인
        // for 문을 통해서 모든 문자열에 대해서 접두사를 확인함으로써 문제를 해결할 수 있지만, 효율이 극악이며, 시간 초과 문제가 발생
        // 접두사 문자열 검색에는 2가지 방식이 사용될 수 있음
        // 1. Trie 자료 구조를 사용하는 방식
        // 2. 전체 단어를 사전 순으로 정렬한다면, 어떤 단어와 앞부분이 가장 많이 일치하는 단어는 정렬 후 인접한 두 단어 중 하나.
        
        int answer = 0;
        int size = words.length;
        
        // 1. Trie 자료 구조 방식
        answer = trieSolution(words, size);
        
        // 2. 정렬 방식
       // answer = sortSolution(words, size);
    
        return answer;
    }
    static int trieSolution(String[] words, int size){
        int count = 0;
        Trie myTrie = new Trie();
        for(int i = 0; i < size; i++){
            myTrie.insert(words[i]);
        }
        // System.out.println(myTrie);
        
        for(String str : words){
            count += myTrie.getMinInputCount(str);
        }
        
        return count;
    }
    
    static int sortSolution(String[] words, int size){
        int[] counts = new int[size];
        // 사전 순으로 정렬하여 인접 문자열만 확인
        Arrays.sort(words);
        
        for( int i = 0; i < size -1 ; i++ ){
            String pre = words[i];
            String next = words[i+1];
            // 두 문자 중 짧은 길이
            int len = Math.min(pre.length(), next.length());
            int sameCount = getCount(pre, next, len);
            
            // len == sameCount 것은 긴 문자가 짧은 문자를 prefix 로 포함한다는 의미로 전체를 다 입력해야 한다.
            if ( sameCount == len ){
                counts[i] = Math.max(counts[i], sameCount);
            }else{
                counts[i] = Math.max(counts[i], sameCount + 1);
            }
            counts[i + 1] = Math.max(counts[i + 1], sameCount + 1);
            
        }
        
        return (int)Arrays.stream(counts).sum();
    }
    
    static int getCount(String pre, String next, int len){
        int count = 0;
        for ( int j = 0; j < len; j++ ){
            if(pre.charAt(j) != next.charAt(j)){
                return count;
            }
            count++;
        }
        return count;
    }
}
class TrieNode{
    // 하위 문자
    public Map<Character, TrieNode> childNodes = new HashMap<>();
    public int count; // 하위 단어 수
    public boolean isLast; // 마지막 ( 리프 노드 )
    public String uuid = UUID.randomUUID().toString();
    
    @Override
    public String toString(){
        return uuid + "( child : [ " + childNodes + " ] | current : " + " count : " + count + " last : " + isLast + " )";
    }
}
class Trie{
    TrieNode root;
    Trie(){
        root = new TrieNode();
    }
    
    void insert(String word){
        TrieNode node = this.root;
        
        int size = word.length();
        // 첫번째 문자부터 하위로 가면서, 파생단어의 수와 마지막 단어임을 기록
        for(int i = 0; i < size; i++){
            char c = word.charAt(i);
            node.count++;
            
            node.childNodes.putIfAbsent(c, new TrieNode());
			node = node.childNodes.get(c);
            // node = node.childNodes.computeIfAbsent(word.charAt(i), c -> new TrieNode() );
        }
        node.count++;
        node.isLast = true;
    }
    
    @Override
    public String toString(){
        return this.root.toString();
    }
    
    int getMinInputCount(String word){
        TrieNode node = this.root;
        
        int size = word.length();
        int count = size;
        
        for(int i = 0; i < size; i++){
            // 남은 하위 단어가 1개라면, 현재 입력으로 결정이 됩니다.
            if(node.count == 1){
                count = i;
                break;
            }
            node = node.childNodes.get(word.charAt(i));
        }
        return count;
    }
}