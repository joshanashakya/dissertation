

// Java program to reverse an array without 
// using "-" sign 
import java.util.Arrays; 
  
class GFG { 
  
    // Function to reverse array 
    static void reverseArray(int arr[], int n) 
    { 
     
        // Reverse array in simple manner 
        for (int i = 0; i < n / 2; i++) 
  
        // Swap ith index value with (n-i-1)th 
        // index value 
        // Note : A - B = A + ~B + 1 
        // So n - i = n + ~i + 1 then 
        // n - i - 1 = (n + ~i + 1) + ~1 + 1 
        { 
            swap(arr, i, (n + ~i + 1) + ~1 + 1); 
        } 
    } 
  
    static int[] swap(int[] arr, int i, int j) 
    { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
        return arr; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 5, 3, 7, 2, 1, 6 }; 
        int n = arr.length; 
  
        reverseArray(arr, n); 
  
        // print the reversed array 
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " "); 
        } 
    } 
} 
  
// This code contributed by Rajput-Ji 

