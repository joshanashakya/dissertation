

// Java implementation of the approach 
  
class Solution { 
  
    // Function to return a the required result 
    static int sum(int n) 
    { 
        if (n == 1) { 
            return 2; 
        } 
        else { 
            return (n * (n + 1) + sum(n - 1)); 
        } 
    } 
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 2; 
        System.out.println(sum(n)); 
    } 
} 

