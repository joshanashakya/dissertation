

// Java implementation to count subsets having 
// even numbers only and all are distinct 
import java.util.*; 
  
class GFG  
{ 
  
// function to count the 
// required subsets 
static int countSubsets(int arr[], int n) 
{ 
    HashSet<Integer> us = new HashSet<>(); 
    int even_count = 0; 
          
    // inserting even numbers in the set 'us' 
    // single copy of each number is retained 
    for (int i = 0; i < n; i++) 
        if (arr[i] % 2 == 0) 
            us.add(arr[i]); 
      
      
    // counting distinct even numbers 
    even_count=us.size(); 
      
    // total count of required subsets 
    return (int) (Math.pow(2, even_count) - 1); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = {4, 2, 1, 9, 2, 6, 5, 3}; 
    int n = arr.length; 
    System.out.println("Number of subsets = "
        + countSubsets(arr, n)); 
} 
} 
  
// This code contributed by Rajput-Ji 

