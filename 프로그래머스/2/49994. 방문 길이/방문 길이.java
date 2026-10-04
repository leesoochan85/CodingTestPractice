import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0, x=0 ,y=0, prevX=0, prevY=0;
        Set<String> set = new HashSet<>();
        for(int i=0;i<dirs.length();i++){
            char c = dirs.charAt(i);
            prevX=x;
            prevY=y;
            if(c=='R' && x < 5){
                x++;
            }
            else if(c=='L' && x > -5){
                x--;
            }
            else if(c=='U' && y>-5){
                y--;
            }
            else if(c=='D' && y<5){
                y++;
            }
            
            if(prevX==x && prevY==y) continue;
            System.out.println("x: "+ x+ " y: "+ y);
            
            String path1 = prevX + "," + prevY + "," + x + "," + y;          
            String path2 = x + "," + y + "," + prevX + "," + prevY;
            if(!set.contains(path1)){
                answer++;
                set.add(path1);
                set.add(path2);
            }
        }
        return answer;
    }
}


// class Solution {
//     public int solution(String dirs) {
//         int answer = 0;
//         boolean [][] dot = new boolean[11][11];
//         int [] dx = {1,-1,0,0};
//         int [] dy = {0,0,1,-1};
//         int x =5, y=5, idx=0;
//         List<Integer> xList = new LinkedList<>();
//         List<Integer> yList = new LinkedList<>();
        
//         Map<Integer, Integer> xm = new HashMap<>();
//         Map<Integer, Integer> ym = new HashMap<>();
        
        
//         for(int i=0;i<dirs.length();i++){
//             char c = dirs.charAt(i);
//             if(c=='R' && x < 10){
//                 x = x + dx[0];
//                 y = y + dy[0];
//             }
//             else if(c=='L' && x > 0){
//                 x = x + dx[1];
//                 y = y + dy[1];
//             }
//             else if(c=='U' && y<10){
//                 x = x + dx[2];
//                 y = y + dy[2];
//             }
//             else if(c=='D' && y>0){
//                 x = x + dx[3];
//                 y = y + dy[3];
//             }
//             xList.add(x);
//             yList.add(y);
//             xm.put(x,i);
//             ym.put(y,i);
//         }
//         int []xArr = xList.stream().mapToInt(Integer::intValue).toArray();
//         int []yArr = yList.stream().mapToInt(Integer::intValue).toArray();
        
//         for(int i = 0; i < xArr.length; i++){
//             if(dot[xArr[i]][yArr[i]]==false){
//                 dot[xArr[i]][yArr[i]]=true;
//                 answer++;
//             }else{
//                 for(int j=1; j<i; j++){
//                     if(xArr[j]==xArr[i]){
//                         idx = j;
//                         if(xArr[idx-1]!=xArr[i-1] && yArr[idx-1]!=yArr[i-1]){
//                             answer++;
//                         }
//                         break;
//                     }
//                 }
//             }
//         }
//         return answer;
//     }
// }