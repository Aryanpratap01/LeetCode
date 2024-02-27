
        
import java.util.PriorityQueue;

class Solution {
    
    //int n = nums.length;
        //Arrays.sort(nums);
        //return nums[n-k];
    
    
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : nums) {
            pq.offer(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
