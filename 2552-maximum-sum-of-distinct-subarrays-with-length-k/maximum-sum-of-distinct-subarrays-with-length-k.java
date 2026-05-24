class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        long sum=0;
        long maxsum=0;
        int left=0;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(right-left+1>k){
                sum-=nums[left];
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            if(right-left+1==k && map.size()==k){
                maxsum=Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }
}