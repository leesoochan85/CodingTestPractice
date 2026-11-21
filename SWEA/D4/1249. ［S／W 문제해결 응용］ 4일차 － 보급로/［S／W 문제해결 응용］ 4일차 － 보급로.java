import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
        	int n = Integer.parseInt(br.readLine());
            int [][] arr = new int[n][n];
           	int [][] d = new int [n][n];
            
            for(int i=0; i<n; i++){
            	String input = br.readLine();
                Arrays.fill(d[i], Integer.MAX_VALUE);
                for(int idx=0;idx<n; idx++){
                	arr[i][idx]=input.charAt(idx) - '0';
                }
            }
            int [] dx = {0, 0, 1, -1};
            int [] dy = {1, -1, 0, 0};
            
            Queue <int[]> q = new LinkedList<>();
            d[0][0]=0;
            q.offer(new int[] {0,0});
            
            while(!q.isEmpty()){
            	int [] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                
                for(int i=0; i<4; i++){
                	int nx = x + dx[i];
                    int ny = y + dy[i];
                    
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                        if(d[nx][ny]>d[x][y]+arr[nx][ny]){
                        	d[nx][ny] = d[x][y]+arr[nx][ny];
                            q.offer(new int[]{nx,ny});
                        }
                    }
                }
            }
            System.out.println("#"+test_case+" "+d[n-1][n-1]);
		}
	}
}