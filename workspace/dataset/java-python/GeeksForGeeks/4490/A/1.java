

// An optimized Java program to count unset bits  
// in an integer.  
class GFG  
{ 
  
static int countUnsetBits(int n)  
{  
    int x = n;  
  
    // Make all bits set MSB  
    // (including MSB)  
      
    // This makes sure two bits  
    // (From MSB and including MSB)  
    // are set  
    n |= n >> 1;  
  
    // This makes sure 4 bits  
    // (From MSB and including MSB)  
    // are set  
    n |= n >> 2;  
  
    n |= n >> 4;  
    n |= n >> 8;  
    n |= n >> 16;  
  
    // Count set bits in toggled number  
    return Integer.bitCount(x^ n);  
}  
  
// Driver code  
public static void main(String[] args)  
{ 
    int n = 17;  
    System.out.println(countUnsetBits(n)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

