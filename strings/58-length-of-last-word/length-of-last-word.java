class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.trim().split(" ");
        int n=arr.length-1;
        String lastword=arr[n];
        
        return lastword.length();
    }
}