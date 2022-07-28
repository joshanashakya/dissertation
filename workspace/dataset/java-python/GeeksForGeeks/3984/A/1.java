

// Java implementation of above approach 
import java.util.*; 
  
class GFG 
{ 
    static class pair 
    {  
        int first, second;  
        public pair(int first, int second)  
        {  
            this.first = first;  
            this.second = second;  
        }  
    } 
      
// Function to Check if it is possible to 
// convert a given array to another array 
// by adding elements to first array 
static boolean checkconv(int a[], int b[], int n) 
{ 
    int []c = new int[n]; 
    int flag = 0; 
  
    // Create a temporary array c[] 
    // which contains the difference 
    // of the array elements 
    for (int i = 0; i < n; i++) 
    { 
  
        c[i] = b[i] - a[i]; 
    } 
  
    // Create a vector pair for all non zero 
    // elements of array c[n] with there index 
    Vector<pair > idxs = new Vector<pair>(); 
    for (int i = 0; i < n; i++) 
    { 
        if (c[i] != 0) 
            idxs.add(new pair(i, c[i])); 
    } 
  
    // Check If the index value differs by 1 
    // and the difference value is same 
    for (int i = 0; i < idxs.size() - 1; i++) 
    { 
        if (idxs.get(i + 1).first - idxs.get(i).first != 1
            || idxs.get(i + 1).second != idxs.get(i).second)  
        { 
            flag = 1; 
            break; 
        } 
    } 
  
    return flag == 1 ? false:true; 
} 
  
// Function to calculate the value of K 
static int diffofarrays(int a[], int b[], int n) 
{ 
    int []c = new int[n]; 
    int ans = 0; 
    for (int i = 0; i < n; i++)  
    { 
        c[i] = b[i] - a[i]; 
    } 
    for (int i = 0; i < n; i++) 
    { 
        if (c[i] != 0) 
        { 
            ans = c[i]; 
            break; 
        } 
    } 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int A[] = { 3, 7, 1, 4, 0, 2, 2 }; 
    int B[] = { 3, 7, 3, 6, 2, 2, 2 }; 
    int arr_size = A.length; 
  
    if (checkconv(A, B, arr_size)) 
    { 
        System.out.print(diffofarrays(A, B, arr_size) +"\n"); 
    } 
    else
        System.out.print("NA" +"\n"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

