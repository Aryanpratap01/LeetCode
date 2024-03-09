class Solution {
    public void sortColors(int[] nums) {
       // Arrays.sort(nums);
        
        
        
        for(int i=0; i<nums.length; i++){
            for(int j =i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        
       /* int first = 0;
        int last = nums.length-1;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[first] == 2){
                
            }
        }
        
        */
        
    }
}