

// Java implementation of above approach 
  
class GFG { 
  
    // Function to count total numbers divisible by 
    // x but not y in range 1 to N 
    static int countNumbers(int X, int Y, int N) 
    { 
        int count = 0; 
        for (int i = 1; i <= N; i++) { 
            // Check if Number is divisible 
            // by x but not Y 
            // if yes, Increment count 
            if ((i % X == 0) && (i % Y != 0)) 
                count++; 
        } 
        return count; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
  
        int X = 2, Y = 3, N = 10; 
        System.out.println(countNumbers(X, Y, N)); 
    } 
} 

