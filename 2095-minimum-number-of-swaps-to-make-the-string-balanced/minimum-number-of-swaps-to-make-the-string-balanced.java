class Solution {
    public int minSwaps(String s) {
        int misplaced=0;
        int balanced=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='['){
                balanced++;
            }
            else if( s.charAt(i)==']'){
                balanced--;
            }
            if(balanced<0){
                misplaced++;
                balanced=0;
            }
        }
        return (misplaced+1)/2;
    }
}