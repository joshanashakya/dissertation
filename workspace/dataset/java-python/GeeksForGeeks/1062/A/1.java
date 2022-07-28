

// Java program to find number  
// of pairs in an array such 
// that their XOR is 0 
import java.util.*; 
  
class GFG  
{ 
    // Function to calculate  
    // the count 
    static int calculate(int a[], int n) 
    { 
        // Sorting the list using 
        // built in function 
        Arrays.sort(a); 
      
        int count = 1; 
        int answer = 0; 
      
        // Traversing through the 
        // elements 
        for (int i = 1; i < n; i++)  
        { 
          
            if (a[i] == a[i - 1]) 
            { 
                // Counting frequency of each  
                // elements 
                count += 1; 
                  
            }  
            else
            { 
                // Adding the contribution of 
                // the frequency to the answer 
                answer = answer + (count * (count - 1)) / 2; 
                count = 1; 
            } 
        } 
      
        answer = answer + (count * (count - 1)) / 2; 
      
        return answer; 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
        int a[] = { 1, 2, 1, 2, 4 }; 
        int n = a.length; 
      
        // Print the count 
        System.out.println(calculate(a, n)); 
    } 
} 
  
// This code is contributed by Ansu Kumari. 

