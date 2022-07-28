

// Java program to count substrings 
// with odd decimal value 
import java.io.*; 
import java.util.*; 
  
class GFG { 
     
// function to count number of substrings  
// with odd decimal representation 
static int countSubstr(String s) 
{  
    int n = s.length(); 
      
    // auxiliary array to store count  
    // of 1's before ith index 
    int[] auxArr=new int[n]; 
      
    if (s.charAt(0) == '1') 
        auxArr[0] = 1; 
      
    // store count of 1's before  
    // i-th index 
    for (int i=1; i<n; i++) 
    { 
        if (s.charAt(i) == '1') 
            auxArr[i] = auxArr[i-1]+1; 
        else
            auxArr[i] = auxArr[i-1]; 
    } 
      
    // variable to store answer 
    int count = 0; 
      
    // traverse the string reversely to  
    // calculate number of odd substrings  
    // before i-th index 
    for (int i=n-1; i>=0; i--)  
        if (s.charAt(i) == '1') 
            count += auxArr[i];  
      
    return count; 
} 
  
public static void main (String[] args) { 
     String s = "1101";  
    System.out.println(countSubstr(s)); 
      
    } 
} 
  
// This code is contributed by Gitanjali. 

