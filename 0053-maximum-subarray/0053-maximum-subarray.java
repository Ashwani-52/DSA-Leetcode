class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            //step 1: Create Sum
            sum += nums[i];

            //Step 2: maxSum update krna h
            // if(maxSum < sum){
            //     maxSum = sum;
            // }

            maxSum = Math.max(maxSum, sum);

            //step 3: sum check krna h, Negative h ya nhi
            if(sum < 0){
                sum = 0;
            }
        }
        //return max value
        return maxSum;
    }
}