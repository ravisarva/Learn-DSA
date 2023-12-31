//URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i =1; i<n; i++){
            if(nums[i] != nums[i-1]){
                j++;
                nums[j] = nums[i];
            }
        }
        if(n == 0){
            return 0;
        }
        return j+1;
    }
}