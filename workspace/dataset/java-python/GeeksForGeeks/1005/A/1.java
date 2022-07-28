

// Java implementation of the approach 
import java.util.HashSet; 
  
class GFG  
{ 
  
// Function to count numbers to be added 
static int countNum(int arr[], int n) 
{ 
    HashSet<Integer> s = new HashSet<>(); 
    int count = 0,  
        maxm = Integer.MIN_VALUE,  
        minm = Integer.MAX_VALUE; 
  
    // Make a hash of elements 
    // and store minimum and maximum element 
    for (int i = 0; i < n; i++)  
    { 
        s.add(arr[i]); 
        if (arr[i] < minm) 
            minm = arr[i]; 
        if (arr[i] > maxm) 
            maxm = arr[i]; 
    } 
  
    // Traverse all elements from minimum 
    // to maximum and count if it is not 
    // in the hash 
    for (int i = minm; i <= maxm; i++) 
        if (!s.contains(i)) 
            count++; 
    return count; 
} 
  
// Drivers code 
public static void main(String[] args)  
{ 
    int arr[] = { 3, 5, 8, 6 }; 
    int n = arr.length; 
    System.out.println(countNum(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

