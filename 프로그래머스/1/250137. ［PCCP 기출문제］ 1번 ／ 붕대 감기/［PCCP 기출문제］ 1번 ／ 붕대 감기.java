class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int idx = 0, time = 0, consistTime=0, 
        count = attacks.length, 
        currentHealth = health;
        
        while( idx < count){
            time++;
            consistTime++;
            
            if(currentHealth < health && time != attacks[idx][0] ){
                if(consistTime != bandage[0]){
                    if(currentHealth + bandage[1] <= health){
                    currentHealth += bandage[1];
                    }else {
                        currentHealth = health;
                    }
                }
                else if(consistTime == bandage[0]){
                    if(currentHealth+bandage[2]+bandage[1] <= health){
                    currentHealth += bandage[2]+bandage[1];
                    }else{
                        currentHealth = health;
                    }
                    consistTime=0;
                }
            }
            
            else if(time == attacks[idx][0]) {
                if(currentHealth-attacks[idx][1]>0){
                    currentHealth-=attacks[idx][1];
                }
                else if(currentHealth-attacks[idx][1]<=0)
                    return -1;
                idx++;
                consistTime=0;
            }
            System.out.println("Time: "+ time+ " consistTime: " + consistTime + " cuurentHealth: " + currentHealth);
        }
        return currentHealth;
    }
}