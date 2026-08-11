class Solution {
    public int solution(int n) {
        int answer = 0;
        int goalCount=0;
        int count = binary(n);
        
        while(count!=goalCount){
            n++;
            goalCount=binary(n);
        }
        return n;
    }
    
    public int binary(int num){
        int n=num, count=0;
        String nBinary = Integer.toBinaryString(n);
        for(int i=0; i<nBinary.length(); i++){
            if(nBinary.charAt(i)=='1') count++;
        }
        return count;
    }
}