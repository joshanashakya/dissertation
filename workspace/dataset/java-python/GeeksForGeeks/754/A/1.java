

// Java program to print the absolute  
// difference of the consecutive elements  
  
class GFG{ 
// Function to print pairwise absolute  
// difference of consecutive elements  
static void pairwiseDifference(int arr[], int n)  
{  
    int diff;  
    for (int i = 0; i < n - 1; i++) {  
  
        // absolute difference between  
        // consecutive numbers  
        diff = Math.abs(arr[i] - arr[i + 1]);  
        System.out.print(diff+" ");  
    }  
}  
  
// Driver Code  
public static void main(String[] args)  
{  
    int arr[] = { 4, 10, 15, 5, 6 };  
    int n = arr.length;  
  
    pairwiseDifference(arr, n);  
}  
} 
// This code is contributed by mits 

