class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        if(s.indexOf("IV") != -1 || s.indexOf("IX") != -1){sum -= 2;}
        if(s.indexOf("XL") != -1 || s.indexOf("XC") != -1){sum -= 20;}
        if(s.indexOf("CD") != -1 || s.indexOf("CM") != -1){sum -= 200;}
        char[] ch = s.toCharArray();
        
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'I'){sum += 1;}
            if(ch[i] == 'V'){sum += 5;}
            if(ch[i] == 'X'){sum += 10;}
            if(ch[i] == 'L'){sum += 50;}
            if(ch[i] == 'C'){sum += 100;}
            if(ch[i] == 'D'){sum += 500;}
            if(ch[i] == 'M'){sum += 1000;}
        }
        return sum;    
    }
}
