

// Java program to count pairs in array whose 
// XOR is odd 
  
public class CountXor { 
    // A function will return number of pair 
    // whose XOR is odd 
    static int countXorPair(int arr[], int n) 
    { 
        // To store count of odd and even numbers 
        int odd = 0, even = 0; 
  
        for (int i = 0; i < n; i++) { 
            // Increase even if number is 
            // even otherwise increase odd 
            if (arr[i] % 2 == 0) 
                even++; 
            else
                odd++; 
        } 
  
        // Return number of pairs 
        return odd * even; 
    } 
  
    // Driver program to test countXorPair() 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 2, 3 }; 
        System.out.println(countXorPair(arr, arr.length)); 
    } 
} 

