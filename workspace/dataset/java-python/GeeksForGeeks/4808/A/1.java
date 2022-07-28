

//Java  implementation of above approach  
  
import java.io.*; 
  
class GFG { 
      
// Function that will tell  
// whether it is possible or Not  
static int Series(int Arr[], int N, int K)  
{  
    int count = 0;  
    for (int i = 0; i < N; i++)  
        if (Arr[i] == 1)  
            count++;  
  
    if (K >= (N - count))  
        return 1;  
    else
        return 0;  
}  
  
// Driver code  
    public static void main (String[] args) { 
    int Arr[] = { 5, 1, 2 };  
    int N = Arr.length;  
    int K = 2;  
    // Calling function.  
    int result = Series(Arr, N, K);  
    if (result == 1)  
            System.out.println ("Possible");  
    else
            System.out.println( "Not Possible");  
          
    } 
//This Code is Contributed by ajit     
} 

