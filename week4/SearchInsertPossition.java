//URL: https://leetcode.com/problems/search-insert-position

class SearchInsertPossition {
    public int searchInsert(int[] nums, int target) {
        int mid = 0;
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low <=high){
            mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else high = mid-1;
        }
        return low;
    }
}