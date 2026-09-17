class Solution {
    public int fib(int n) {
        int s=0;
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }else{
            int a=0,b=1;
            int next=0;
            for(int i=0;i<=n-2;i++){
                next=a+b;
                 s=next;
                a=b;
                b=next;
            }
        }
        return s;
    }
}