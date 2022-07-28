

// Java implementation of above approach 
class GFG  
{ 
          
// Function to print 1 if the  
// it is possible to make all array  
// element equal to 1 else 0  
static void checkAllOnes(int arr[],  
                         int n, int k)  
{  
    int brr[] = new int[n];  
  
    // Iterating over the array  
    for (int i = 0; i < n; i++)  
    {  
  
        // If element is 1  
        if (arr[i] == 1)  
        {  
            int h = k + 1;  
            int j = i;  
  
            // Put b[j...j-k] = 0  
            while ((j >= 0) && (h-- != 0)) 
            {  
                brr[j] = 1;  
                j--;  
            }  
  
            h = k + 1;  
            j = i;  
  
            // Put b[j...j+k] = 0  
            while ((j < n) && (h-- != 0))  
            {  
                brr[j] = 1;  
                j++;  
            }  
        }  
    }  
  
    int flag = 0;  
  
    // If any value in aux  
    // array equal to 0  
    // then set flag  
    for (int i = 0; i < n; i++)  
    {  
        if (brr[i] == 0)  
        {  
            flag = 1;  
            break;  
        }  
    }  
  
    // If flag is set this  
    // means array after  
    // conversion contains  
    // 0 so print 0  
    if (flag == 1)  
        System.out.println("0");  
  
    // else print 1  
    else
        System.out.println("1");  
}  
  
// Driver Code  
public static void main (String[] args)  
{  
    int arr[] = { 1, 0, 1, 0 };  
    int k = 2;  
    int n = arr.length;  
  
    checkAllOnes(arr, n, k);  
}  
} 
  
// This code is contributed by AnkitRai01 

