

// Java implementation of the approach  
class GFG 
{ 
      
// Utility function to print the  
// elements of an array  
static void printArray(int arr[], int n)  
{  
    for (int i = 0; i < n; i++)  
    {  
        System.out.print(arr[i] + " ");  
    }  
}  
  
// Function to return the minimum element  
// in the subarray arr[i...j]  
static int getMin(int arr[], int i, int j)  
{  
  
    // To store the minimum element  
    int minVal = arr[i++];  
    while (i <= j)  
    {  
  
        // Update the minimum element so far  
        minVal = Math.min(minVal, arr[i]);  
        i++;  
    }  
  
    // Return the minimum element found  
    return minVal;  
}  
  
// Function to return the maximum element  
// in the subarray arr[i...j]  
static int getMax(int arr[], int i, int j)  
{  
  
    // To store the maximum element  
    int maxVal = arr[i++];  
    while (i <= j)  
    {  
  
        // Update the maximum element so far  
        maxVal = Math.max(maxVal, arr[i]);  
        i++;  
    }  
  
    // Return the maximum element found  
    return maxVal;  
}  
  
// Function to generate the array  
// with the given operations  
static void generateArr(int arr[], int n)  
{  
  
    // Base cases  
    if (n == 0)  
        return;  
    if (n == 1) 
    {  
        System.out.println(arr[0]);  
        return;  
    }  
  
    // To store the new array elements  
    int tmpArr[] = new int[n];  
  
    // The first element has no  
    // element on its left  
    tmpArr[0] = getMax(arr, 1, n - 1);  
  
    // From the second element to the  
    // second last element  
    for (int i = 1; i < n - 1; i++)  
    {  
  
        // Absolute difference of the maximum  
        // element to the right and the  
        // minimum element to the left  
        tmpArr[i] = Math.abs(getMax(arr, i + 1, n - 1) -  
                             getMin(arr, 0, i - 1));  
    }  
  
    // The last element has no  
    // element on its right  
    tmpArr[n - 1] = getMin(arr, 0, n - 2);  
  
    // Print the generated array  
    printArray(tmpArr, n);  
}  
  
// Driver code  
public static void main (String[] args)  
{  
    int arr[] = { 1, 5, 2, 4, 3 };  
    int n = arr.length;  
  
    generateArr(arr, n);  
} 
} 
  
// This code is contributed by AnkitRai01 

