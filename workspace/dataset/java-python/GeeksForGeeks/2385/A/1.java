

/* Java program for efficient approach to find 
largest number having digits in non-decreasing 
order. */
import java.util.*; 
  
class GFG 
{ 
      
// Prints the largest number smaller than s and 
// digits in non-decreasing order. 
static void nondecdigits(String s) 
{ 
    int m = s.length(); 
  
    /* array to store digits of number */
    int[] a = new int[m + 1]; 
  
    /* conversion of characters of string int number */
    for (int i = 0; i < m; i++) 
        a[i] = (int)s.charAt(i) - (int)'0'; 
  
    /* variable holds the value of index after which 
    all digits are set 9 */
    int level = m - 1; 
    for (int i = m - 1; i > 0; i--) 
    { 
        /* Checking the condition if the digit is 
        less than its left digit */
        if (a[i] < a[i - 1]) 
        { 
            a[i - 1]--; 
            level = i - 1; 
        } 
    } 
  
    /* If first digit is 0 no need to print it */
    if (a[0] != 0) 
    { 
        for (int i = 0; i <= level; i++) 
            System.out.print(a[i]); 
        for (int i = level + 1; i < m; i++) 
            System.out.print("9"); 
    } 
    else
    { 
        for (int i = 1; i < level; i++) 
            System.out.print(a[i]); 
        for (int i = level + 1; i < m; i++) 
            System.out.print("9"); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String n = "200"; 
    nondecdigits(n); 
} 
} 
  
// This code is contributed by chandan_jnu 

