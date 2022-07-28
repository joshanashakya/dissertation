

// Java program to equally divide n elements 
// into two sets such that second set has 
// maximum distinct elements. 
import java.util.*; 
  
class GFG 
{ 
  
static int distribution(int arr[], int n) 
{ 
    Set<Integer> resources = new HashSet<Integer>(); 
  
    // Insert all the resources in the set 
    // There will be unique resources in the set 
    for (int i = 0; i < n; i++)  
        resources.add(arr[i]);  
  
    // return minimum of distinct resources 
    // and n/2 
    return Math.min(resources.size(), n / 2); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 1, 2, 1, 3, 4 }; 
    int n = arr.length; 
    System.out.print(distribution(arr, n) +"\n"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

