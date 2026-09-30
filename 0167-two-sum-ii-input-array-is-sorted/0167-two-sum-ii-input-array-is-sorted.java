class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
            int start = 0 , end = numbers.length-1;
            while( start < end){
                int sum = numbers[start] + numbers[end];
                if( sum == target){
                    result[0] = start + 1;
                    result[1] = end + 1;
                    break;
                }
                else if( sum < target){
                    start++;
                }else{
                    end--;
                }
            }
        return result;
    }
}