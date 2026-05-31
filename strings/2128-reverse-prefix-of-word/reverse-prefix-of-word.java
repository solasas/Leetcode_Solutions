class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        int end = -1;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            st.push(c);
            if (c == ch) {
                end = i;
                break;
            }
        }
        if (end == -1)
            return word;
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        for (int i = end + 1; i < word.length(); i++) {
            sb.append(word.charAt(i));
        }
        return sb.toString();

    }
}