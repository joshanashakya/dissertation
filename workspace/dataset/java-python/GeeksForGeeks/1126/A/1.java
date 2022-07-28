

// Java implementation of the approach  
class GFG 
{ 
      
// Function for finding sum of elements  
// whose diff with mean is not more than k  
static int findSumofEle(int []arr1, int m,  
                int []arr2, int n, int k)  
{  
    float arraySum = 0;  
  
    // Find the mean of second array  
    for (int i = 0; i < n; i++)  
        arraySum += arr2[i];  
    float mean = arraySum / n;  
  
    // Find sum of elements from array1  
    // whose difference with mean in not more than k  
    int sumOfElements = 0;  
    float difference = 0;  
  
    for (int i = 0; i < m; i++)  
    {  
        difference = arr1[i] - mean;  
        if ((difference < 0) && (k > (-1) * difference))  
        {  
            sumOfElements += arr1[i];  
        }  
        if ((difference >= 0) && (k > difference))  
        {  
            sumOfElements += arr1[i];  
        }  
    }  
  
    // Return result  
    return sumOfElements;  
}  
  
// Driver code  
public static void main (String[] args) 
{ 
    int []arr1 = { 1, 2, 3, 4, 7, 9 };  
    int []arr2 = { 0, 1, 2, 1, 1, 4 };  
    int k = 2;  
  
    int m = arr1.length;  
    int n = arr2.length;  
  
    System.out.println(findSumofEle(arr1, m, arr2, n, k));  
}  
} 
  
// This code is contributed by mits 

