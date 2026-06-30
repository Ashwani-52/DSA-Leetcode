class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        boolean isPalindrome = true;

        while(left<right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(rightChar)){
                right--;
                continue;
            }

            leftChar = Character.toLowerCase(leftChar);
            rightChar = Character.toLowerCase(rightChar);

            if(leftChar != rightChar){
                isPalindrome = false;
                break;
            }
            left++;
            right--;

            
        }
        return isPalindrome;
    }
}