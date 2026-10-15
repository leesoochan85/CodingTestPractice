import java.util.*;
import java.util.regex.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 1, count = 0;
        
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        // Pattern p = Pattern.compile("[\\s\\d[^a-zA-Z가-힣]]");
        Set <String> set = new HashSet<>();
        
        for(int i=0;i<str1.length()-1;i++){
            String str = str1.substring(i,i+2);
            if(str.matches("[A-Z]{2}")){  // if(!p.matcher(str).find())
                list1.add(str);
            }
        }
        
        for(int i=0;i<str2.length()-1;i++){
            String str = str2.substring(i,i+2);
            if(str.matches("[A-Z]{2}")){ //if(!p.matcher(str).find())
                list2.add(str);
            }
        }
        
        // String[] strArr1= list1.toArray(new String[0]);
        // String[] strArr2= list2.toArray(new String[0]);
        
//         String regex = String.join("|", strArr1);
//         Pattern same = Pattern.compile(regex);
        
//         for(String s : strArr2){
//             if(same.matcher(s).matches()){
//                 if(small>count)
//                     count++;
//             }
//         }
        for(String s : list2){
            if(list1.contains(s)){
                count++;
                list1.remove(s);
            }
        }
        
        int all = list1.size() + list2.size();
        int top = count;
        System.out.print("분자: "+ top+ " 분모: "+ all);
        if(all == 0 ) return 65536;
        
        answer = top*65536/all;
        return answer;
    }
}