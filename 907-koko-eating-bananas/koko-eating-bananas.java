class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = findMax(piles);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long totalHours = calculateTotalHours(piles, mid);

            if (totalHours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private int findMax(int[] piles) {
        int max = Integer.MIN_VALUE;

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        return max;
    }

    private long calculateTotalHours(int[] piles, int hourly) {

        long totalHours = 0;

        for (int pile : piles) {
            totalHours += (long) Math.ceil((double) pile / hourly);
        }

        return totalHours;
    }
}