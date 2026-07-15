class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int answer = 0;
        int currentSum = 0;
        for(int i=0; i<k; i++){
            currentSum = currentSum + arr[i];
        }
        if(currentSum >= threshold * k){
                answer++;
            }

        for(int j=k; j<arr.length; j++){
            currentSum = currentSum - arr[j-k] + arr[j];
            if(currentSum >= threshold * k){
                answer++;
            }
        }
        return answer;
    }
}