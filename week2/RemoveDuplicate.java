// URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int count=0;
        ArrayList<Integer> lst=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!lst.contains(nums[i])){
                lst.add(nums[i]);
            }
        }
        for(int i=0;i<lst.size();i++){
            nums[i]=lst.get(i);
        }
        return lst.size();
    }
}
