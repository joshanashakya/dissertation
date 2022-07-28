

// Java implementation of the approach 
class GFG { 
  
    // Function to return the smallest sum 
    // of 2 n-digit numbers 
    static int smallestSum(int n) 
    { 
        if (n == 1) 
            return 0; 
        return (2 * (int)Math.pow(10, n - 1)); 
    } 
  
    // Function to return the largest sum 
    // of 2 n-digit numbers 
    static int largestSum(int n) 
    { 
        return (2 * ((int)Math.pow(10, n) - 1)); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 4; 
        System.out.println("Largest = " + largestSum(n)); 
        System.out.print("Smallest = " + smallestSum(n)); 
    } 
} 

