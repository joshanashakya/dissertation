

// Java program to check if a subsequence 
// of digits is divisible by 8. 
import java.io.*; 
  
class GFG { 
  
    // Function to calculate any permutation 
    // divisible by 8. If such permutation 
    // exists, the function will return 
    // that permutation else it will return -1 
    static boolean isSubSeqDivisible(String str) 
    { 
  
        int i, j, k, l = str.length(); 
        int arr[] = new int[l]; 
  
        // Converting string to integer array for ease  
        // of computations (Indexing in arr[] is  
        // considered to be starting from 1)  
        for (i = 0; i < l; i++)  
            arr[i] = str.charAt(i) - '0';  
  
        // Generating all possible permutations 
        // and checking if any such 
        // permutation is divisible by 8 
        for (i = 0; i < l; i++) { 
            for (j = i; j < l; j++) { 
                for (k = j; k < l; k++) { 
                    if (arr[i] % 8 == 0) 
                        return true; 
  
                    else if ((arr[i] * 10 + arr[j]) % 8 == 0 && i != j) 
                        return true; 
  
                    else if ((arr[i] * 100 + arr[j] * 10 + arr[k]) % 8 == 0
                             && i != j && j != k && i != k) 
                        return true; 
                } 
            } 
        } 
        return false; 
    } 
  
    // Driver function 
    public static void main(String args[]) 
    { 
  
        String str = "3144"; 
        if (isSubSeqDivisible(str)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by Nikita Tiwari. 

