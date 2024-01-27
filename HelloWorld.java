class HelloWorld {
    public static void main(String[] args) {
        int result = binaryGap(45);
        System.out.println(result);
    }
    
    private static int binaryGap(int n) {
        Stack<Integer> gaps = new Stack<Integer>();
        int maxCount = 0; 
        while(n > 0 && n %2 == 0) {
            n =n / 2;
        }
        
        int counter = 0;
        
        while(n > 0 ) {
            b = n % 2;
            if(b == 1) {
                maxCount = Math.max(maxCount, gaps.size());
                while(!gaps.empty()){
                    gaps.pop();
                }    
            }
            
            if(b == 0) {
               gaps.push(b); 
            }   
        }
        return maxCount;   
    }
}