

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
    // Function to return the vector containing the answer 
    static ArrayList<Integer> addToArrayForm(ArrayList<Integer> A, int K) 
    { 
      
        // ArrayList v is to store each digits sum 
        // and ArrayList ans is to store the answer 
        ArrayList<Integer> v = new ArrayList<Integer>(); 
        ArrayList<Integer> ans = new ArrayList<Integer>(); 
          
        // No carry in the beginning 
        int rem = 0; 
      
        int i = 0; 
      
        // Start loop from the end 
        // and take element one by one 
        for (i = A.size() - 1; i >= 0; i--) 
        { 
      
            // Array index and last digit of number 
            int my = A.get(i) + K % 10 + rem; 
            if (my > 9)  
            { 
      
                // Maintain carry of summation 
                rem = 1; 
      
                // Push the digit value into the array 
                v.add(my % 10); 
            } 
            else 
            { 
                v.add(my); 
                rem = 0; 
            } 
            K = K / 10; 
        } 
      
        // K value is greater then 0 
        while (K > 0)  
        { 
      
            // Push digits of K one by one in the array 
            int my = K % 10 + rem; 
            v.add(my % 10); 
      
            // Also maintain carry with summation 
            if (my / 10 > 0) 
                rem = 1; 
            else
                rem = 0; 
            K = K / 10; 
        } 
      
        if (rem > 0) 
            v.add(rem); 
      
        // Reverse the elements of vector v 
        // and store it in vector ans 
        for (int j = v.size() - 1; j >= 0; j--) 
            ans.add(v.get(j)); 
      
        return ans; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        ArrayList<Integer> A = new ArrayList<Integer>(); 
        A.add(2); 
        A.add(7); 
        A.add(4); 
          
          
        int K = 181; 
        ArrayList<Integer> ans = addToArrayForm(A, K); 
      
        // Print the answer 
        for (int i = 0; i < ans.size(); i++) 
            System.out.print(ans.get(i)); 
      
    } 
} 
  
// This code is contributed by ihritik 

