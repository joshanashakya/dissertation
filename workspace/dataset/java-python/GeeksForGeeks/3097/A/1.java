

// Java implementation of the approach 
import java.util.*;  
  
class GFG 
{ 
  
    // Function to return the count  
    // of the required pairs  
    static int countPairs(int arr[], int n)  
    {  
      
        // Calculating the valid pairs  
        // in forward direction  
        int forward[] = new int[n];  
        Stack<Integer> sForward = new Stack<Integer>();  
        for (int i = 0; i < n; i++) 
        {  
            while (!sForward.empty()  
                && arr[i] > arr[(Integer)sForward.peek()]) 
            {  
                forward[(Integer)sForward.peek()] = 1;  
                sForward.pop();  
            }  
            sForward.push(i);  
        }  
      
        // Calculating the valid pairs  
        // in backward direction  
        int backward [] = new int[n] ;  
        Stack<Integer> sBackward = new Stack<Integer>() ;  
        for (int i = n - 1; i >= 0; i--) 
        {  
            while (!sBackward.empty()  
                && arr[i] > arr[(Integer)sBackward.peek()]) 
            {  
                backward[(Integer)sBackward.peek()] = 1;  
                sBackward.pop();  
            }  
            sBackward.push(i);  
        }  
      
        // Calculating the total number of pairs  
        int res = 0;  
        for (int i = 0; i < n; i++) 
        {  
            res += forward[i] + backward[i];  
        }  
        return res;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int arr[] = { 1, 2, 3, 4, 5 };  
        int n = arr.length;  
      
        System.out.println(countPairs(arr, n));  
    } 
} 
  
// This code is contributed by AnkitRai01 

