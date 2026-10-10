class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();

        for(int x : nums){
            set.add(x);
        }

        int n = nums.length;
        int count = 0;

        for(int x : set){
            count++;
        }

        if(count == n){
            return false;
        }
        else{
            return true;
        }
    }
}