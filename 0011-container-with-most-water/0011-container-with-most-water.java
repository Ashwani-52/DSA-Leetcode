class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int heightValue;
        int width;
        int currentArea = 0;
        int maxArea = 0;
        while(left<right){
            heightValue = Math.min(height[left], height[right]);
            width = right - left;
            currentArea = heightValue * width;
            maxArea = Math.max(maxArea, currentArea);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}