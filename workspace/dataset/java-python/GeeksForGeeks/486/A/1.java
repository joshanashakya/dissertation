

// Java program for each element  
// in 1st array count elements  
// less than or equal to it in  
// 2nd array  
import java.io.*; 
  
class GFG  
{ 
static int MAX = 100000; 
  
// Function for each element  
// in 1st array count elements  
// less than or equal to it  
// in 2nd array  
static void countEleLessThanOrEqual(int arr1[], int m,  
                                    int arr2[], int n) 
{  
    // Creating hash array initially 
    // filled with zero 
    int hash[] = new int[MAX]; 
      
    // Insert element of arr2[] to 
    // hash such that hash[i] will 
    // give count of element i in arr2[] 
    for (int i = 0; i < n; i++) 
        hash[arr2[i]]++; 
  
    // Presum of hash array 
    // such that hash[i] will  
    // give count of element  
    // less than or equals to  
    // i in arr2[] 
    for(int i = 1; i < MAX; i++) 
    { 
        hash[i] = hash[i] +  
                  hash[i - 1]; 
    } 
      
    // Traverse arr1[] and  
    // print hash[arr[i]] 
    for (int i = 0; i < m; i++)  
    { 
        System.out.print(hash[arr1[i]] + " "); 
    } 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int arr1[] = {1, 2, 3, 4, 7, 9}; 
    int arr2[] = {0, 1, 2, 1, 1, 4}; 
    int m, n; 
      
    m = arr1.length; 
    n = arr2.length; 
      
    countEleLessThanOrEqual(arr1, m, arr2, n); 
} 
} 
  
// This code is contributed 
// by inder_verma 

