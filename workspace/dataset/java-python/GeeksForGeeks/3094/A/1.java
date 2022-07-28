

// Java implementation to make an  
// array decreasing 
import java.util.*; 
  
class GFG{ 
   
// Structure to store elements 
static class Node  
{ 
    int elementID; 
    int stepsToeliminate; 
    public Node(int elementID, int stepsToeliminate) { 
        super(); 
        this.elementID = elementID; 
        this.stepsToeliminate = stepsToeliminate; 
    } 
      
}; 
   
// Function to find the  
// minimum steps required 
static void minSteps(int arr[], int N) 
{ 
    Stack<Node> s = new Stack<Node>(); 
       
    s.add(new Node( 0, -1 )); 
       
    // Minimum steps 
    int maxStepsToeliminate = -1;  
       
    // Loop to iterate  
    // over the array 
    for (int i = 1; i < N; i++) 
    { 
        int stepsToeliminate = 1; 
           
        // Traversing the stack until 
        // it is not empty 
        while (!s.isEmpty()) 
        { 
            // Condition if the top of the 
            // stack is greater than the  
            // current element 
            if (arr[s.peek().elementID] >=  
                                   arr[i]) 
            { 
                stepsToeliminate = Math.max(stepsToeliminate,  
                           s.peek().stepsToeliminate + 1); 
                s.pop(); 
            } 
            else
            { 
                break; 
            } 
        } 
           
        // Condition if no previous 
        // elements value less than 
        // this element then steps is -1 
        if (s.isEmpty()) 
        { 
            stepsToeliminate = -1; 
        } 
       
        maxStepsToeliminate = Math.max( 
            maxStepsToeliminate, stepsToeliminate 
            ); 
        s.add(new Node(i, stepsToeliminate )); 
    } 
       
    System.out.print((maxStepsToeliminate < 0 ? 0 : 
              maxStepsToeliminate) +"\n"); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = {3, 2, 1, 7, 5}; 
       
    int size = arr.length; 
       
    minSteps(arr, size);      
} 
}  
  
// This code is contributed by sapnasingh4991 

