class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int left=0;
       int right=0;
       boolean ans=false;
       int[] mapS1=new int[26];
       int[] mapS2=new int[26];
       int k=s1.length();
       for(char c : s1.toCharArray()){
        mapS1[c-'a']++;
       }
       for(int i=0;i<s2.length();i++){
        mapS2[s2.charAt(i)-'a']++;
        if(i>=k){
            mapS2[s2.charAt(i-k)-'a']--;
        }
        if(Arrays.equals(mapS1,mapS2)){
            ans=true;
        }
       } 
       return ans;
    }
   
}



 // private boolean isDesirable(int[] mapS1,int[] mapS2){
    //     for(int i=0;i<mapS2.length;i++){
    //         if(mapS1[i]>mapS2[i]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }