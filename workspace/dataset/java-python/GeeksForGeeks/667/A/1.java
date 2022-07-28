

// Java implementation of the approach 
import java.util.HashSet; 
  
public class GFG { 
  
    // Function to return the count 
    // of unique pairs in the array 
    static int getPairs(int a[], int n) 
    { 
        HashSet<Integer> visited1 = new HashSet<Integer>(); 
  
        // un[i] stores number of unique elements 
        // from un[i + 1] to un[n - 1] 
        int un[] = new int[n]; 
  
        // Last element will have no unique elements 
        // after it 
        un[n - 1] = 0; 
  
        // To count unique elements after every a[i] 
        int count = 0; 
        for (int i = n - 1; i > 0; i--) { 
  
            // If current element has already been used 
            // i.e. not unique 
            if (visited1.contains(a[i])) 
                un[i - 1] = count; 
            else
                un[i - 1] = ++count; 
  
            // Set to true if a[i] is visited 
            visited1.add(a[i]); 
        } 
  
        HashSet<Integer> visited2 = new HashSet<Integer>(); 
  
        // To know which a[i] is already visited 
        int answer = 0; 
        for (int i = 0; i < n - 1; i++) { 
  
            // If visited, then the pair would 
            // not be unique 
            if (visited2.contains(a[i])) 
                continue; 
  
            // Calculating total unqiue pairs 
            answer += un[i]; 
  
            // Set to true if a[i] is visited 
            visited2.add(a[i]); 
        } 
        return answer; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int a[] = { 1, 2, 2, 4, 2, 5, 3, 5 }; 
        int n = a.length; 
  
        // Print the count of unique pairs 
        System.out.println(getPairs(a, n)); 
    } 
} 

