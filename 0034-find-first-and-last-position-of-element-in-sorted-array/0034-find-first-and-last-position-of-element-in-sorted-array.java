class Solution {

    public int firstPosition(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int index = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                high = mid - 1;   // search left side
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return index;
    }


    public int lastPosition(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int index = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                low = mid + 1;    // search right side
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return index;
    }


    public int[] searchRange(int[] nums, int target) {

        int first = firstPosition(nums, target);
        int last = lastPosition(nums, target);

        return new int[]{first, last};
    }
}