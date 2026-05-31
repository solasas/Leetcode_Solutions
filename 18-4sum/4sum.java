class Solution {

    public List<List<Integer>> fourSum(int[] nums,
                                       int target) {

        Set<List<Integer>> result = new HashSet<>();

        int n = nums.length;

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                Set<Long> seen =  new HashSet<>();

                for(int k=j+1;k<n;k++){

                    long needed = (long)target - nums[i] - nums[j] - nums[k];

                    if(seen.contains(needed)){

                        List<Integer> quad =
                            Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[k],
                                (int)needed
                            );

                        Collections.sort(quad);

                        result.add(quad);
                    }

                    seen.add((long)nums[k]);
                }
            }
        }

        return new ArrayList<>(result);
    }
}