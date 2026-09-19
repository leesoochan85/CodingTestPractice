import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int []dx = {1,-1,0,0};
        int []dy = {0,0,1,-1};
        
        Queue<int[]> q =new LinkedList<>();
        q.offer(new int[]{0,0,1});
        maps[0][0]=0;
        
        while(!q.isEmpty()){
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            int reach = current[2];

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx>=0 && nx<maps.length 
                  && ny >=0 && ny<maps[0].length
                  && maps[nx][ny]==1){
                    q.offer(new int[]{nx,ny,reach+1});
                    maps[nx][ny]=0;
                    if(nx==maps.length-1 && ny == maps[0].length-1){
                        return reach+1;
                    }
                }
            }
        }
        
        return -1;
    }
}