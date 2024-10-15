class Solution {
    public int reverse(int x) {
        int neww = 0;
        
        while(x!=0){
            int rem = x%10;
            x = x/10;
            
             if (neww > Integer.MAX_VALUE / 10 || (neww == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (neww < Integer.MIN_VALUE / 10 || (neww == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0; 
            }
            neww = neww*10 + rem;
            
        }
        return neww;
        
    }
}