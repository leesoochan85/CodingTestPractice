import java.util.*;
class Solution {
    public int[] solution(String s) {
        List<int []> list = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();        
        int idx=0, count=0,num=0;
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(c=='{'){
                count=0;
                sb = new StringBuilder();
                temp = new LinkedList<>();
            }
            else if(c!='{' && c!='}' && c!=','){
                sb.append(c);
            }
            else if(c==','){
                temp.add(Integer.parseInt(sb.toString()));
                sb = new StringBuilder();
                count++;

            }
            else if(c=='}'){           
                if(count>num) num=count;
                temp.add(Integer.parseInt(sb.toString()));
                int []arr = temp.stream().mapToInt(Integer::intValue).toArray();
                list.add(arr);
            }
        }
        int []answer=new int[num+1];
        
        list.sort(Comparator.comparingInt((int []a)->a.length));
        for(int []a:list){
            for(int i:a){
                if(!set.contains(i)){
                    answer[idx++]=i;
                    set.add(i);
                }
            }
        }
        return answer;
    }
}