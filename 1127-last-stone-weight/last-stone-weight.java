class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> qu=new PriorityQueue<>(Collections.reverseOrder());
        for(int num :stones){
            qu.add(num);
        }
        while(qu.size()>1){
            int s1=qu.poll();
            int s2=qu.poll();
            int diff=Math.abs(s1-s2);
            if(diff>0){
            qu.add(diff);
            }
            
        }
        return (qu.isEmpty()) ? 0 : qu.poll();

    }
}