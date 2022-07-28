

// Java implementation of the approach 
  
class GFG { 
  
// Function to convert decimal  
// to binary number  
static void bin(Integer n)  
{  
    if (n > 1)  
    bin(n>>1);  
      
    System.out.printf("%d", n & 1);  
}  
  
// Driver code  
  public static void main(String[] args) { 
        bin(131);  
    System.out.printf("\n");  
    bin(3); 
    } 
} 
/*This code is contributed by PrinciRaj1992*/

