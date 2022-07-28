

// Java program to maximum set bit sum in array 
// without considering adjacent elements 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
// Function to count total number   
// of set bits in an integer 
static int bit(int n) 
{ 
    int count = 0; 
      
    while(n > 0) 
    { 
        count++; 
        n = n & (n - 1); 
    } 
      
    return count; 
} 
  
// Maximum sum of set bits 
static int maxSumOfBits(int arr[], int n) 
{  
// Calculate total number of set bits 
// for every element of the array 
for(int i = 0; i < n; i++) 
{ 
    // find total set bits for  
    // each number and store  
    // back into the array 
    arr[i] = bit(arr[i]); 
} 
  
int incl = arr[0];  
int excl = 0;  
int excl_new;  
  
for (int i = 1; i < n; i++)  
{  
    // current max excluding i  
    excl_new = (incl > excl) ?   
                        incl : excl;  
  
    // current max including i  
    incl = excl + arr[i];  
    excl = excl_new;  
}  
  
// return max of incl and excl  
return ((incl > excl) ?  
                 incl : excl);  
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = {1, 2, 4, 5,  
                 6, 7, 20, 25}; 
      
    int n = arr.length; 
      
    System.out.print(maxSumOfBits(arr, n)); 
}  
} 
  
// This code is contributed 
// by Subhadeep 

