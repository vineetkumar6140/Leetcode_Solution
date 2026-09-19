class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer> a=new ArrayList<Integer>();
       int p = num.length-1;
       int carry=0;
       while( p >= 0 || k > 0){
        int numvalue=0;
        if(p >= 0){
            numvalue=num[p];
        }
              int d = k % 10;
        int sum = d + numvalue + carry ;
           int digit = sum % 10;
           carry = sum / 10;
           a.add(digit);
           p--;
           k = k / 10;
       }
       if( carry > 0 ){
        a.add(carry);
       }
      Collections.reverse(a);
        return a;
    }
}