class Solution {
    public boolean checkOnesSegment(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        
        for(int i=0;i<n-1;i++){
            if(arr[i]=='0' && arr[i+1]=='1' ){
                return false;
            }
           
        }
        
        return true;
    }
}