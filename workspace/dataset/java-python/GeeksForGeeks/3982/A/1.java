

import java.util.*; 
  
//Java program to delete elements from array. 
class GFG { 
  
// Function for deleting k elements 
    static void deleteElements(int arr[], int n, int k) { 
        // Create a stack and push arr[0] 
        Stack<Integer> s = new Stack<>(); 
        s.push(arr[0]); 
  
        int count = 0; 
  
        // traversing a loop from i = 1 to n 
        for (int i = 1; i < n; i++) { 
  
            // condition for deleting an element 
            while (!s.empty() && s.peek() < arr[i] 
                    && count < k) { 
                s.pop(); 
                count++; 
            } 
  
            s.push(arr[i]); 
        } 
  
        // Putting elements of stack in a vector 
        // from end to begin. 
        int m = s.size(); 
        Integer[] v = new Integer[m]; // Size of vector is m 
        while (!s.empty()) { 
  
            // push element from stack to vector v 
            v[--m] = s.peek(); 
            s.pop(); 
        } 
  
        // printing result 
        for (Integer x : v) { 
            System.out.print(x + " "); 
        }; 
  
        System.out.println(""); 
    } 
  
// Driver code 
    public static void main(String[] args) { 
        int n = 5, k = 2; 
        int arr[] = {20, 10, 25, 30, 40}; 
        deleteElements(arr, n, k); 
    } 
} 
// This code is contributed by PrinciRaj1992 

