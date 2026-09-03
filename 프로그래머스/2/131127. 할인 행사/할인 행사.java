import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0, totalSum=0, temp=0;
        Map<String, Integer> m = new HashMap<>();
        Set<String> s = new HashSet<>();
        String str ="";
        for(int i=0;i<number.length;i++){
            m.put(want[i],i);  
            s.add(want[i]);
            totalSum+=number[i];
        }
        
        
        boolean check = true;
        for(int i=0;i<=discount.length-totalSum;i++){
            int []checkArr = new int[number.length];
            
            for(int k=0;k<totalSum;k++){
                str=discount[i+k];
                if(!s.contains(str)) {
                    temp=0;
                    i+=k;
                    break;
                }
                else {
                    if( number[m.get(str)] > checkArr[m.get(str)]){
                        checkArr[m.get(str)]++;
                        temp++;
                    }
                    else {
                        temp=0;
                        break;
                    }
                    
                }
            }
            if(temp==totalSum){
                answer++;
                temp=0;
            }
        }
        
        
        return answer;
    }
}