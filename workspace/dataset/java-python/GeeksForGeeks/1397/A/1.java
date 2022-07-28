

import java.util.*; 
  
class Solution 
{ 
//count number of set bits 
static int __builtin_popcount(int n) 
{ 
    //count variable 
    int count=0; 
      
    while(n>0) 
    { 
        //if the bit is 1 
        if(n%2==1) 
        count++; 
          
        n=n/2; 
    } 
    return count; 
} 
      
// function to Count all values of x  
static void count_values(int n)  
{  
    // Count set bits in n  
    // by using stl function  
    int set_bits = __builtin_popcount(n);  
    
    // count all subset of set bits  
    System.out.println((int)Math.pow(2, set_bits));  
}  
    
// Driver code  
public static void main(String args[]) 
{  
    
    int n = 27;  
    count_values(n);  
    
  
}  
} 
  
// This code is contributed 
// by Arnab Kundu 

