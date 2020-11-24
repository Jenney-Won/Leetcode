//https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/

class Solution {
    public int pivotIndex(int[] nums) {
        if((nums == null) || (nums.length == 0)){
            return -1;
        }
        else{
            int pIndex = 0;
            int leftSum = 0;
            int rightSum = 0;
            
            for(int i=pIndex+1; i<nums.length; i++){
                rightSum += nums[i];
            }
            
            while(leftSum != rightSum){
                if(pIndex < nums.length-1){
                    leftSum += nums[pIndex];
                    pIndex++;
                    rightSum -= nums[pIndex];
                }
                else{
                    return -1;
                }
            }
        return pIndex;    
        }
    }
}