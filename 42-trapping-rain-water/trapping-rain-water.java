class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int lmax=0;
        int rmax=0;
        int total=0;
        while(left<right){
            lmax=Math.max(lmax,height[left]);
            rmax=Math.max(rmax,height[right]);
            if(lmax<rmax){
                total+=lmax-height[left];
                left++;
            }
            else{
                total+=rmax-height[right];
                right--;
            }
        }
        return total;
    }
}