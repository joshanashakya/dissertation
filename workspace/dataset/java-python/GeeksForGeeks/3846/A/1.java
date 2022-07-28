

// Java implementation of efficient algorithm 
// to find greater or same element on left side 
import java.util.TreeSet; 
  
class GFG { 
  
    // Prints greater elements on left side 
    // of every element 
    static void printPrevGreater(int[] arr, int n) 
    { 
        TreeSet<Integer> ts = new TreeSet<>(); 
        for (int i = 0; i < n; i++) { 
            Integer c = ts.ceiling(arr[i]); 
            if (c == null) // If no greater found 
                System.out.print(-1 + " "); 
            else
                System.out.print(c + " "); 
  
            // Then insert 
            ts.add(arr[i]); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int[] arr = { 10, 5, 11, 10, 20, 12 }; 
        int n = arr.length; 
        printPrevGreater(arr, n); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

