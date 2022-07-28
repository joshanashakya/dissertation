

// Java implementation to find N 
// modulo 4 using Bitwise AND operator 
  
class Main { 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        int N = 43; 
  
        int ans = findRemainder(N); 
  
        System.out.println(ans); 
    } 
  
    // Function to find the remainder 
    public static int findRemainder(int n) 
    { 
        // Bitwise AND with 3 
        int x = n & 3; 
  
        // return  x 
        return x; 
    } 
} 

