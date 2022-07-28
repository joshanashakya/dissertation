

// Java implementation of the approach 
import java.awt.Point; 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the number 
// of unique pairs in the array 
static int countUnique(int arr[], int n) 
{ 
  
    // Set to store unique pairs 
    Set<Point> s = new HashSet<>(); 
  
    // Make all possible pairs 
    for (int i = 0; i < n; i++) 
        for (int j = 0; j < n; j++) 
            s.add(new Point(arr[i], arr[j])); 
  
    // Return the size of the set 
    return s.size(); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 2, 2, 4, 2, 5, 3, 5 }; 
    int n = arr.length; 
  
    System.out.print(countUnique(arr, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

