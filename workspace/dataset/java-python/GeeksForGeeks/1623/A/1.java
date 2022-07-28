

// Java program sort array in even and odd manner. 
// The odd numbers are to be sorted in descending 
// order and the even numbers in ascending order 
  
import java.util.Arrays; 
  
public class GFG { 
    // To do two way sort. First sort even numbers in 
    // ascending order, then odd numbers in descending 
    // order. 
    static void twoWaySort(int arr[], int n) 
    { 
        // Make all odd numbers negative 
        for (int i = 0; i < n; i++) 
            if ((arr[i] & 1) != 0) // Check for odd 
                arr[i] *= -1; 
  
        // Sort all numbers 
        Arrays.sort(arr); 
  
        // Retaining original array 
        for (int i = 0; i < n; i++) 
            if ((arr[i] & 1) != 0) 
                arr[i] *= -1; 
    } 
  
    // Driver Method 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 3, 2, 7, 5, 4 }; 
  
        twoWaySort(arr, arr.length); 
  
        System.out.println(Arrays.toString(arr)); 
    } 
} 

