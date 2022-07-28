

// Java program to find relation independent of l 
// length of the given pencil, for how much one 
// can write from n pencils. 
class GFG 
{ 
  
// Function to find no of pencils 
static int count(int n) 
{ 
    int x = (n / 3) - 1; 
    if (n % 3 > 0)  
    { 
        x++; 
    } 
    return (4 * x + 4 * n); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 5; 
    System.out.print(count(n) +"\n"); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

