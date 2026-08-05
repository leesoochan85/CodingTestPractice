import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> map = new HashMap<>();
        Map<String, Set<String>> id = new HashMap<>();
        Map<String, Integer> name = new HashMap<>();
        
        for(int i=0;i<id_list.length;i++){
            name.put(id_list[i], i);
        }
        
        for(String str: id_list){
           id.put(str, new HashSet<>());
        }        
        
        for(String str: report){
            String[] temp = str.split(" ");
            String reporter = temp[0];
            String reportedMan = temp[1];
            
            
            if(!id.get(reporter).contains(reportedMan)){
                map.put(reportedMan, map.getOrDefault(reportedMan,0)+1);    
            }
            id.get(reporter).add(reportedMan);
        }
        
        for(Map.Entry<String,Integer>entry: map.entrySet()){
            if(entry.getValue()>=k){
                for(Map.Entry<String, Set<String>> idEntry : id.entrySet()){
                    if(idEntry.getValue().contains(entry.getKey())){
                        String n = idEntry.getKey();
                        int idx = name.get(n);
                        answer[idx]+=1;
                    }
                }
            } 
        }
        return answer;
    }
}