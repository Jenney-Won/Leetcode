//rotate array elements k times to the right
//space complexity: O(1)
//see solutions for other methods : Best O(n), O(1)

class Solution {
    public void rotate(int[] nums, int k) {
        //#1 new array -> didn't work out
        //#2 old school lastnum goes upfront for k times : O(n*k) O(1)
        int lastIndex = nums.length-1;
        
        for(int i=0; i<k; i++){
            int temp = nums[lastIndex];
            for(int j=0; j<nums.length-1; j++){
                nums[lastIndex-j] = nums[lastIndex-1-j];
            }
            nums[0] = temp;
        }
    }
}