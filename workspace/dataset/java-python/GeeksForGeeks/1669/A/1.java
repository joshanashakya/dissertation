

// Java implementation to generate  
// an array of size N by following  
// the given rules 
class GFG  
{ 
  
static int a[]; 
  
// Function to search the most recent  
// location of element N  
// If not present in the array  
// it will return -1  
static int search(int a[],int k, int x) 
{ 
    int j; 
      
    for ( j = k - 1; j > -1 ; j--) 
    { 
            if(a[j] == x) 
                return j ; 
        } 
                  
        return -1 ; 
} 
  
// Function to generate an array  
// of size N by following the given rules  
static void genArray(int []arr, int N) 
{  
  
    // Loop to fill the array  
    // as per the given rules  
    for(int i = 0; i < N - 1; i++) 
    {  
  
        // Check for the occurrence  
        // of arr[i - 1]  
        if(search(arr, i, arr[i]) == -1) 
                arr[i + 1] = 0 ; 
  
        else
            arr[i + 1] = (i-search(arr, i, arr[i])) ; 
    } 
}  
  
// Driver code  
public static void main (String[] args)  
{ 
    int N = 5 ; 
    int size = N + 1 ; 
    int a[] = new int [N];  
    genArray(a, N) ; 
      
    for (int i = 0; i < N ; i ++) 
        System.out.print(a[i]+" " ); 
  
} 
} 
  
// This code is contributed by Yash_R 

