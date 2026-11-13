import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int length = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int count = Integer.parseInt(br.readLine());
            String command = br.readLine();
            
            LinkedList<String> list = new LinkedList<>();
            
            String [] strArr = str.split(" ");
            for(String s : strArr) 
                list.add(s);
            
            String [] cArr = command.split(" ");
            int check = 0, idx = 0;
            while( check < count) {
            	if(cArr[idx].equals("I")){
                    int loc = Integer.parseInt(cArr[idx +1]);
                    int amount = Integer.parseInt(cArr[idx + 2]);
                    for(int i=0; i<amount; i++){
                    	list.add(loc++, cArr[idx+3+i]);
                    }
                    idx+=3+amount;
                }
                else if(cArr[idx].equals("D")){
                    int loc = Integer.parseInt(cArr[idx +1]);
                    int amount = Integer.parseInt(cArr[idx + 2]); 
                    for(int i=0; i<amount; i++){
                    	list.remove(loc);
                    }
                     idx+= 3;
                }
                check++;
            }
            System.out.print("#"+test_case);
            for(int i=0;i<10;i++)
                System.out.print(" "+ list.get(i));
            System.out.println();
                
        }
	}
}