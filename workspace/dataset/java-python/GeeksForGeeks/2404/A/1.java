

// Java implementation of the above approach  
  
import java.util.Arrays ; 
  
public class GFG { 
  
        
    // Function that finds the largest  
    // element which is repeated 'k' times  
    static void solve(int arr[], int n, int k)  
    {  
        // sort the array  
        Arrays.sort(arr);  
        
        // if the value of 'k' is 1 and the  
        // largest appears only once in the array  
        if (k == 1 && arr[n - 2] != arr[n - 1]) {  
            System.out.println(arr[n - 1]);  
            return;  
        }  
        
        // counter  to count  
        // the repeated elements  
        int count = 1;  
        
        for (int i = n - 2; i >= 0; i--) {  
        
            // check if the element at index 'i'  
            // is equal to the element at index 'i+1'  
            // then increase the count  
            if (arr[i] == arr[i + 1])  
                count++;  
        
            // else set the count to 1  
            // to start counting the frequency  
            // of the new number  
            else
                count = 1;  
        
            // if the count is equal to k  
            // and the previous element  
            // is not equal to this element  
            if (count == k && (i == 0 || (arr[i - 1] != arr[i]))) {  
                System.out.println(arr[i]);  
                return;  
            }  
        }  
        
        // if there is no such element  
        System.out.println("No such element");  
    }  
      
    // Driver code 
    public static void main(String args[]) 
    { 
              int arr[] = { 1, 1, 2, 3, 3, 4, 5, 5, 6, 6, 6 };  
            int k = 2;  
            int n = arr.length;  
            
            // find the largest element  
            // that is repeated K times  
            solve(arr, n, k);  
            
  
    } 
    // This code is contributed by ANKITRAI1 
} 

