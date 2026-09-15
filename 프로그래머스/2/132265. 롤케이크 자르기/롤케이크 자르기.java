import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Set <Integer> leftSet = new HashSet<>();
        Set <Integer> rightSet = new HashSet<>();
        Map <Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<topping.length;i++){
            map.put(topping[i], map.getOrDefault(topping[i], 0)+1);
            rightSet.add(topping[i]);
        }
        
        for(int i=0;i<topping.length;i++){
            leftSet.add(topping[i]);
            map.replace(topping[i], map.get(topping[i])-1);
            if(map.get(topping[i])==0){
                rightSet.remove(topping[i]);
            }
            if(leftSet.size() == rightSet.size()) answer++;
        }
        return answer;
    }
}
