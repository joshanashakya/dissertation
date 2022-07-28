

// Java program to find the maximum count of 
// values that follow the given condition 
  
import java.util.*; 
public class GFG { 
  
    // Function to find the maximum count of 
    // values that follow the given condition 
    static int check(int A[], int B[], int N) 
    { 
  
        // Initializing the max-heap for the array A[] 
        PriorityQueue<Integer> pq1 
            = new PriorityQueue<Integer>( 
Collections.reverseOrder()); 
  
        // Initializing the max-heap for the array B[] 
        PriorityQueue<Integer> pq2 
            = new PriorityQueue<Integer>( 
Collections.reverseOrder()); 
  
        // Adding the values of A[] into max heap 
        for (int i = 0; i < N; i++) { 
            pq1.add(A[i]); 
        } 
  
        // Adding the values of B[] into max heap 
        for (int i = 0; i < N; i++) { 
            pq2.add(B[i]); 
        } 
  
        // Counter variable 
        int c = 0; 
  
        // Loop to iterate through the heap 
        for (int i = 0; i < N; i++) { 
  
            // Comparing the values at the top. 
            // If the value of heap A[] is greater, 
            // then counter is incremented 
            if (pq1.peek().compareTo(pq2.peek()) == 1) { 
                c++; 
                pq1.poll(); 
                pq2.poll(); 
            } 
            else { 
                if (pq2.size() == 0) { 
                    break; 
                } 
                pq2.poll(); 
            } 
        } 
        return (c); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int A[] = { 10, 3, 7, 5, 8 }; 
        int B[] = { 8, 6, 2, 5, 9 }; 
        int N = A.length; 
  
        System.out.println(check(A, B, N)); 
    } 
} 

