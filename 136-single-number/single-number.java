class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!m.containsKey(nums[i])){
                m.put(nums[i],1);
            }
            else{
                m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            }
        }
       
        for(int num :m.keySet()){
            if(m.get(num)==1) return num;
        }
        return -1;
    }
}