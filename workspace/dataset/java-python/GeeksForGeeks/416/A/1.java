

// Java program to count the number of subarrays 
// that having only 0's and only 1's 
  
import java.io.*; 
  
class GFG { 
      
// Function to count number of subarrays 
static void countSubarraysof1and0(int a[], int n) 
{ 
    int count1 = 0, count0 = 0; 
  
    int number1 = 0, number0 = 0; 
  
    // Iterate in the array to find count 
    // of subarrays with only 1 in it 
    for (int i = 0; i < n; i++) { 
        // check if array element 
        // is 1 or not 
        if (a[i] == 1) { 
            count1 += 1; 
        } 
        else { 
            number1 += (count1) * (count1 + 1) / 2; 
            count1 = 0; 
        } 
    } 
  
    // Iterate in the array to find count 
    // of subarrays with only 0 in it 
    for (int i = 0; i < n; i++) { 
        // check if array element 
        // is 0 or not 
        if (a[i] == 0) { 
            count0 += 1; 
        } 
        else { 
            number0 += (count0) * (count0 + 1) / 2; 
            count0 = 0; 
        } 
    } 
  
    // After iteration completes, 
    // check for the last set of subarrays 
    if (count1>0) 
        number1 += (count1) * (count1 + 1) / 2; 
  
    if (count0>0) 
        number0 += (count0) * (count0 + 1) / 2; 
  
    System.out.println("Count of subarrays of 0 only: " + number0); 
    System.out.println( "\nCount of subarrays of 1 only: " + number1); 
} 
  
// Driver Code 
  
  
    public static void main (String[] args) { 
        int a[] = { 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1 }; 
    int n = a.length; 
  
    countSubarraysof1and0(a, n);; 
    } 
} 
// This code is contributed by inder_verma.. 

