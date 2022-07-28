

// Java implementation of the approach 
class GFG { 
          
    // Function to return the Least number 
    static int nearest(int n) 
    { 
      
        // Get the perfect square 
        // before and after N 
        int prevSquare = (int)Math.sqrt(n); 
        int nextSquare = prevSquare + 1; 
        prevSquare = prevSquare * prevSquare; 
        nextSquare = nextSquare * nextSquare; 
      
        // Check which is nearest to N 
        int ans = (n - prevSquare) < (nextSquare - n)? (prevSquare - n): (nextSquare - n); 
      
        // return the result 
        return ans; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 14; 
        System.out.println(nearest(n)); 
      
        n = 16; 
        System.out.println(nearest(n)) ; 
      
        n = 18; 
        System.out.println(nearest(n)) ; 
      
    } 
} 
  
// This code is contributed by AnkitRai01 

