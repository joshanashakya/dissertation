

// Java implementation for restoring original 
// sort in rotated sorted array 
class GFG  
{ 
  
// Function to restore the Original Sort 
static void restoreSortedArray(int arr[], int n) 
{ 
    for (int i = 0; i < n; i++) 
    { 
        if (arr[i] > arr[i + 1])  
        { 
  
            // In reverse(), the first parameter 
            // is iterator to beginning element 
            // and second parameter is iterator 
            // to last element plus one.  
            reverse(arr,0,i); 
            reverse(arr , i + 1, n); 
            reverse(arr,0, n); 
        } 
    } 
} 
  
static void reverse(int[] arr, int i, int j)  
{ 
    int temp; 
    while(i < j) 
    { 
        temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
        i++; 
        j--; 
    } 
} 
  
// Function to print the Array 
static void printArray(int arr[], int size) 
{ 
    for (int i = 0; i < size; i++) 
        System.out.print(arr[i] + " "); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 3, 4, 5, 1, 2 }; 
    int n = arr.length; 
    restoreSortedArray(arr, n - 1); 
    printArray(arr, n); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

