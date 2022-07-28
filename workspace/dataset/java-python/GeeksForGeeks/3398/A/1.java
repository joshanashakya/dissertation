

// Java implementation of the approach 
import java.util.*; 
class GFG { 
  
    // Function to return the leftmost 0 
    static int getLeftMostZero(Queue<Integer> zero) 
    { 
  
        // If there are no 0s 
        if (zero.isEmpty()) 
            return -1; 
  
        // Remove the head of the queue 
        zero.remove(); 
        return 0; 
    } 
  
    // Function to return the leftmost 1 
    static int getLeftMostOne(Queue<Integer> one) 
    { 
  
        // If there are no 1s 
        if (one.isEmpty()) 
            return -1; 
  
        // Remove the head of the queue 
        one.remove(); 
        return 1; 
    } 
  
    // Function to return the pre-calculate array 
    // such that arr[i] stores the count of 
    // valid numbers in the range [0, i] 
    static int getLeftMostElement(Queue<Integer> zero, Queue<Integer> one) 
    { 
  
        // If there are no elements left 
        if (zero.isEmpty() && one.isEmpty()) 
            return -1; 
  
        // If only  1s are there 
        else if (zero.isEmpty()) { 
            one.remove(); 
            return 1; 
        } 
  
        // If only 0s are there 
        else if (one.isEmpty()) { 
            zero.remove(); 
            return 0; 
        } 
  
        // Get the element which is at 
        // the left-most position 
        int res = (zero.peek() < one.peek()) ? 0 : 1; 
  
        if (res == 0) 
            zero.remove(); 
        else
            one.remove(); 
  
        return res; 
    } 
  
    // Function to perform the queries 
    static void performQueries(int arr[], int n, int queries[], int q) 
    { 
  
        // To store the indices of 0s and 1s 
        Queue<Integer> zero = new LinkedList<>(); 
        Queue<Integer> one = new LinkedList<>(); 
        for (int i = 0; i < n; i++) { 
            if (arr[i] == 0) 
                zero.add(i); 
            else
                one.add(i); 
        } 
  
        // For every query 
        for (int i = 0; i < q; i++) { 
  
            // Get its type 
            int type = queries[i]; 
            switch (type) { 
  
            // Perform type 1 query 
            case 1: 
                System.out.println(getLeftMostZero(zero)); 
                break; 
  
            // Perform type 2 query 
            case 2: 
                System.out.println(getLeftMostOne(one)); 
                break; 
  
            // Perform type 3 query 
            case 3: 
                System.out.println(getLeftMostElement(zero, one)); 
                break; 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 0, 1, 1, 1 }; 
        int n = arr.length; 
        int queries[] = { 1, 3, 1 }; 
        int q = queries.length; 
  
        performQueries(arr, n, queries, q); 
    } 
} 

