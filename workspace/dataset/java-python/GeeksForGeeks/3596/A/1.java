

// Java implementation of the approach  
public class GFG{ 
  
// Function to return the number of moves  
static int minimumMoves(int n, int a[], int s, int t)  
{  
    int i, x;  
    x = s;  
    for (i = 1; i <= n; i++) {  
        if (x == t)  
            break;  
        x = a[x];  
    }  
  
    // Destination reached  
    if (x == t)  
        return i - 1;  
    else
        return -1;  
}  
  
    // Driver Code  
    public static void main(String []args){ 
    int s = 2, t = 1, i;  
    int a[] = {-1, 2, 3, 4, 1};  
    int n = a.length ; 
    System.out.println(minimumMoves(n, a, s, t));   
    } 
    // This code is contributed by Ryuga 
} 

