

// Java program to find the 
// K-th smallest element 
// after removing some  
// integers from natural number. 
class GFG 
{ 
  
// Return the K-th  
// smallest element. 
static int ksmallest(int arr[],  
                     int n, int k) 
{ 
    for (int i = 0; i < n; i++)  
    { 
        if (arr[i] <= k) 
            k++; 
        else
            break; 
    } 
    return k; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int k = 1; 
    int arr[] = { 1 }; 
    int n = arr.length; 
    System.out.println(ksmallest(arr, n, k)); 
} 
} 
  
// This code is contributed  
// by Arnab Kundu 

