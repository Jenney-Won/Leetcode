//remove duplicates from sorted array
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0; //counts non-duplicates -> new length
        int curr = 0; //current index
        int cp = 1; //non-duplicates index
        int len = nums.length;
        
        if((len == 0) || (nums == null)){
            return count;
        }
        
        else{
            count++;
            while(cp < len){
                if(nums[curr] == nums[cp]){
                    cp++;
                }
                else{
                    count++;
                    curr++;
                    nums[curr] = nums[cp];
                }
            }
            len = count;
            return count;
        }
        
    }
}