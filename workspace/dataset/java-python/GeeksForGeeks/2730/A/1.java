

// Java  implementation of the approach 
import java.util.*; 
class Solution 
{ 
// Function that returns false if 
// the number passed as argument contains 
// digit(s) other than '0' or '1' 
static boolean isBinary(int n) 
{ 
    while (n != 0) { 
        int temp = n % 10; 
        if (temp != 0 && temp != 1) { 
            return false; 
        } 
        n = n / 10; 
    } 
    return true; 
} 
  
//Function that checks whether the  
//binary String can be formed or not 
static void formBinaryStr(int n, int a[]) 
{ 
    boolean flag = true; 
  
    // Empty String for storing 
    // the binary number 
    String s = ""; 
  
    for (int i = 0; i < n; i++) { 
  
        // check if a[i] can be a 
        // part of the binary String 
        if (isBinary(a[i])) 
  
            // Conversion of int into String 
            s += ""+a[i]; 
        else { 
  
            // if a[i] can't be a part 
            // then break the loop 
            flag = false; 
            break; 
        } 
    } 
  
    // possible to create binary String 
    if (flag) 
        System.out.print( s + "\n"); 
  
    // impossible to create binary String 
    else
        System.out.print( "-1\n"); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
  
    int a[] = { 10, 1, 0, 11, 10 }; 
    int N = a.length; 
  
    formBinaryStr(N, a); 
} 
} 
//contributed by Arnab Kundu 

