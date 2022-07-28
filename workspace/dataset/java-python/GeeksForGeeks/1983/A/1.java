

// Java program for sorting array elements 
// with set bits equal to K 
import java.util.*; 
  
// Represents node of a doubly linked list  
class Node  
{ 
  
    // Function to sort elements with 
    // set bits equal to k 
    static void sortWithSetbits(int arr[], int n, int k) 
    { 
        // initialise two vectors 
        Vector<Integer> v1 = new Vector<>(), v2 = new Vector<>(); 
  
        for (int i = 0; i < n; i++) { 
            if (Integer.bitCount(arr[i]) == k)  
            { 
  
                // first vector contains indices of 
                // required element 
                v1.add(i); 
  
                // second vector contains  
                // required elements 
                v2.add(arr[i]); 
            } 
        } 
  
        // sorting the elements in second vector 
        Collections.sort(v2); 
  
        // replacing the elements with k set bits 
        // with the sorted elements 
        for (int i = 0; i < v1.size(); i++)  
        { 
            arr[v1.get(i)] = v2.get(i); 
        } 
  
        // printing the new sorted array elements 
        for (int i = 0; i < n; i++)  
        { 
            System.out.print(arr[i] + " "); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = {14, 255, 1, 7, 13}; 
        int n = arr.length; 
        int k = 3; 
  
        sortWithSetbits(arr, n, k); 
    } 
} 
  
// This code is contributed by Princi Singh 

