//array101 integer length in oneline :)

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int len = (int)(Math.log10(nums[i]) + 1);
            if(len % 2 == 0) count++;
        }
        return count;
    }
}