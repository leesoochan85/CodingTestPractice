import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0, count=0;
        String[]str= new String[s.length()];
        String temp=s;
        
        Deque <Character> dq = new LinkedList<>();
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            dq.offerLast(s.charAt(i));
        }
        
        for(int i=0;i<s.length();i++){
            StringBuilder sb =new StringBuilder();
            char first=dq.pollFirst();
            dq.offerLast(first);
            
            for(int j=0; j<s.length(); j++){
                char front=dq.pollFirst();
                sb.append(front);
                dq.offerLast(front);
            }            
            String checkStr=sb.toString();
            // System.out.println("문장: "+ checkStr);
            count=0;
            for(int k=0;k<s.length();k++){
                first=checkStr.charAt(k);
                if(stk.isEmpty()){
                    if(first!=')' && first!='}' && first!=']'){
                        stk.push(first);
                        // System.out.print(" 들어감 ");
                    }
                    else {
                        // System.out.print(" 못들어감 ");
                        break;
                    };
                }
                else {
                    if(first=='(' || first=='{' || first=='['){
                        stk.push(first);
                    }else if(first==')' && stk.peek()=='('){
                        stk.pop();
                    }else if(first=='}' && stk.peek()=='{'){
                        stk.pop();
                    }else if(first==']' && stk.peek()=='['){
                        stk.pop();
                    }else {
                        System.out.println("해당함");
                        break;
                    }
                }
                count++;
            }
            if(stk.isEmpty() && count==s.length() ) {
                answer++;
                // System.out.println("증가");
            }
            else stk.clear();
        }
        return answer;
    }
}