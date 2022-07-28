

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Numbers are in range of pow(3, 32) 
static int []arr = new int[33]; 
  
// Conversion of ternary into balanced ternary as 
// start iterating from Least Significant Bit (i.e 0th),  
// if encountered 0 or 1, safely skip and pass carry 0  
// further 2, replace it to -1 and pass carry 1 further 
// 3, replace it to 0 and pass carry 1 further 
static void balTernary(int ter) 
{ 
    int carry = 0, base = 10; 
    int i = 32; 
    while (ter > 0)  
    { 
        int rem = ter % base; 
        rem = rem + carry; 
        if (rem == 0)  
        { 
            arr[i--] = 0; 
            carry = 0; 
        } 
        else if (rem == 1)  
        { 
            arr[i--] = 1; 
            carry = 0; 
        } 
        else if (rem == 2) 
        { 
            arr[i--] = -1; 
            carry = 1; 
        } 
        else if (rem == 3)  
        { 
            arr[i--] = 0; 
            carry = 1; 
        } 
        ter = (int)(ter / base); 
    } 
    if (carry == 1) 
        arr[i] = 1; 
} 
  
// Similar to binary conversion 
static int ternary(int number) 
{ 
    int ans = 0, rem = 1, base = 1; 
    while (number > 0)  
    { 
        rem = number % 3; 
        ans = ans + rem * base; 
        number = (int)(number/3); 
        base = base * 10; 
    } 
    return ans; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int number = 3056; 
  
    int ter = ternary(number); 
    Arrays.fill(arr,0); 
    balTernary(ter); 
  
    int i = 0; 
  
    // Moving on to first occupied bit 
    while (arr[i] == 0)  
    { 
        i++; 
    } 
  
    // Printing 
    for (int j = i; j <= 32; j++)  
    { 
  
        // Print 'Z' in place of -1 
        if (arr[j] == -1) 
            System.out.print('Z'); 
        else
        System.out.print(arr[j]); 
    } 
} 
} 
  
// This code is contributed by SURENDRA_GANGWAR 

