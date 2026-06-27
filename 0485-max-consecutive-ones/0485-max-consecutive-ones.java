class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0;
        int currentConsecutive = 0;
        
        for (int num : nums) {
            if (num == 1) {
                currentConsecutive++;
                // Track the maximum streak seen so far
                maxConsecutive = Math.max(maxConsecutive, currentConsecutive);
            } else {
                // Reset the streak when encountering a 0
                currentConsecutive = 0;
            }
        }
        
        return maxConsecutive;
    }
}