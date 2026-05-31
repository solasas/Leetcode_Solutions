class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            sb.append(arr1[i++]);
            sb.append(arr2[j++]);
        }
        while (i < arr1.length)
            sb.append(arr1[i++]);
        while (j < arr2.length)
            sb.append(arr2[j++]);
        return sb.toString();
    }
}