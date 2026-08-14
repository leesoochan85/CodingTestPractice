import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0,goal=0;
        Map <Integer,Integer> m = new HashMap<>();
        
        for(int i:tangerine){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int mapSize = m.size();
        int [] arr = new int[mapSize];
        
        int idx=0;
        for(Map.Entry<Integer, Integer> entry:m.entrySet()){
            arr[idx++]=entry.getValue();
        }
        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--){
            if(goal<k){
                goal+=arr[i];
                answer++;
            }else break;
        }
        
        return answer;
    }
}