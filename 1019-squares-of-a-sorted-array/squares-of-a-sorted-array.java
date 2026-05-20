class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] squares=new int[n];
        int left=0;
        int right=n-1;
        int index=n-1;
        while(left<=right){
            int left_sq=nums[left]*nums[left];
            int right_sq=nums[right]*nums[right];
           if(left_sq>right_sq){
            squares[index--]=left_sq;
            left++;
           }
           else{
            squares[index--]=right_sq;
            right--;
           }
        }
        return squares;
    }
}