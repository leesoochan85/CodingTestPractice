import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = Integer.parseInt(br.readLine());
            int [] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum=0;
            for(int i=0; i<N; i++){
            	arr[i] = Integer.parseInt(st.nextToken());
                sum+=arr[i];
            }
            
            boolean []dp = new boolean[sum+1];
            dp[0]=true;
            
            for(int score : arr){
            	for(int i=sum; i>=0;i--){
                	if(dp[i])
                        dp[i+score] =true;
                }
            }
            int count =0;
            for(boolean p:dp){
                if(p) 
                    count++;
            }
            System.out.println("#"+test_case+" "+count);
		}
	}
}