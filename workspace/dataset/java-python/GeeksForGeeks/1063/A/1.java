

// Java program to find number of pairs  
// in an array such that their XOR is 0  
import java.util.*; 
  
class GFG  
{ 
  
    // Function to calculate the answer  
    static int calculate(int a[], int n)  
    { 
  
        // Finding the maximum of the array  
        int maximum = Arrays.stream(a).max().getAsInt(); 
  
        // Creating frequency array  
        // With initial value 0  
        int frequency[] = new int[maximum + 1]; 
  
        // Traversing through the array  
        for (int i = 0; i < n; i++)  
        { 
              
            // Counting frequency  
            frequency[a[i]] += 1; 
        } 
        int answer = 0; 
  
        // Traversing through the frequency array  
        for (int i = 0; i < (maximum) + 1; i++)  
        { 
              
            // Calculating answer  
            answer = answer + frequency[i] * (frequency[i] - 1); 
        } 
        return answer / 2; 
    } 
  
    // Driver Code  
    public static void main(String[] args)  
    { 
        int a[] = {1, 2, 1, 2, 4}; 
        int n = a.length; 
  
        // Function calling  
        System.out.println(calculate(a, n)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

