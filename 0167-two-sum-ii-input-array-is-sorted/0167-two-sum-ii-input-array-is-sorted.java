class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i  = numbers.length - 1;
        int j = 0;
        int ans [] = new int [2];

        while(j < i){
            if((numbers[i] + numbers[j]) == target){
                ans[0] = j+1;
                ans[1] = i+1; 
                break;
            }
            else if((numbers[i] + numbers[j]) > target){
                i--;
            }
            else if((numbers[i] + numbers[j]) < target){
                j++;
            }
        }
        return ans;
    }
}