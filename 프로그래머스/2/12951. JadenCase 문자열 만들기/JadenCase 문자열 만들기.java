class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb =new StringBuilder();
      
        for(int i=0;i<s.length();i++){
            if((i==0 || s.charAt(i-1)==' ') && Character.isLetter(s.charAt(i)) ){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else 
                sb.append(Character.toLowerCase(s.charAt(i)));
        }
        answer = sb.toString();
        
        return answer;
    }
}