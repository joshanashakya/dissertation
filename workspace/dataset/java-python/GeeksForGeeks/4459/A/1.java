

// Java program to find an array that can be 
// sorted with k merge sort calls. 
class GFG { 
      
    static void unsort(int l, int r, int a[], int k) 
    { 
          
        if (k < 1 || l + 1 == r) 
            return; 
  
        // We make two recursive calls, so 
        // reduce k by 2. 
        k -= 2; 
  
        int mid = (l + r) / 2; 
        int temp = a[mid - 1]; 
        a[mid - 1] = a[mid]; 
        a[mid] = temp; 
          
        unsort(l, mid, a, k); 
        unsort(mid, r, a, k); 
    } 
  
    static void arrayWithKCalls(int n, int k) 
    { 
        if (k % 2 == 0) { 
            System.out.print("NO SOLUTION"); 
            return; 
        } 
  
        // Create an array with values 
        // in [1, n] 
        int a[] = new int[n + 1]; 
        a[0] = 1; 
          
        for (int i = 1; i < n; i++) 
            a[i] = i + 1; 
        k--; 
  
        // calling unsort function 
        unsort(0, n, a, k); 
  
        for (int i = 0; i < n; ++i) 
            System.out.print(a[i] + " "); 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
          
        int n = 10, k = 17; 
          
        arrayWithKCalls(n, k); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

