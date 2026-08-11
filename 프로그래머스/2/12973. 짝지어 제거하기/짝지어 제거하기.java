import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack <Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stk.isEmpty()){
                stk.push(s.charAt(i));
            }else{
                if(stk.peek()==s.charAt(i)){
                    stk.pop();
                }else stk.push(s.charAt(i));
            }
        }
        answer = stk.isEmpty() ? 1:0;
        return answer;
    }
}