class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        int count = 0;

        for(int x : nums){
            if(!set.contains(x)){
                set.add(x);
                count++;
            }
        }

        int n = nums.length;

        if(count == n){
            return false;
        }
        else{
            return true;
        }
    }
}