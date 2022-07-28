

// Java program for sorting array elements  
// whose modulo with K yields P  
import java.util.*; 
class GFG  
{ 
  
// Function to sort elements  
// whose modulo with K yields P  
static void sortWithRemainderP(int arr[], int n, int k, int p)  
{  
    // initialise two vectors  
    Vector<Integer> v1 = new Vector<Integer>(); 
    Vector<Integer> v2 = new Vector<Integer>();  
  
    for (int i = 0; i < n; i++) 
    {  
        if (arr[i] % k == p)  
        {  
  
            // first vector contains indices of  
            // required element  
            v1.add(i);  
  
            // second vector contains  
            // required elements  
            v2.add(arr[i]);  
        }  
    }  
  
    // sorting the elements in second vector  
    Collections.sort(v2);  
  
    // replacing the elements whose modulo with K yields P  
    // with the sorted elements  
    for (int i = 0; i < v1.size(); i++)  
        arr[v1.get(i)] = v2.get(i);  
  
    // printing the new sorted array elements  
    for (int i = 0; i < n; i++)  
            System.out.print(arr[i]+" "); 
}  
  
// Driver code  
public static void main(String[] args)  
{ 
    int arr[] = { 8, 255, 16, 2, 4, 0 };  
    int n = arr.length;  
    int k = 2;  
    int p = 0;  
  
    sortWithRemainderP(arr, n, k, p); 
    } 
}  
  
// This code is contributed by 29AjayKumar 

