class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(List<String> li : items){
            if(ruleKey.equals("type") && li.get(0).equals(ruleValue)){
                count++;
            }
            else if(ruleKey.equals("color") && li.get(1).equals(ruleValue)){
                count++;
            }
            else if(ruleKey.equals("name") && li.get(2).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}