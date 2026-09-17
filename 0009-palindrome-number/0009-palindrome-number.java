class Solution {
public boolean isPalindrome(int x) {
        int p=x;
        int s=0;
        if(x<0){
            return false;
        }
        while(x > 0){
           int d=x%10;
           s=s * 10 + d;
           x=x/10;
        }
        if(s==p){
            return true;
        }
        return false;
    }
}