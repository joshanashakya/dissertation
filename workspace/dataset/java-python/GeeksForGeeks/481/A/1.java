

// Java program to print elements greater than  
// the previous and next element in an Array  
class GfG  
{  
  
// Function to print elements greater than  
// the previous and next element in an Array  
static void printElements(int arr[], int n)  
{  
    // Traverse array from index 1 to n-2  
    // and check for the given condition  
    for (int i = 1; i < n - 1; i++) 
    {  
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])  
            System.out.print(arr[i] + " ");  
    }  
}  
  
// Driver Code  
public static void main(String[] args)  
{  
    int arr[] = { 2, 3, 1, 5, 4, 9, 8, 7, 5 };  
    int n = arr.length;  
  
    printElements(arr, n);  
}  
}  
  
// This code is contributed by Prerna Saini 

