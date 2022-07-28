

// Java implementation of the approach  
class GFG  
{ 
          
    static final int MAXN = 1000005;  
    static int even[] = new int[MAXN]; 
    static int odd[] = new int[MAXN];  
      
    // Function to precompute the count  
    // of even and odd numbers  
    static void precompute(int arr[], int n)  
    {  
      
        for (int i = 0; i < n; i++)  
        {  
      
            // If the current element is odd  
            // then put 1 at odd[i]  
            if (arr[i] % 2 == 1)  
                odd[i] = 1;  
      
            // If the current element is even  
            // then put 1 at even[i]  
            if (arr[i] % 2 == 0)  
                even[i] = 1;  
        }  
      
        // Taking the prefix sums of these two arrays  
        // so we can get the count of even and odd  
        // numbers in a range [L, R] in O(1)  
        for (int i = 1; i < n; i++)  
        {  
            even[i] = even[i] + even[i - 1];  
            odd[i] = odd[i] + odd[i - 1];  
        }  
    }  
      
    // Function that returns true if the bitwise  
    // AND of the subarray a[L...R] is odd  
    static boolean isOdd(int L, int R)  
    {  
      
        // cnt will store the count of odd  
        // numbers in the range [L, R]  
        int cnt = odd[R];  
        if (L > 0)  
            cnt -= odd[L - 1];  
      
        // Check if all the numbers in  
        // the range are odd or not  
        if (cnt == R - L + 1)  
            return true;  
      
        return false;  
    }  
      
    // Function to perform the queries  
    static void performQueries(int a[], int n,  
                               int q[][], int m)  
    {  
        precompute(a, n);  
      
        // Perform queries  
        for (int i = 0; i < m; i++)  
        {  
            int L = q[i][0], R = q[i][1];  
            if (isOdd(L, R))  
                System.out.println("Odd");  
            else
                System.out.println("Even");  
        }  
    }  
      
    // Driver code  
    public static void main(String args[]) 
    {  
        int []a = { 2, 1, 5, 7, 6, 8, 9 };  
        int n = a.length;  
      
        // Queries  
        int q[][] = { { 0, 2 }, { 1, 2 }, { 2, 3 }, { 3, 6 } };  
        int m = q.length;  
      
        performQueries(a, n, q, m);  
    }  
} 
  
// This code is contributed by AnkitRai01 

