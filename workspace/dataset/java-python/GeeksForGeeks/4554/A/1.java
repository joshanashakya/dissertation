

// Java program to generate original array  
// from an array that stores counts of  
// greater elements on right. 
import java.util.Vector; 
  
class GFG  
{ 
      
static void originalArray(int greater[], int n)  
{  
    // Array that is used to include every  
    // element only once  
    Vector<Integer> temp = new Vector<Integer>();  
    for (int i = 0; i <= n; i++)  
        temp.add(i);  
  
    // Traverse the array element  
    int arr[] = new int[n];  
    for (int i = 0; i < n; i++) 
    {  
  
        // find the K-th (n-greater[i]-i)  
        // smallest element in Include_Array  
        int k = n - greater[i] - i;  
  
        arr[i] = temp.get(k);  
  
        // remove current k-th element  
        // from Include array  
        temp.remove(k);  
    }  
  
    // print resultant array  
    for (int i = 0; i < n; i++)  
            System.out.print(arr[i] + " ");  
}  
  
// Driver code 
public static void main(String[] args) 
{ 
    int Arr[] = { 6, 3, 2, 1, 0, 1, 0 };  
    int n = Arr.length;  
    originalArray(Arr, n); 
} 
}  
  
// This code is contributed by Rajput-Ji 

