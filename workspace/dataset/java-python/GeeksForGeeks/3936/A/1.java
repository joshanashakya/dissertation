

// Java program to find if 
// it is possible to make  
// all array elements 0 by 
// decrement operations. 
import java.io.*; 
  
class GFG  
{ 
    static boolean isPossibleToZero(int a[],     
                                    int n) 
{ 
    // used for storing the  
    // sum of even and odd  
    // position element in array. 
    int even = 0, odd = 0;  
      
    for (int i = 0; i < n; i++)  
    { 
        // if position is odd,  
        // store sum value of  
        // odd position in odd 
        if ((i & 1) == 0)  
            odd += a[i]; 
          
        // if position is even,  
        // store sum value of  
        // even position in even 
        else
            even += a[i]; 
    } 
      
    return (odd == even); 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int arr[] = { 0, 1, 1, 0 }; 
    int n = arr.length; 
    if (isPossibleToZero(arr, n)) 
        System.out.println("YES"); 
    else
        System.out.println("NO"); 
} 
} 
  
// This code is contributed by m_kit 

