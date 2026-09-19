class Solution {
    public int[] twoSum(int[] nums, int target) {
        int store[]=new int[2];
        for(int i = 0; i < nums.length; i++){
         for(int j = i+1; j < nums.length; j++){
            if(nums[i]+nums[j]==target){
                store[0]=j;
                store[1]=i;
            }
         }
        }
        return store;
    }
}