

// Java implementation of the approach  
import java.util.*;  
  
class GFG  
{ 
    static int[] seats = new int[]{ 1, 2, 4 }; 
  
    // Function to return the maximum amount 
    // that can be collected by selling tickets 
    public static int maxAmount(int M, int N) 
    { 
  
        // Priority queue that stores 
        // the count of empty seats 
        PriorityQueue<Integer> q =  
            new PriorityQueue<Integer>(Collections.reverseOrder());  
      
        // Insert each array element 
        // into the priority queue 
        for (int i = 0; i < M; i++) 
        { 
            q.add(seats[i]); 
        } 
  
        // To store the total 
        // number of tickets sold 
        int ticketSold = 0; 
      
        // To store the total amount 
        // of collection 
        int ans = 0; 
      
        // While tickets sold are less than N 
        // and q.top > 0 then update the collected 
        // amount with the top of the priority 
        // queue 
        while (ticketSold < N && q.peek() > 0) 
        { 
            ans = ans + q.peek(); 
            int temp = q.peek(); 
            q.poll(); 
            q.add(temp - 1); 
            ticketSold++; 
        } 
        return ans; 
    } 
      
    // Driver code 
    public static void main(String[] args)  
    { 
        int M = seats.length; 
        int N = 3; 
      
        System.out.print(maxAmount(M, N)); 
    } 
} 
  
// This code is contributed by Sanjit_Prasad 

