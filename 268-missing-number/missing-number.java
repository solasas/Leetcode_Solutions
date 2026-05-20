class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int num: nums){
            sum+=num;
        }
        int n_sum=n*(n+1)/2;
        int missing=n_sum-sum;
        return missing;
    }
}