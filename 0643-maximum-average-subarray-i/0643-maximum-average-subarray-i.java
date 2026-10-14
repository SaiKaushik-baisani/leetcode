class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0;
        for(int i = 0 ; i < k; i++){
            sum+=nums[i];
        }

        double max = sum/k; 

        for(int i  = 1 ; i + k <= nums.length ; i++){
            sum = sum + nums[i+ k - 1] - nums[i-1];
            if(max < sum/k){
                max = sum/k;
            }
        }

        return max;

    }
}