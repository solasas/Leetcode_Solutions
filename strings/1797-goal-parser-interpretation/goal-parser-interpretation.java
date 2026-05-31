class Solution {
    public String interpret(String command) {
        int n=command.length();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<n){
            if(command.charAt(i)=='G'){
                sb.append("G");
                i++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sb.append("o");
                i+=2;
            }
            else{
                sb.append("al");
                i+=4;
            }
        }
        return sb.toString();
    }
}