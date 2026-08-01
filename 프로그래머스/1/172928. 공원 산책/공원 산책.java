class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int [][] arr = new int[park.length][park[0].length()];
        int startRow=0,startCol=0;
        int currentRow, currentCol;
        boolean rowCheck = true, colCheck = true;
        
        for(int i=0;i<park.length;i++){
            for(int j=0; j<park[0].length(); j++){
                if(park[i].charAt(j)=='S'){
                    startRow=i;
                    startCol=j;
                    arr[i][j]=0;
                }else if(park[i].charAt(j)=='O'){
                    arr[i][j]=0;
                }else {
                    arr[i][j]=1;
                }
            }
        }
        
        currentRow = startRow; currentCol=startCol;
        
        for(String s:routes){
            String []direction = s.split(" ");
            String Vector = direction[0];
            int distance = Integer.parseInt(direction[1]);
            
            if(Vector.equals("E") && currentCol + distance < park[0].length()){
                for(int i=0; i<distance; i++){
                    if(arr[currentRow][currentCol+i+1]==1) colCheck = false;
                }
                if(colCheck){
                    currentCol += distance; 
                }
                else colCheck = true;
            }
            else if(Vector.equals("W") && currentCol - distance >= 0){
                for(int i=0; i<distance; i++){
                    if(arr[currentRow][currentCol-i-1]==1) colCheck = false;
                }
                if(colCheck){
                    currentCol -= distance; 
                }
                else colCheck = true;
            }
            else if(Vector.equals("N") && currentRow - distance >= 0){
                for(int i=0; i<distance; i++){
                    if(arr[currentRow-i-1][currentCol]==1) rowCheck = false;
                }
                if(rowCheck){
                    currentRow -= distance; 
                }
                else rowCheck = true;
            }
            else if(Vector.equals("S") && currentRow + distance < park.length){
                for(int i=0; i<distance; i++){
                    if(arr[currentRow+i+1][currentCol]==1) rowCheck = false;
                }
                if(rowCheck){
                    currentRow += distance; 
                }
                else rowCheck = true;
            }
        }
        answer[0]=currentRow; answer[1]=currentCol;
        return answer;
    }
}