class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] > nums[high]) {
                // Minimum must be to the right of mid
                low = mid + 1;
            } else {
                // Minimum is at mid or to the left
                high = mid;
            }
        }

        return nums[low];  // or nums[high], both point to min
    }
}
