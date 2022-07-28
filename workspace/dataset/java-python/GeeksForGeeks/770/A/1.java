

// Java program to find the sum of all minimum 
// occurring elements in an array 
import java.util.Collections; 
import java.util.Comparator; 
import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map; 
  
class GFG  
{  
// Function to find the sum of all minimum 
// occurring elements in an array 
static int findSum(int arr[], int N) 
{ 
    // Store frequencies of elements 
    // of the array 
    Map<Integer,Integer> mp = new HashMap<>(); 
    for (int i = 0; i < N; i++)  
        mp.put(arr[i],mp.get(arr[i])==null?1:mp.get(arr[i])+1); 
  
  
    // Find the min frequency 
    int minFreq = Integer.MAX_VALUE; 
    minFreq = Collections.min(mp.entrySet(),  
            Comparator.comparingInt(Map.Entry::getKey)).getValue(); 
  
  
    // Traverse the map again and find the sum 
    int sum = 0; 
    for (Map.Entry<Integer,Integer> entry : mp.entrySet())  
    { 
        if (entry.getValue() == minFreq) 
        { 
            sum += entry.getKey() * entry.getValue(); 
        } 
    } 
  
    return sum; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int arr[] = { 10, 20, 30, 40, 40 }; 
  
    int N = arr.length; 
  
    System.out.println( findSum(arr, N)); 
} 
} 
  
// This code contributed by Rajput-Ji 

