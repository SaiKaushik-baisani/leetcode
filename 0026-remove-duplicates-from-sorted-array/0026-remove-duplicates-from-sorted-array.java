class Solution {
    public int removeDuplicates(int[] nums) {
        int i = -1;
        int count = 0;
        int now = Integer.MIN_VALUE;

        for(int k = 0 ; k < nums.length ; k++){
            if(now != nums[k]){
                count ++;
                now = nums[k];
                i++;
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
            }
        }
        return count;
    }
}