class Solution {
    public String minWindow(String s, String t) {

        if(s.length()<t.length())
            return "";

        int[] count=new int[128];

        for(char c:t.toCharArray()){
            count[c]++;
        }

        int left=0;
        int matched=0;

        int minLen=Integer.MAX_VALUE;
        int start=0;

        for(int right=0;right<s.length();right++){

            char ch=s.charAt(right);

            if(count[ch]>0)
                matched++;

            count[ch]--;

            while(matched==t.length()){

                if(right-left+1<minLen){
                    minLen=right-left+1;
                    start=left;
                }

                char leftChar=s.charAt(left);

                count[leftChar]++;

                if(count[leftChar]>0)
                    matched--;

                left++;
            }
        }

        return minLen==Integer.MAX_VALUE
                ? ""
                : s.substring(start,start+minLen);
    }
}