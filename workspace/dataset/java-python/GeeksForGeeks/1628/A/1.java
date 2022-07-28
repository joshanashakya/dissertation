

// Java program to sort first half in increasing 
// order and second half in decreasing 
import java.util.*; 
  
public class SortExample { 
    static void mySort(Integer[] arr) 
    { 
        int n = arr.length; 
          
        // Sort the whole array  
        Arrays.sort(arr, 0, n/2); 
        Arrays.sort(arr, n/2, n); 
  
        // Reverse the second half 
        int low = n/2, high = n-1; 
        while (low < high) 
        { 
            Integer temp = arr[low]; 
            arr[low] = arr[high]; 
            arr[high] = temp; 
            low++; high--; 
        }   
    } 
  
    public static void main(String[] args) 
    { 
        // Our arr contains 8 elements 
        Integer[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7 }; 
        mySort(arr); 
        System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(arr)); 
    } 
} 

