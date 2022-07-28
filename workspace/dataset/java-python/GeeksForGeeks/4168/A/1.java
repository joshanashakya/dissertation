

// Java implementation to count  
// substrings starting with  
// character X and ending 
// with character Y 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
// function to count substrings  
// starting with character X and 
// ending with character Y 
static int countSubstr(String str, int n, 
                       char x, char y) 
{ 
    // to store total count of 
    // required substrings 
    int tot_count = 0; 
  
    // to store count of character  
    // 'x' up to the point the  
    // string 'str' has been 
    // traversed so far 
    int count_x = 0; 
  
    // traverse 'str' form 
    // left to right 
    for (int i = 0; i < n; i++) 
    { 
  
        // if true, increment 'count_x' 
        if (str.charAt(i) == x) 
            count_x++; 
  
        // if true accumulate 'count_x' 
        // to 'tot_count' 
        if (str.charAt(i) == y) 
            tot_count += count_x; 
    } 
  
    // required count 
    return tot_count; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    String str = "abbcaceghcak"; 
    int n = str.length(); 
    char x = 'a', y = 'c'; 
  
    System.out.print ("Count = " + 
       countSubstr(str, n, x, y)); 
} 
} 
  
// This code is contributed 
// by Subhadeep 

