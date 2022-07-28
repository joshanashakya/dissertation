

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
    // Function to print strictly increasing and 
    // strictly decreasing sequence if possible 
    static void Find_Sequence(int[] arr, int n)  
    { 
  
        // Arrays to store strictly increasing and 
        // decreasing sequence 
        Vector<Integer> inc_arr = new Vector<>(),  
                        dec_arr = new Vector<>(); 
  
        // Initializing last element of both sequence 
        int flag = 0; 
        long inc = -1, dec = (long) 1e7; 
  
        // Iterating through the array 
        for (int i = 0; i < n; i++)  
        { 
  
            // If current element can be appended 
            // to both the sequences 
            if (inc < arr[i] && arr[i] < dec) 
            { 
  
                // If next element is greater than 
                // the current element 
                // Then append it to the strictly 
                // increasing array 
                if (arr[i] < arr[i + 1])  
                { 
                    inc = arr[i]; 
                    inc_arr.add(arr[i]); 
                } 
  
                // Otherwise append it to the 
                // strictly decreasing array 
                else 
                { 
                    dec = arr[i]; 
                    dec_arr.add(arr[i]); 
                } 
            } 
  
            // If current element can be appended 
            // to the increasing sequence only 
            else if (inc < arr[i]) 
            { 
                inc = arr[i]; 
                inc_arr.add(arr[i]); 
            } 
  
            // If current element can be appended 
            // to the decreasing sequence only 
            else if (dec > arr[i]) 
            { 
                dec = arr[i]; 
                dec_arr.add(arr[i]); 
            } 
  
            // Else we can not make such sequences 
            // from the given array 
            else
            { 
                System.out.println(-1); 
                flag = 1; 
                break; 
            } 
        } 
  
        // Print the required sequences 
        if (flag == 0)  
        { 
            for (int i : inc_arr) 
                System.out.print(i + " "); 
            System.out.println(); 
  
            for (int i : dec_arr) 
                System.out.print(i + " "); 
            System.out.println(); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int[] arr = { 5, 1, 3, 6, 8, 2, 9, 0, 10 }; 
        int n = arr.length; 
        Find_Sequence(arr, n); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

