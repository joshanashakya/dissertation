

// Java implementation of the approach 
import java.util.HashSet; 
import javafx.util.Pair; 
  
class GFG { 
  
    // Function to return the count 
    // of unique pairs in the array 
    static int getPairs(int arr[], int n) 
    { 
  
        // HashSet to store unique pairs 
        HashSet<Pair> h = new HashSet<Pair>(); 
        for (int i = 0; i < n - 1; i++) { 
            for (int j = i + 1; j < n; j++) { 
  
                // Create pair of (a[i], a[j]) 
                // and add it to the hashset 
                Pair<Integer, Integer> p 
                    = new Pair<>(arr[i], arr[j]); 
                h.add(p); 
            } 
        } 
  
        // Return the size of the HashSet 
        return h.size(); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 2, 2, 4, 2, 5, 3, 5 }; 
        int n = arr.length; 
        System.out.println(getPairs(arr, n)); 
    } 
} 

