class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=findMax(piles);
        while(left<=right){
            int mid=left+(right-left)/2;
            int totalHours=findTotalHours(piles,mid);
            if(totalHours<=h){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
       
    }
    private int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num : arr){
            max=Math.max(num,max);
        }
        return max;
    }
    private int findTotalHours(int[] arr,int mid){
        int hours=0;
        for(int num : arr){
            hours+=Math.ceil((double)num/mid);
        }
        return hours;
    }
}