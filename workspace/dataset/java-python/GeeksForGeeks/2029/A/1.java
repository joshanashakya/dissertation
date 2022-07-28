

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the number having 
// sum of digits as s and d number of 
// digits such that the difference between 
// the maximum and the minimum digit 
// the minimum possible 
static String findNumber(int s, int d) 
{ 
    // To store the final number 
    String num = ""; 
  
    // To store the value that is evenly 
    // distributed among all the digits 
    int val = s / d; 
  
    // To store the remaining sum that still 
    // remains to be distributed among d digits 
    int rem = s % d; 
  
    int i; 
  
    // rem stores the value that still remains 
    // to be distributed 
    // To keep the difference of digits minimum 
    // last rem digits are incremented by 1 
    for (i = 1; i <= d - rem; i++) 
    { 
        num = num + String.valueOf(val); 
    } 
  
    // In the last rem digits one is added to 
    // the value obtained by equal distribution 
    if (rem > 0)  
    { 
        val++; 
        for (i = d - rem + 1; i <= d; i++) 
        { 
            num = num + String.valueOf(val); 
        } 
    } 
    return num; 
} 
  
// Driver function 
public static void main(String[] args) 
{ 
    int s = 25, d = 4; 
  
    System.out.print(findNumber(s, d)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

