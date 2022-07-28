

// Java program to find the number  
// with more leading zeroes.  
class GFG 
{ 
// Function to compare the no.  
// of leading zeros  
static void LeadingZeros(int x, int y)  
{  
    // if both have same no. of  
    // leading zeros  
    if ((x ^ y) <= (x & y))  
        System.out.print("\nEqual"); 
  
    // if y has more leading zeros  
    else if ((x & (~y)) > y)  
        System.out.print(y);  
  
    else
        System.out.print(x);  
}  
  
// Driver Code 
public static void main (String[] args)  
{ 
    int x = 10, y = 16;  
    LeadingZeros(x, y);  
} 
}  
  
// This code is contributed by Smitha 

