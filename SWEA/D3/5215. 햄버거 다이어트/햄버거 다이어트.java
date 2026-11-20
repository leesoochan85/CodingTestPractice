
import java.util.*;
import java.io.*;

class Solution
{
    static int [] scores, cals; 
    static int N, L, max;
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());
            
            max=0;
            scores = new int[N];
            cals = new int[N];
            
            for(int i=0; i<N;  i++){
                st = new StringTokenizer(br.readLine());
                scores[i] = Integer.parseInt(st.nextToken());
                cals[i] = Integer.parseInt(st.nextToken());
            }
            
            dfs(0,0,0);
            System.out.println("#"+test_case+" "+max);
        }
        
        /*
        int [] dp = new int[L+1];
        for(int i=0; i<N; i++){
            for(int j=L; j>=cals[i]; j--){
                dp[j]=Math.max(dp[j], dp[j-cals[i]]+scores[i]);
            }
        }
        */
                                         
    }
    
    public static void dfs(int idx, int scoreSum, int calSum){
        if(calSum>L) 
            return;
        if(idx==N){
            max = Math.max(max, scoreSum);
            return;
        }
        dfs(idx+1, scoreSum, calSum);
        dfs(idx+1, scoreSum+scores[idx], calSum + cals[idx]);
    }
}
