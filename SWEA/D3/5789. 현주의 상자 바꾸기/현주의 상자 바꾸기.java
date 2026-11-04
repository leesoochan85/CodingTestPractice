import java.util.*;
import java.io.*;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++){
			String str = br.readLine();
            String [] st = str.split(" ");
            
            int N = Integer.parseInt(st[0]);
            int Q = Integer.parseInt(st[1]);
            
            int [] answer = new int[N];
            
            for(int i=1; i<=Q; i++){
            	String tempStr = br.readLine();
                String [] tempSt = tempStr.split(" ");
                
                int li = Integer.parseInt(tempSt[0]);
                int ri = Integer.parseInt(tempSt[1]);
                for(int j=li-1; j<ri; j++) 
                    answer[j]= i; 
            }
            System.out.print("#"+test_case);
            for(int i=0; i<N; i++) {
                System.out.print(" "+answer[i]);
            }
            System.out.println();
        }
	}
}