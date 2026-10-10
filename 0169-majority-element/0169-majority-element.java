class Solution {
    public int majorityElement(int[] nums) {
        int i = 0;
        int m = 0;

        for(int j = 0 ; j < nums.length ; j++){
            if(i == 0){
                i = 1;
                m = nums[j];
            }
            else if(m == nums[j]){
                i++;
            }
            else{
                i--;
            }
        } 

        return m;
    }
}