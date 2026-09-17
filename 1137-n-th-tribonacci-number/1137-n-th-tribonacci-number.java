class Solution {
    public int tribonacci(int n) {
         int s=0;
        if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else if(n==3){
            return 2;
        }else{
            int a=0,b=1,c=1;
            for(int i=0;i<=n-3;i++){
                int next=a+b+c;
                s=next;
                a=b;
                b=c;
                c=next;
            }
        }
        return s;
    }
}