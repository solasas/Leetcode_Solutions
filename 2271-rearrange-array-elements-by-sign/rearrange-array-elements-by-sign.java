class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int positive=0;
        int negative=1;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
           if(nums[i]<0){
            ans[negative]=nums[i];
            negative+=2;
           }
           else{
            ans[positive]=nums[i];
            positive+=2;
           }
        }
        return ans;
    }
}