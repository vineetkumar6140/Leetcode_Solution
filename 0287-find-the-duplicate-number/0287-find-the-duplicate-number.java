class Solution {
    public int findDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start <= end){
            int mid=(start+end)/2;
            int count=0;
           for(int n: nums){
            if(n <= mid){
                 count++;
            }
           }
           if(count > mid){
            end=mid-1;
           }else{
            start=mid+1;
           }
        }
         return start;   
    }
}