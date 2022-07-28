

// Java implementation of the approach  
class GFG 
{ 
      
    // Function that returns true if it  
    // is possible to make a square  
    // with side equal to l  
    static boolean isSquarePossible(int arr[],  
                                    int n, int l)  
    {  
      
        // To store the count of elements  
        // greater than or equal to l  
        int cnt = 0;  
        for (int i = 0; i < n; i++) 
        {  
      
            // Increment the count  
            if (arr[i] >= l)  
                cnt++;  
      
            // If the count becomes greater  
            // than or equal to l  
            if (cnt >= l)  
                return true;  
        }  
        return false;  
    }  
      
    // Function to return the  
    // maximum area of the square  
    // that can be obtained  
    static int maxArea(int arr[], int n)  
    {  
        int l = 0, r = n;  
        int len = 0;  
        while (l <= r)  
        {  
            int m = l + ((r - l) / 2);  
      
            // If square is possible with  
            // side length m  
            if (isSquarePossible(arr, n, m)) 
            {  
                len = m;  
                l = m + 1;  
            }  
      
            // Try to find a square with  
            // smaller side length  
            else
                r = m - 1;  
        }  
      
        // Return the area  
        return (len * len);  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int arr[] = { 1, 3, 4, 5, 5 };  
        int n = arr.length;  
      
        System.out.println(maxArea(arr, n));  
    }  
} 
  
// This code is contributed by kanugargng 

