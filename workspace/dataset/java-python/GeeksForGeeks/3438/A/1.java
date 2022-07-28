

// Java program for Indexed Sequential Search 
  
import java.io.*; 
  
class GFG { 
     
  
  
static void indexedSequentialSearch(int arr[], int n, int k) 
{ 
    int elements[] = new int[20]; 
    int indices[] = new int[20]; 
    int temp, i; 
    int j = 0, ind = 0, start=0, end=0; 
    for (i = 0; i < n; i += 3) { 
  
        // Storing element 
        elements[ind] = arr[i]; 
  
        // Storing the index 
        indices[ind] = i; 
        ind++; 
    } 
    if (k < elements[0]) { 
        System.out.println("Not found"); 
        return; 
          
    } 
    else { 
        for (i = 1; i <= ind; i++) 
            if (k < elements[i]) { 
                start = indices[i - 1]; 
                end = indices[i]; 
                break; 
            } 
    } 
    for (i = start; i <= end; i++) { 
        if (k == arr[i]) { 
            j = 1; 
            break; 
        } 
    } 
    if (j == 1) 
        System.out.println("Found at index "+ i); 
    else
        System.out.println("Not found"); 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
        int arr[] = { 6, 7, 8, 9, 10 }; 
    int n = arr.length; 
  
    // Element to search 
    int k = 8; 
    indexedSequentialSearch(arr, n, k); 
    } 
} 
// This code is contributed by shs.. 

