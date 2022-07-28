

// Java program to find the sum of all maximum 
// occurring elements in an array 
import java.util.*; 
  
class GFG  
{ 
  
// Function to find the sum of all maximum 
// occurring elements in an array 
static int findSum(int arr[], int N) 
{ 
    // Store frequencies of elements 
    // of the array 
    Map<Integer,Integer> mp = new HashMap<>(); 
    for (int i = 0 ; i < N; i++) 
    { 
        if(mp.containsKey(arr[i])) 
        { 
            mp.put(arr[i], mp.get(arr[i])+1); 
        } 
        else
        { 
            mp.put(arr[i], 1); 
        } 
    } 
  
    // Find the max frequency 
    int maxFreq = 0; 
    for (Map.Entry<Integer,Integer> entry : mp.entrySet())  
    { 
        if (entry.getValue() > maxFreq)  
        { 
            maxFreq = entry.getValue(); 
        } 
    } 
  
    // Traverse the map again and find the sum 
    int sum = 0; 
    for (Map.Entry<Integer,Integer> entry : mp.entrySet())  
    { 
        if (entry.getValue() == maxFreq)  
        { 
            sum += entry.getKey() * entry.getValue(); 
        } 
    } 
  
    return sum; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
  
    int arr[] = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 3 }; 
  
    int N = arr.length; 
    System.out.println(findSum(arr, N)); 
} 
} 
  
// This code is contributed by Princi Singh 

