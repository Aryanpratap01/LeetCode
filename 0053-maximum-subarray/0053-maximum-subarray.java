class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int curr = 0;
        
        for(int i=0; i<nums.length; i++){
            
            curr = Math.max(curr + nums[i], nums[i]);
            max = Math.max(curr, max);
        }
        return max;
    }
}