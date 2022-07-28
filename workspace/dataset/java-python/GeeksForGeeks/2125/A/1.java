

// Java implementation of above approach 
class GFG 
{ 
    // Function to return the count of required numbers 
    static String getCount(int N) 
    { 
      
        // If N is odd then return 0 
        if (N % 2 == 1) 
            return "0"; 
      
        String result = "9"; 
        for (int i = 1; i <= N / 2 - 1; i++) 
            result += "0"; 
        return result; 
    } 
      
    // Driver Code 
    public static void main(String []args) 
    { 
      
        int N = 4; 
        System.out.println(getCount(N)); 
    } 
} 
  
// This code is contributed by ihritik 

