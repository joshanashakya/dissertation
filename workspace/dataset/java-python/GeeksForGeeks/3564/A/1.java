

// Java implementation of 
// above approach 
import java.io.*; 
  
class GFG 
{ 
  
// Function to find the  
// value of N 
static int findN(int k) 
{ 
      
    // variable to store  
    // the result 
    int ans; 
  
    // handling case for '0' 
    if (k == 0) 
        ans = 3; 
  
    // handling case for '1' 
    if (k == 1) 
        ans = 1; 
  
    // when number is completely  
    // divided by 4 then minimum 
    // 'x' will be 'k' 
    else if (k % 4 == 0) 
        ans = k; 
  
    // when number divided by 4  
    // gives 3 as remainder then 
    // minimum 'x' will be 'k-1' 
    else if (k % 4 == 3) 
        ans = k - 1; 
  
    // else it is not possible to 
    // get k for any value of x 
    else
        ans = -1; 
  
    return ans; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    // let the given number be 7 
    int k = 7; 
      
    int res = findN(k); 
    if (res == -1) 
        System.out.println("Not possible"); 
    else
        System.out.println(res); 
} 
} 
  
// This code is contributed 
// by inder_verma 

