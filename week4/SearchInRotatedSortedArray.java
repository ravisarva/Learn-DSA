//URL : https://leetcode.com/problems/search-in-rotated-sorted-array/
class SearchInRotatedSortedArray {
    public static int getPivot(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int mid = (s+e)/2;
        while (s < e) {

            if (nums[mid] >= nums[0]) {
                s = mid + 1;
            } else {
                e = mid;
            }
            mid = (s + e) / 2;
        }
        return s;
    }

    public static int binarySearch(int[] nums, int low, int high, int target) {
        int s = low;
        int e = high;
        int mid = (s + e) / 2;

        while (s <= e) {
            mid = (s+e)/2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = getPivot(nums, target);
        int ans = -1;
        if (target >= nums[pivot] && target <= nums[n - 1]) {
            ans =  binarySearch(nums, pivot, n - 1, target);
        } else {
            ans = binarySearch(nums, 0, pivot - 1, target);
        }
        if(ans != -1){
            return ans;
        }
        return -1;
    }
}