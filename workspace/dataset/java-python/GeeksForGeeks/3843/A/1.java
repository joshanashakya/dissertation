

// Java implementation of 
// above approach 
class GFG  
{ 
  
// Function to count the number 
// of perfect squares and cubes 
static int countSC(int N) 
{ 
    int res = (int)Math.sqrt(N) +  
              (int)Math.cbrt(N) -  
              (int)(Math.sqrt(Math.cbrt(N))); 
  
    return res; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int N = 20; 
  
    System.out.println("Number of squares " +  
                            "and cubes is " +  
                                 countSC(N)); 
} 
} 
  
// This code is contributed 
// by ChitraNayal 

