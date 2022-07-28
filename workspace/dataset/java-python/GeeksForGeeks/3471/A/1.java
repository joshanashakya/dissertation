

// Java program to find the total 
// time taken to execute the task 
// in given order 
import java.util.*; 
  
class GFG 
{ 
  
// Function to calculate the 
// total time taken to execute 
// the given task in original order 
static int run_tasks(Queue<Integer> A, 
                    Queue<Integer> B) 
{ 
  
    // To find the total time 
    // taken for executing 
    // the task 
    int total_time = 0; 
  
    // While A is not empty 
    while (!A.isEmpty()) 
    { 
  
        // Store the front element of queue A and B 
        int x = A.peek(); 
        int y = B.peek(); 
  
        // If the front element of the queue A 
        // is equal to the front element of queue B 
        // then pop the element from both 
        // the queues and execute the task 
        // Increment total_time by 1 
        if (x == y)  
        { 
            A.remove(); 
            B.remove(); 
            total_time++; 
        } 
  
        // If front element of queue A is not equal 
        // to front element of queue B then 
        // pop the element from queue A & 
        // push it at the back of queue A 
        // Increment the total_time by 2 
        //(1 for push operation and 
        // 1 for pop operation) 
        else
        { 
            A.remove(); 
            A.add(x); 
            total_time += 2; 
        } 
    } 
  
    // Return the total time taken 
    return total_time; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    // Given task to be executed 
    Queue<Integer> A = new LinkedList<Integer>(); 
    A.add(3); 
    A.add(2); 
    A.add(1); 
    A.add(4); 
  
    // Order in which task need to be 
    // executed 
    Queue<Integer> B = new LinkedList<Integer>(); 
    B.add(4); 
    B.add(1); 
    B.add(3); 
    B.add(2); 
  
    // Function the returns the total 
    // time taken to execute all the task 
    System.out.print(run_tasks(A, B)); 
  
} 
} 
  
// This code is contributed by PrinciRaj1992 

