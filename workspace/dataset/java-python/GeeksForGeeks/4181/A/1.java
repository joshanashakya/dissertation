

// Java program to count pairs in array whose 
// XOR is odd 
public class CountXor { 
    // A function will return number of pair 
    // whose XOR is odd 
    static int countXorPair(int arr[], int n) 
    { 
        // To store count of XOR pair 
        int count = 0; 
  
        for (int i = 0; i < n; i++) { 
            for (int j = i + 1; j < n; j++) 
  
                // If XOR is odd increase count 
                if ((arr[i] ^ arr[j]) % 2 == 1) 
                    count++; 
        } 
  
        // Return count 
        return count; 
    } 
  
    // Driver program to test countXorPair() 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 2, 3 }; 
        System.out.println(countXorPair(arr, arr.length)); 
    } 
} 

