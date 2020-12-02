//array101

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        
        for(int i=0; i<nums.length; i++){
            count = nums[i] == 1 ? count + 1 : 0;
            max = Math.max(max, count);
        }
        return max;
    }
}