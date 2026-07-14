class Solution {
    public double findMaxAverage(int[] nums, int k) {
        Double currentSum = 0.0;
        Double maxSum = 0.0;


        for(int i=0; i<k; i++){
            currentSum += nums[i];
            maxSum = currentSum;
        }

        for(int j=k; j<nums.length; j++){
            currentSum = currentSum - nums[j-k] + nums[j];

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum/k;
        
    }
}