import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String [] arr = s.split(" ");
        int [] numArr = new int[arr.length];
        int numMax=Integer.MIN_VALUE, numMin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            numArr[i]=Integer.parseInt(arr[i]);
        }
        
        for(int i=0;i<arr.length;i++){
            numMax = Math.max(numArr[i],numMax);
            numMin = Math.min(numArr[i],numMin);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(numMin).append(" ").append(numMax);
        answer = sb.toString();
        return answer;
    }
}