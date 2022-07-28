

// Java program to find the count of numbers that  
// can be formed using digits 3, 4 only and  
// having length at max N.  
  
class GFG 
{ 
      
// Function to find the count of numbers that  
// can be formed using digits 3, 4 only and  
// having length at max N.  
static long numbers(int n)  
{  
    return (long)(Math.pow(2, n + 1)) - 2;  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    int n = 2;  
  
    System.out.println( numbers(n));  
}  
} 
  
// This code is contributed by Arnab Kundu 

