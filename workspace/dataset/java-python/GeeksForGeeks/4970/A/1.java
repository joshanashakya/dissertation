

// Java program to construct a distinct element 
// array with given size, sum, element upper 
// bound and all elements positive 
  
import java.io.*; 
  
class GFG { 
    static void printArray(int N, int SUM, int K) 
    { 
        // smallest possible sum 
        int minSum = (N * (N + 1)) / 2; 
  
        // largest possible sum 
        int maxSum = (N * K) - (N * (N - 1)) / 2; 
  
        if (minSum > SUM || maxSum < SUM) { 
            System.out.println("Not Possible"); 
            return; 
        } 
  
        // Creating array with 
        // minimum possible sum. 
        int arr[] = new int[N + 1]; 
        for (int i = 1; i <= N; i++) 
            arr[i] = i; 
  
        int sum = minSum; 
  
        // running the loop from last because the 
        // array is sorted and running from last 
        // will give largest numbers 
        for (int i = N; i >= 1; i--) { 
  
            // replacing i with K, Note arr[i] = i 
            int x = sum + (K - i); 
            if (x < SUM) { 
                sum = sum + (K - i); 
  
                // can't be incremented further 
                arr[i] = K; 
  
                // to maintain uniqueness 
                K--; 
            } 
  
            else { 
  
                // directly replacing with a suitable 
                // element to make sum as given sum 
                arr[i] += (SUM - sum); 
                sum = SUM; 
                break; 
            } 
        } 
  
        for (int i = 1; i <= N; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int N = 3, SUM = 15, K = 8; 
        printArray(N, SUM, K); 
    } 
} 
  
// This code is contributed by vt_m 

