

// Java implementation to find 
// N'th stepping natural Number 
import java.util.*; 
  
class GFG{ 
   
// Function to find the 
// Nth stepping natural number 
static int NthSmallest(int K) 
{ 
   
    // Declare the queue 
    Queue<Integer> Q = new LinkedList<>(); 
   
    int x = 0; 
   
    // Enqueue 1, 2, ..., 9 in this order 
    for (int i = 1; i < 10; i++) 
        Q.add(i); 
   
    // Perform K operation on queue 
    for (int i = 1; i <= K; i++) { 
   
        // Get the ith Stepping number 
        x = Q.peek(); 
   
        // Perform Dequeue from the Queue 
        Q.remove(); 
   
        // If x mod 10 is not equal to 0 
        if (x % 10 != 0) { 
   
            // then Enqueue 10x + (x mod 10) - 1 
            Q.add(x * 10 + x % 10 - 1); 
        } 
   
        // Enqueue 10x + (x mod 10) 
        Q.add(x * 10 + x % 10); 
   
        // If x mod 10 is not equal to 9 
        if (x % 10 != 9) { 
   
            // then Enqueue 10x + (x mod 10) + 1 
            Q.add(x * 10 + x % 10 + 1); 
        } 
    } 
   
    // Return the dequeued number of the K-th 
    // operation as the Nth stepping number 
    return x; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
   
    // initialise K 
    int N = 16; 
   
    System.out.print(NthSmallest(N)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

