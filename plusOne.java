//https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148/

class Solution {
    public int[] plusOne(int[] digits) {
        boolean allNine = true;
        int lastIndex = digits.length-1;
        for(int n : digits){
            if(n != 9){
                allNine = false;
            }
        }
        
        if(allNine == false){ // 9,8,9   1,2,4
            for(int i=lastIndex; i>=0; i--){
                if(digits[i] != 9){
                    digits[i]++;
                    return digits;
                }
                else{
                    digits[i] = 0;
                }
            }
            digits[0] = 1;
            return digits;
        }
        
        else{
            int[] arr = new int[digits.length + 1];
            for(int i=arr.length-1; i>0; i--){
                arr[i] = 0;
            }
            arr[0] = 1;
            return arr;
        }
        
    }
}