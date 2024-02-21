class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> s = new Stack<>();
        
        for(int i=0;i<operations.length;i++){
            
            if(operations[i].equals("C")){
                s.pop();
            }
            
            else if(operations[i].equals("D")){
                s.push((s.peek())*2);
            }
            
            else if(operations[i].equals("+")){
                int a = s.pop();
                int b = s.pop();
                int c=a+b;
                s.push(b);
                s.push(a);
                s.push(c);
            }
            
            else{
                s.push(Integer.parseInt(operations[i]));
            }
            
        }
        
        int sum=0;
        while(!s.isEmpty()){
            sum += s.pop();
        }
        return sum;
        
    }
}