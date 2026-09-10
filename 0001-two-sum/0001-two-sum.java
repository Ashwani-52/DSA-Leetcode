class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complent = target - nums[i];
            if(map.containsKey(complent)){
                return new int[]{map.get(complent), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}