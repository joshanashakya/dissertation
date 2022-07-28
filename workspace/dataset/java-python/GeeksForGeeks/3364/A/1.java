

// Java implementation of the approach  
class sol 
{ 
      
// Function that returns true if it is possible to  
// make a binary string consisting of l 0's, m 1's,  
// x "01" sub-sequences and y "10" sub-sequences  
static boolean isPossible(int l, int m, int x, int y)  
{  
    if (l * m == x + y)  
        return true;  
  
    return false;  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    int l = 3, m = 2, x = 4, y = 2;  
  
    if (isPossible(l, m, x, y))  
        System.out.print("Yes");  
    else
        System.out.print("No");  
  
}  
} 
  
// This code is contributed by Arnab Kundu 

