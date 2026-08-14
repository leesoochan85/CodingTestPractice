class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown+yellow, bigSide=0, smallSide=0, num=0, temp=3;

        while(temp*temp<=sum){
            num=temp;
            temp++;
        }
        
        for(int i=3; i<=num;i++){
            smallSide=i;
            if (sum % smallSide != 0) {
                continue;
            }
            bigSide = sum / smallSide;

            if ((bigSide - 2) * (smallSide - 2) == yellow) {
                return new int[]{bigSide, smallSide};
            }
        }
        return new int[2];
    }
}