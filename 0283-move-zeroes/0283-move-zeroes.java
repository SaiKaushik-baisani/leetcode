class Solution {
    public void moveZeroes(int[] nums) {
        
        int j = -1;

        for(int k = 0 ; k < nums.length ; k++){
            if(nums[k] != 0){
                j++;
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
            }
        }        



    }
}