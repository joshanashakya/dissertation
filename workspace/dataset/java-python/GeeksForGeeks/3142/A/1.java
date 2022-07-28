

// Java Program to find Minimum  
// increment in the sides required  
// to get non-negative area of  
// a triangle 
import java.util.*; 
class GFG 
{  
static int minimumIncrease(int a, int b, 
                           int c) 
{ 
    // push the three sides  
    // to a array 
    int arr[] = { a, b, c }; 
  
    // sort the array 
    Arrays.sort(arr); 
  
    // check if sum is greater 
    // than third side 
    if (arr[0] + arr[1] >= arr[2]) 
        return 0; 
    else
        return arr[2] - (arr[0] + arr[1]); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int a = 3, b = 5, c = 10; 
  
    System.out.println(minimumIncrease(a, b, c)); 
} 
} 
  
// This code is contributed 
// by Shashank 

