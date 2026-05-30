class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=maxOfWeights(weights);
        int right=sumOfWeights(weights);
        while(left<=right){
            int mid=left+(right-left)/2;
            int daysneeded=calculateDays(weights,mid);
            if(daysneeded<=days){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
     public int maxOfWeights(int[] weights){
        int max=Integer.MIN_VALUE;
        for(int num : weights){
            max=Math.max(max,num);
        }
        return max;
    }
     public int sumOfWeights(int[] weights){
        int sum=0;
        for(int num :weights){
            sum+=num;
        }
        return sum;
    }
     public int calculateDays(int[] weights,int mid){
        int days=1;
        int load=0;
        for(int num : weights){
            if(num+load>mid){
                days++;
                load=num;
            }
            else{
                load+=num;
            }
        }
        return days;
    }
}