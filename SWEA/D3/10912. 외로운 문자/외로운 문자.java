import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
            HashMap<Character, Integer> hm = new HashMap<>();
            PriorityQueue<Character> pq = new PriorityQueue<>();
            StringBuilder sb = new StringBuilder();
            
            String str = br.readLine();
            char[] arr= str.toCharArray();
            for(char c: arr){
                hm.put(c, hm.getOrDefault(c,0)+1);
            }
            for( Map.Entry<Character, Integer>entry : hm.entrySet() ){
            	char k = entry.getKey();
                int v = entry.getValue();
                if(v%2!=0){
                	pq.offer(k);
                }
            }
            if(pq.size()==0) {
            	System.out.println("#"+test_case+" "+"Good");
            }
            
            else {
            	int s = pq.size();
                for(int i=0; i<s; i++){
                	sb.append(pq.poll());
                }
                System.out.println("#"+test_case+" "+sb);
            }
		}
	}
}