import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int amount = Integer.parseInt(br.readLine()), idx=0, answer =0;
            String str = br.readLine();
            String [] str1 = str.split(" ");
            int [] key = new int [amount], range = {-2, -1, 1, 2};
            
            HashMap <Integer, Integer> hm = new HashMap<>();
            Set<Integer> s = new HashSet<>();
            PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            List<Integer>[] list = new LinkedList [amount];
            
            for(int i = 0; i <amount; i++){
                key[i] = Integer.parseInt(str1[i]);
                if(!s.contains(key[i])) {
                    s.add(key[i]);
                    pq.offer(key[i]);
                    if(!hm.containsKey(key[i]))
                        hm.put(key[i], idx);
                    list[idx] = new LinkedList<>();
                    list[idx].add(i);
                    idx++;
                }
                else {
                	int check = hm.get(key[i]);
                    list[check].add(i);
                }
            }
            int c = pq.size();
            for(int i=0;i<c; i++){
            	int first = pq.poll();
                int listIdx = hm.get(first);
                
                for(int a : list[listIdx]){
                	int max = 0;
                    for(int k=0; k<4; k++){
                    	if(a+range[k]>-1 && a+range[k]<amount) {
                    		int temp = key[a+range[k]];
                         	if(max<temp) max = temp;
                    	}
                    }
                    if(first-max>0)
                    	answer+=(first-max);
                }
            }
            System.out.println("#"+test_case+" "+answer);
		}
	}
}