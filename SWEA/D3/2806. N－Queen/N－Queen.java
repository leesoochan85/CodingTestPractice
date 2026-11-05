import java.io.*;
import java.io.FileInputStream;

class Solution
{
    static int answer;
    
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = Integer.parseInt(br.readLine());
            answer=0;
            boolean [][] board = new boolean[n][n];
            dfs(n,board,0);
            System.out.println("#"+test_case+" "+answer);
        }
    }
    public static void dfs(int n, boolean[][] board, int r){
        if(r == n) {
            answer++;
            return;
        }
        
        for(int c=0; c<n; c++){
            if(check(board, r, c)){
                board[r][c]=true;
                
                dfs(n, board, r+1);
                
                board[r][c] = false;
        	}
        }
    }
    
    public static boolean check(boolean[][] board, int r, int c){
        for(int i=0; i<r; i++){
        	for( int j=0; j<board.length; j++){
                if(board[i][j]){
                    if(j == c) return false;
                    
                    if(Math.abs(r-i) == Math.abs(c-j)) return false;
                
                }
            }
        }
    return true;
    }
}