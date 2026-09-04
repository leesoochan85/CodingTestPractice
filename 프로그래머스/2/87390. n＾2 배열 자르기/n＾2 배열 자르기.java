class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        int startLine, endLine, startPoint, endPoint;
        int i,j,k,idx=0, temp=0;
        
        startLine=(int)(left/n);
        endLine=(int)(right/n);
        startPoint=(int)(left%n);
        endPoint=(int)(right%n);
        
        if(startLine==endLine){
            temp=startPoint;
            for(int q = startPoint; q<=endPoint; q++){
                if(temp<=startLine) answer[idx++]=startLine+1;
                else answer[idx++]=temp+1;
                temp++;
            }
        }
        
        else{
            temp=startPoint;
            for(i=startPoint;i<n;i++){
                if (temp<startLine+1){
                    answer[idx++]=startLine+1;
                }else{
                    answer[idx++]=temp+1;
                }
                temp++;
            }

            for(i = startLine+1; i<endLine; i++){
                for( j=0; j<=i; j++){
                    answer[idx++]=i+1;
                }
                for(k=j+1;k<=n;k++){
                    answer[idx++]=k;
                }
            }

            temp=0;
            for(i=0;i<=endPoint;i++){
                if(temp<endLine+1){
                    answer[idx++]=endLine+1;
                }else{
                    answer[idx++]=temp+1;
                }
                temp++;
            }
        }
        
        return answer;
    }
}