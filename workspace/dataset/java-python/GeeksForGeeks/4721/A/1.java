

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
      
// Function that returns true if the array  
// can be reduced to 0s with the given  
// operation performed given number of times  
static boolean check(int arr[], int N, int K)  
{  
    // Set to store unique elements  
    HashSet<Integer> unique = new HashSet<Integer>(); 
  
  
    // Add every element of the array  
    // to the set  
    for (int i = 0; i < N; i++)  
        unique.add(arr[i]);  
  
    // Count of all the unique elements  
    // in the array  
    if (unique.size() == K)  
        return true;  
    return false;  
}  
  
// Driver code  
public static void main(String[] args)  
{ 
    int arr[] = { 1, 1, 2, 3 };  
    int N = arr.length;  
    int K = 3;  
    if (check(arr, N, K))  
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

