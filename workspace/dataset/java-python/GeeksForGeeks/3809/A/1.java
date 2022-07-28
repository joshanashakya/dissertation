

// Java program to find the sum of all odd 
// occurring elements in an array 
import java.util.*; 
  
class GFG  
{ 
  
// Function to find the sum of all odd 
// occurring elements in an array 
static int findSum(int arr[], int N) 
{ 
    // Store frequencies of elements 
    // of the array 
    Map<Integer,Integer> mp = new HashMap<>(); 
    for (int i = 0; i < N; i++) 
        mp.put(arr[i],mp.get(arr[i])==null?1:mp.get(arr[i])+1); 
  
    // variable to store sum of all 
    // odd occurring elements 
    int sum = 0; 
  
    // loop to iterate through map 
    for (Map.Entry<Integer,Integer> entry : mp.entrySet()) 
    { 
  
        // check if frequency is odd 
        if (entry.getValue() % 2 != 0) 
            sum += (entry.getKey()) * (entry.getValue()); 
    } 
  
    return sum; 
} 
  
// Driver Code 
public static void main(String args[])  
{ 
    int arr[] = { 10, 20, 20, 10, 40, 40, 10 }; 
  
    int N = arr.length; 
  
    System.out.println(findSum(arr, N)); 
} 
} 
  
/* This code is contributed by PrinciRaj1992 */

