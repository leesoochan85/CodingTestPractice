import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "", st="";
        StringBuilder sb =new StringBuilder();
        int start=0;
        
        while(sb.length()<t*m){
            String str = change(start++,n);
            sb.append(str);
        }
        st = sb.toString();
        st = st.toUpperCase();
        for(int i=0; i<t;i++){
            char ch = st.charAt(p-1);
            answer+=ch;
            p += m;
        }
                
        return answer;
    }
    
    public String change(int num, int n){
        return Integer.toString(num, n); 
    }
}