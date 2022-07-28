

/* Dynamic Programming Java implementation of lds problem */
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG{ 
/* lds() returns the length of the longest dividing  
  subsequence in arr[] of size n */
static int lds( Integer arr[], int n )  
{  
    Integer lds[]=new Integer[n]; 
    
    lds[0] = 1;    
   
    /* Compute optimized lds values in bottom up manner */
    for (int i = 1; i < n; i++ )  
    { 
        lds[i] = 1; 
        for (int j = 0; j < i; j++ )   
            if (lds[j] != 0 && arr[i] % arr[j] == 0)  
                lds[i] = Math.max(lds[i], lds[j] + 1);  
    } 
   
    // Return maximum value in lds[] 
    int max=(int)Collections.max(Arrays.asList(lds)); 
    return max; 
}  
     
/* Driver program to test above function */
public static void main(String args[])  
{  
    Integer arr[] = { 2, 11, 16, 12, 36, 60, 71, 17,  
                     29, 144, 288, 129, 432, 993}; 
    int n =arr.length ;  
    System.out.println("Length of lds is "+lds( arr, n ) );  
} 
}  

