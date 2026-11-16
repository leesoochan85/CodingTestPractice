import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int T = Integer.parseInt(br.readLine());
             int [][] matrix = new int[100][100];
            
            for(int i=0; i<100;i++){
            	String str = br.readLine();
                String [] strArr = str.split(" ");
                for(int k=0; k<100; k++){
                    matrix[i][k] = Integer.parseInt(strArr[k]);
                }
            }
            
            int max = Integer.MIN_VALUE, temp=0, temp1=0;
            
            for(int i=0;i<100;i++){
                temp=0;
                for(int k=0; k<100; k++){
					temp += matrix[i][k];
                }
                max = Math.max(max, temp);
            }
            
            for(int i=0;i<100;i++){
                temp=0;
                for(int k=0; k<100; k++){
					temp += matrix[k][i];
                }
                max = Math.max(max, temp);
            }
            /*
            int r1, c1, r2, c2, r3, c3, r4, c4;
            int temp2, temp3;
			for(int times=0; times<100; times++){
                r1=0; c1=times;
                r2=times; c2=0;
                temp=0; temp1=0;
                
                while(r1<100 && c1<100){
                    temp += matrix[r1++][c1++];
                    temp1 += matrix[r2++][c2++];
                }
                
                r3= times; c3 = 99;
                r4=0; c4=99-times;
                temp2=0; temp3=0;
                
                while(r3<100 && c3>=0){
                    temp2 += matrix[r3++][c3--];
                    temp3 += matrix[r4++][c4--];
                }
                
                int tmax = Math.max(temp, temp1);
                int tmax2 = Math.max(temp2, temp3);
                int dmax = Math.max(tmax, tmax2);
                max=Math.max(dmax,max);
            }*/
            
            temp=0; temp1=0;
            for(int i=0;i<100;i++){
            	temp += matrix[i][i];
                temp1 +=matrix[i][99-i];
            }
            temp=Math.max(temp, temp1);
            max=Math.max(temp,max);
            
            System.out.println("#"+T +" " +max);
		}
	}
}