import java.util.*;
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        String []time = video_len.split(":");
        int timeToNum =Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]);
        
        String []posTime = pos.split(":");
        int curPos =Integer.parseInt(posTime[0])*60 + Integer.parseInt(posTime[1]);
        
        String []opTime = op_start.split(":");
        int opPos =Integer.parseInt(opTime[0])*60 + Integer.parseInt(opTime[1]);
        
        String []endTime = op_end.split(":");
        int endPos =Integer.parseInt(endTime[0])*60 + Integer.parseInt(endTime[1]);
        
        for(int i=0; i<commands.length; i++){
            if(curPos>=opPos && curPos<endPos){
                curPos = endPos;
            }
            switch(commands[i]){
                case "next":
                    if(curPos+10>timeToNum){
                        curPos=timeToNum;
                    }else 
                        curPos+=10;
                    break;
                    
                case "prev":
                    if(curPos-10<0){
                        curPos=0;
                    }else 
                        curPos-=10;
                    break;
            }
            if(curPos>=opPos && curPos<endPos){
                curPos = endPos;
            }
        }
        
        int minute = curPos / 60;
        int seconds = curPos % 60;
        
        if(minute<10&&seconds>9){
            answer = "0"+minute+":"+seconds;
        }
        else if(minute>=10&&seconds<10){
            answer = ""+minute+":0"+seconds;
        }
        else if(minute<10&&seconds<10){
            answer = "0"+minute+":0"+seconds;
        }
        else  answer = ""+minute+":"+seconds;
        return answer;
    }
}