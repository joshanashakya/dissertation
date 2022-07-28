

// Java implementation to check whether the given array 
// is a k sorted array or not 
  
import java.util.Arrays; 
  
class Test 
{ 
    // Method to check whether the given array is 
    // a 'k' sorted array or not 
    static String isKSortedArray(int arr[], int n, int k) 
    { 
        // auxiliary array 'aux' 
        int aux[] = new int[n]; 
           
        // copy elements of 'arr' to 'aux' 
        for (int i = 0; i<n; i++) 
            aux[i] = arr[i]; 
           
        // sort 'aux'     
        Arrays.sort(aux); 
           
        // for every element of 'arr' at index 'i',  
        // find its index 'j' in 'aux' 
        for (int i = 0; i<n; i++) 
        { 
            // index of arr[i] in sorted array 'aux' 
            int j = Arrays.binarySearch(aux,arr[i]); 
               
            // if abs(i-j) > k, then that element is 
            // not at-most k distance away from its  
            // target position. Thus,  'arr' is not a  
            // k sorted array  
            if (Math.abs(i - j) > k) 
                return "No"; 
        } 
           
        // 'arr' is a k sorted array 
        return "Yes";     
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {3, 2, 1, 5, 6, 4}; 
        int k = 2; 
          
        System.out.println("Is it a k sorted array ?: " + 
                            isKSortedArray(arr, arr.length, k)); 
    } 
} 

