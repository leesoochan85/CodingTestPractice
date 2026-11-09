
import java.util.*;
import java.io.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
		PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int test_case = 1; test_case <= T; test_case++)
		{
            String str = br.readLine();
            int count = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for(int i=0; i<count; i++){
            	pq.add(Integer.parseInt(st.nextToken()));
            }
            int c = pq.size();
            for(int i = 0; i < c; i++){
            	int cur = pq.poll();
                String tmpStr = str.substring(0,cur);
                String reStr = str.substring(cur,str.length());
                str = tmpStr + "-" + reStr;
            }
            System.out.println("#"+test_case+" "+str);
		}
	}
}