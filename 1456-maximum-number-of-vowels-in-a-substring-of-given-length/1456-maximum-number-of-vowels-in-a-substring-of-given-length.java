class Solution {
    public int maxVowels(String s, int k) {
        int currentCount = 0;
        int maxCount = 0;

        for(int i=0; i<k; i++){
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                currentCount++;
            }
        }

        maxCount = currentCount;

        for(int j=k; j<s.length(); j++){
            char outgoing = s.charAt(j-k);

            if(outgoing == 'a' || outgoing == 'e' || outgoing == 'i' || outgoing == 'o' || outgoing == 'u'){
                currentCount--;
            }
            char incoming = s.charAt(j);
            if(incoming == 'a' || incoming == 'e' || incoming == 'i' || incoming == 'o' || incoming == 'u'){
                currentCount++;
            }
            maxCount = Math.max(maxCount, currentCount);

        }
        return maxCount;
    }
}