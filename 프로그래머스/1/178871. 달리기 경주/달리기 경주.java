import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> m = new HashMap<>();
        int idx=0;
        
        for(int i=0;i<players.length;i++){
            m.put(players[i],idx++);
        }
        for(String s: callings){            
            int rank = m.get(s);
            m.replace(s,rank-1);
            m.replace(players[rank-1],rank);
            
            String temp = players[rank-1];
            players[rank-1]=players[rank];
            players[rank]=temp;
        }            
        
        return players;
    }
}