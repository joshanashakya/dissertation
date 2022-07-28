

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to return the binary 
    // representation of n 
    static String decToBinary(int n) 
    { 
        // Array to store binary representation 
        int[] binaryNum = new int[32]; 
  
        // Counter for binary array 
        int i = 0; 
        while (n > 0) 
        { 
  
            // Storing remainder in binary array 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
  
        // To store the binary representation 
        // as a string 
        String binary = ""; 
        for (int j = i - 1; j >= 0; j--)  
        { 
            binary += String.valueOf(binaryNum[j]); 
        } 
        return binary; 
    } 
  
    // Function to return the frequency of 
    // pat in the given string txt 
    static int countFreq(String pat, String txt)  
    { 
        int M = pat.length(); 
        int N = txt.length(); 
        int res = 0; 
  
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++)  
        { 
            /* For current index i, check for  
            pattern match */
            int j; 
            for (j = 0; j < M; j++) 
            { 
                if (txt.charAt(i + j) != pat.charAt(j))  
                { 
                    break; 
                } 
            } 
  
            // If pat[0...M-1] = txt[i, i+1, ...i+M-1] 
            if (j == M)  
            { 
                res++; 
                j = 0; 
            } 
        } 
        return res; 
    } 
  
    // Function to find the occurrence of 
    // the given pattern in the binary 
    // representation of elements of arr[] 
    static void findOccurrence(int arr[], int n, 
                               String pattern)  
    { 
  
        // For every element of the array 
        for (int i = 0; i < n; i++) 
        { 
  
            // Find its binary representation 
            String binary = decToBinary(arr[i]); 
  
            // Print the occurrence of the given pattern 
            // in its binary representation 
            System.out.print(countFreq(pattern,  
                                       binary) + " "); 
        } 
    } 
      
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr[] = {5, 106, 7, 8}; 
        String pattern = "10"; 
        int n = arr.length; 
        findOccurrence(arr, n, pattern); 
    } 
} 
  
// This code is contributed by PrinciRaj1992 

