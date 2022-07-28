

// Java program to check 
// if there are two 
// adjacent set bits. 
class GFG  
{ 
      
    static boolean adjacentSet(int n) 
    { 
        int x = (n & (n >> 1)); 
          
        if(x == 1) 
            return true; 
        else
            return false; 
    } 
      
    // Driver code  
    public static void main(String args[])  
    { 
  
        int n = 3; 
          
        if(adjacentSet(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No");  
  
    } 
} 
  
// This code is contributed by Sam007. 

