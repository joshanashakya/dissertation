

// Java implementation of the approach 
class GFG { 
  
    // Function to print the largest n-digit 
    // even and odd numbers 
    static void findNumbers(int n) 
    { 
        int odd = (int)Math.pow(10, n) - 1; 
        int even = odd - 1; 
        System.out.println("Even = " + even); 
        System.out.print("Odd = " + odd); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 4; 
        findNumbers(n); 
    } 
} 

