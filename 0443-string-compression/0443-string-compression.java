class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder("");  
        int count = 1;
        s.append(chars[0]);
        for(int i = 1; i < chars.length ; i++){
            if(chars[i-1] != chars[i]){
                if(count > 1){
                    s.append(count+"");
                }
                s.append(chars[i]);
                count = 1;
            }else{
                count++;
            }
        }
        if( count > 1){
            s.append(count+"");
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            chars[i] = ch;
        }
          
        return s.length();
    }
}