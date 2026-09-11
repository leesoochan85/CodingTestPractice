import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        String check=" ";
        Set<String> set =new HashSet<>();
        
        Arrays.sort(phone_book, (a,b)->b.length()-a.length());
        
        for(String s: phone_book){
            set.add(s);
        }
        
        for(String s: phone_book){
            for(int i=0; i<s.length(); i++){
                check = s.substring(0,i);
                if(set.contains(check)){
                    answer=false;
                    break;
                }
                if(!answer) break;
            }
        }
        
        return answer;
    }
}