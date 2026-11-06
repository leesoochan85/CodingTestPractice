import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		//System.setIn(new FileInputStream("res/input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int [] temp = new int[2];
        int answer=0;
		for(int test_case = 1; test_case <= T; test_case++)
		{
          	String []str = br.readLine().split(" ");
            int [] arr = new int[str.length];
            
            for(int i=0; i<str.length; i++){
                arr[i]=Integer.parseInt(str[i]);
            }
            int p,q,r,s,w;
            p=arr[0]; q=arr[1]; r=arr[2]; s=arr[3]; w=arr[4];
            
            temp[0]= p*w;
            
            if(w > r){
            	temp[1] = q + s * (w-r);
            }else{
            	temp[1] = q ;
            }
            answer = temp[0]>temp[1] ? temp[1]: temp[0];
            
            System.out.println("#"+test_case+" "+answer);
		}
	}
}