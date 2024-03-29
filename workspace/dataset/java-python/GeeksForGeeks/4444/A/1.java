

// A sorting based Java program to find missing 
// elements from an array 
  
import java.util.Arrays; 
  
public class PrintMissing { 
    // Print all elements of range [low, high] that 
    // are not present in arr[0..n-1] 
    static void printMissing(int ar[], int low, int high) 
    { 
        Arrays.sort(ar); 
        // Do binary search for 'low' in sorted 
        // array and find index of first element 
        // which either equal to or greater than 
        // low. 
        int index = ceilindex(ar, low, 0, ar.length - 1); 
        int x = low; 
  
        // Start from the found index and linearly 
        // search every range element x after this 
        // index in arr[] 
        while (index < ar.length && x <= high) { 
            // If x doesn't math with current element 
            // print it 
            if (ar[index] != x) { 
                System.out.print(x + " "); 
            } 
  
            // If x matches, move to next element in arr[] 
            else
                index++; 
            // Move to next element in range [low, high] 
            x++; 
        } 
  
        // Print range elements thar are greater than the 
        // last element of sorted array. 
        while (x <= high) { 
            System.out.print(x + " "); 
            x++; 
        } 
    } 
  
    // Utility function to find ceil index of given element 
    static int ceilindex(int ar[], int val, int low, int high) 
    { 
  
        if (val < ar[0]) 
            return 0; 
        if (val > ar[ar.length - 1]) 
            return ar.length; 
  
        int mid = (low + high) / 2; 
        if (ar[mid] == val) 
            return mid; 
        if (ar[mid] < val) { 
            if (mid + 1 < high && ar[mid + 1] >= val) 
                return mid + 1; 
            return ceilindex(ar, val, mid + 1, high); 
        } 
        else { 
            if (mid - 1 >= low && ar[mid - 1] < val) 
                return mid; 
            return ceilindex(ar, val, low, mid - 1); 
        } 
    } 
  
    // Driver program to test above function 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 3, 5, 4 }; 
        int low = 1, high = 10; 
        printMissing(arr, low, high); 
    } 
} 
  
// This code is contributed by Rishabh Mahrsee 

