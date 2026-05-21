class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub=s.substring(i,j+1);
                int[] freq=new int[26];
                for(int k=0;k<sub.length();k++){
                    freq[sub.charAt(k)-'a']++;
                }
                int min_freq=Integer.MAX_VALUE;
                int max_freq=0;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                    min_freq=Math.min(min_freq,freq[k]);
                    max_freq=Math.max(max_freq,freq[k]);
                    }
                }
                sum+=(max_freq-min_freq);
            }
        }
        return sum;
    }
}