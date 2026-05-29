class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0, 1);

        int count = 0;
        int prefixSum = 0;

        for (int num : nums) {

            prefixSum += num;

            if (sumCountMap.containsKey(prefixSum - k)) {
                count += sumCountMap.get(prefixSum - k);
            }

            sumCountMap.put(
                prefixSum,
                sumCountMap.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }
}