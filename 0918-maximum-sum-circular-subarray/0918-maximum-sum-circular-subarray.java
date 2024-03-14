class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        for (int i=0; i<nums.length; i++) {
            total += nums[i];
        }
        
        int maxSum = Integer.MIN_VALUE;
        int currMax = 0;
        int minSum = Integer.MAX_VALUE;
        int currMin = 0;
    
        for (int i=0; i<nums.length; i++) {
            currMax = Math.max(currMax + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currMax);
            
            currMin = Math.min(currMin + nums[i], nums[i]);
            minSum = Math.min(minSum, currMin);
        } 
        
        if (maxSum < 0) {
            return maxSum;
        }
        
        int circularMaxSum = total - minSum;
        
        return Math.max(maxSum, circularMaxSum);
    }
}
