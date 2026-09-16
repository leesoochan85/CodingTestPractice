import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0, idx=0;
        String [] cacheArr = new String [cacheSize];
        String str="";
        Set<String>s=new HashSet<>();
        
        if(cacheSize==0) answer = cities.length*5;
        
        else{
            for(String str1 : cities){
                    str=str1.toUpperCase();
                if(cacheSize>s.size() && !s.contains(str)) {
                    cacheArr[idx++]=str;
                    s.add(str);
                    answer+=5;
                }
                else if(cacheSize>s.size() && s.contains(str) && !str.equals(cacheArr[s.size()-1])){
                    answer+=1;
                    for(int i=0; i<s.size(); i++){
                        if(str.equals(cacheArr[i])){
                            for(int k=i+1; k<cacheSize;k++){
                                cacheArr[k-1] = cacheArr[k];
                            }
                            cacheArr[s.size()-1]=str;
                        }
                    }
                    
                    
                    cacheArr[s.size()-1]=str;
                }
                else if(cacheSize>s.size() && s.contains(str) && str.equals(cacheArr[s.size()-1])){
                    answer+=1;
                }

                else if(cacheSize<=s.size() && s.contains(str)){
                    answer+=1;
                    for(int i=0;i<cacheSize;i++){
                        if(str.equals(cacheArr[i])){
                            for(int k=i+1; k<cacheSize;k++){
                                cacheArr[k-1] = cacheArr[k];
                            }
                            cacheArr[cacheSize-1]=str;
                        }
                    }
                }

                else if(cacheSize<=s.size() && !s.contains(str)){
                    answer+=5;
                    s.remove(cacheArr[0]);
                    s.add(str);
                    for(int i=1;i<cacheSize;i++){
                        cacheArr[i-1] = cacheArr[i];
                    }
                    cacheArr[cacheSize-1]=str;
                }

            }
        }
        return answer;
    }
}