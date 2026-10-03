class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int index = 0;
        for(int i = 0; i < nums.length ; i++){
              if(max < nums[i]){
                max = nums[i];
                index = i;
              }
        }
         for(int i = 0 ; i < nums.length ; i++){
            if( i != index && max < nums[i] * 2){
                return -1;
            }
         }
        return index;
    }
}