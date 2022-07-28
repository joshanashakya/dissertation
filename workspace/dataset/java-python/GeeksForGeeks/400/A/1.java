

// Java program to count number of pairs 
// such that their hcf and lcm are equal 
  
import java.util.*; 
  
class GFG{ 
   
// Function to count number of pairs 
// such that their hcf and lcm are equal 
static int countPairs(int arr[], int n) 
{ 
    // Store frequencies of array elements 
    HashMap<Integer,Integer> frequency = 
            new HashMap<Integer,Integer>(); 
    for (int i = 0; i < n; i++) { 
        if(frequency.containsKey(arr[i])){ 
            frequency.put(arr[i], frequency.get(arr[i])+1); 
        }else{ 
            frequency.put(arr[i], 1); 
    } 
    } 
   
    int count = 0; 
   
    // Count of pairs (arr[i], arr[j]) 
    // where arr[i] = arr[j] 
    for (Map.Entry<Integer,Integer> x : frequency.entrySet()) { 
        int f = x.getValue(); 
        count += f * (f - 1) / 2; 
    } 
   
    // Count of pairs (arr[i], arr[j]) where 
    // arr[i] = arr[j], 
    return count; 
} 
   
// Driver function 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 1, 1 }; 
    int n = arr.length; 
    System.out.print(countPairs(arr, n)); 
} 
} 
  
// This code contributed by sapnasingh4991 

