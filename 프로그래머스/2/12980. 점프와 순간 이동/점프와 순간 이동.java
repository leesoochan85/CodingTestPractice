import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0, temp=n, remain=0;
        
        //5000 2500 1250 625 312 156 78 39 19 9 4 2 1 0
        //1(1)+ 1(9)+1(19)+1(39)+1(625) => 5 (0이 나올 떄까지 2로 나눠 1이 남는 경우 찾아 증가)
        
        //6 3 1 0
        //1(1)+ 3(1) => 2
        
        //5 2 1 0
        //1(1)+
        
        while(temp!=0){
            remain = temp%2;
            temp/=2;
            if(remain==1){
                ans++;
            }
            
        }
        return ans;
    }
}