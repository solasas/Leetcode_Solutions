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
        int maxi = Integer.MIN_VALUE;

        for (int pile : piles) {
            maxi = Math.max(maxi, pile);
        }

        return maxi;
    }

    private long calculateTotalHours(int[] piles, int hourly) {

        long totalHours = 0;

        for (int pile : piles) {
            totalHours += (pile + hourly - 1) / hourly;
        }

        return totalHours;
    }
}