//https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1147/

class Solution {
    public int dominantIndex(int[] nums) {
        int largestNum = Integer.MIN_VALUE;
        int largestIndex = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] > largestNum){
                largestNum = nums[i];
                largestIndex = i;
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(i != largestIndex){
                nums[i] *= 2;
                if(nums[i] > largestNum){
                    return -1;
                }
            }
        }        
        return largestIndex;
    }
}