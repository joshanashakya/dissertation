

// Java implementation of the approach  
class GFG  
{ 
      
    // Reducing the gap by a factor of 2  
    static int nextGap(int gap)  
    {  
        if (gap <= 1)  
            return 0;  
        return (int)((gap / 2) + (gap % 2));  
    }  
      
    // Function to merge two sorted  
    // arrays with O(1) extra space  
    static void mergeTwoSortedArray(int []arr1,  
                                    int []arr2,  
                                    int n, int m)  
    {  
        int x = Math.min(n, m);  
      
        // Form both arrays to be bitonic  
        for (int i = 0; i < x; i++)  
        {  
            if (arr1[n - i - 1] > arr2[i])  
            { 
                // swap(arr1[n - i - 1], arr2[i]);  
                int temp = arr1[n - i - 1]; 
                arr1[n - i - 1] = arr2[i]; 
                arr2[i] = temp; 
            } 
        }  
      
        // Now both the arrays conatin the numbers  
        // which should be there in the result  
        // Sort the array indiviually by inplace algo  
        for (int gap = nextGap(n); gap > 0;  
            gap = nextGap(gap)) 
        {  
      
            // Comparing elements in the first array  
            for (int i = 0; i + gap < n; i++)  
                if (arr1[i] > arr1[i + gap]) 
                { 
                    // swap(arr1[i], arr1[i + gap]);  
                    int temp = arr1[i]; 
                    arr1[i] = arr1[i + gap]; 
                    arr1[i + gap] = temp; 
                } 
        }  
      
        // Sort the second array  
        for (int gap = nextGap(m); gap > 0;  
            gap = nextGap(gap))  
        {  
      
            // Comparing elements in the second array  
            for (int i = 0; i + gap < m; i++)  
                if (arr2[i] > arr2[i + gap]) 
                { 
                    // swap(arr2[i], arr2[i + gap]);  
                    int temp = arr2[i]; 
                    arr2[i] = arr2[i + gap]; 
                    arr2[i + gap] = temp; 
                } 
        }  
        for (int i = 0; i < n; i++)  
            System.out.print(arr1[i] + " ");  
        for (int j = 0; j < m; j++)  
            System.out.print(arr2[j] + " ");  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr1[] = { 1, 5, 9, 10, 15, 20 };  
        int n = arr1.length;  
        int arr2[] = { 2, 3, 8, 13 };  
        int m = arr2.length;  
      
        mergeTwoSortedArray(arr1, arr2, n, m);  
    }  
} 
  
// This code is contributed by AnkitRai01 

