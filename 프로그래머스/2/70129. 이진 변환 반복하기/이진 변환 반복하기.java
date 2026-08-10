class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroNum = 0,count=0;
        int oneNum = s.length()-zeroNum;
        String binaryStr =s;
        
        while(oneNum!=1){
            System.out.println(binaryStr);
            count++;
            zeroNum=0;
            for(int i=0;i<binaryStr.length();i++){
                if(binaryStr.charAt(i)=='0'){
                    zeroNum++;
                }
            }
            oneNum = binaryStr.length()-zeroNum;
            System.out.println("oneNum: "+ oneNum);
            binaryStr = Integer.toBinaryString(oneNum);
            answer[1]+=zeroNum;
        }
        answer[0]=count;
        return answer;
    }
}

