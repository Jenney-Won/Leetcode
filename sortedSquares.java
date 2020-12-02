//wasn't so efficient, try #4!!!

class Solution {
    public int[] sortedSquares(int[] nums) {
        /* #1 @Too much of runtime
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0) nums[i] = -nums[i];
        }
        
        //first approach: bubblesort it in ascending order, TO: O(n^2)
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        
        //square it! for each loop does not modify array. It only iterates each value
        for(int i=0; i<nums.length; i++){
            nums[i] = (int)Math.pow(nums[i], 2);
        }
        --------------------------------------------------*/

        /* #2 quicksort it, TO: O(nlog n) 
        for(int i=0; i<nums.length; i++){
            nums[i] = (int)Math.pow(nums[i], 2);
        }
        
        quickSort(nums, 0, nums.length-1);
        
        return nums;
    }
    
    public void quickSort(int[] nums, int start, int end){
        if(start >= end) return;
        
        int key = start;
        int i = start + 1;
        int j = end;
        int temp = 0;
        
        while(i <= j){
            while(i <= end && nums[key] >= nums[i]) i++;
            while(j > start && nums[key] <= nums[j]) j--;
            if(i > j){
                temp = nums[j];
                nums[j] = nums[key];
                nums[key] = temp;
            }
            else{
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        quickSort(nums, start, j-1);
        quickSort(nums, j+1, end);
    }
    -------------------------------------------------*/
        
    // #3 just use sort function Array.sort..
    // #4 do sorting while powing (see solution)
}