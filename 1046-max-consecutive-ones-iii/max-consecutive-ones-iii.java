class Solution {
    public int longestOnes(int[] nums, int flip) {
        int maxones=Integer.MIN_VALUE;
        int noofreplace=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                noofreplace++;
            }
            while(noofreplace>flip){
                if(nums[left]==0){
                    noofreplace--;
                }
                left++;
            }
            maxones=Math.max(maxones,right-left+1);


        }
        return maxones;
    }
    }
