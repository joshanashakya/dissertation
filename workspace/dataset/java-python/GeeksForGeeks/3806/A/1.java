

// Java program to reduce the array 
// such that each element appears 
// at most 2 times 
class GFG 
{ 
  
// Function to remove duplicates 
static void removeDuplicates(int arr[], int n) 
{ 
    // Initalise 2nd pointer 
    int st = 0; 
  
    // Itereate over the array 
    for (int i = 0; i < n; i++) { 
  
        if (i < n - 2
            && arr[i] == arr[i + 1] 
            && arr[i] == arr[i + 2]) 
            continue; 
  
        // Updating the 2nd pointer 
        else { 
            arr[st] = arr[i]; 
            st++; 
        } 
    } 
  
    System.out.print("{"); 
    for (int i = 0; i < st; i++) { 
        System.out.print(arr[i]); 
  
        if (i != st - 1) 
            System.out.print(", "); 
    } 
    System.out.print("}"); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 1, 1, 2, 
                  2, 2, 3, 3, 
                  3, 3, 3, 3, 
                  4, 5 }; 
  
    int n = arr.length; 
  
    // Function call 
    removeDuplicates(arr, n); 
} 
} 
  
// This code is contributed by sapnasingh4991 

