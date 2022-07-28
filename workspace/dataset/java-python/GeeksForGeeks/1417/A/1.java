

// Java program to find maximum length  
// of decreasing sequence by removing  
// at most one element  
class GFG { 
      
    // Function to find the maximum length  
    static int maxLength(int []a, int n)  
    {  
        // Intialise maximum length to 1  
        int maximum = 1;  
      
        // Intialise left[] to find the  
        // length of decreasing sequence  
        // from left to right  
        int left [] = new int[n];  
      
        // Intialise right[] to find the  
        // length of decreasing sequence  
        // from right to left  
        int right[] = new int[n];  
      
        // Initially store 1 at each index of  
        // left and right array  
        for (int i = 0; i < n; i++) {  
            left[i] = 1;  
            right[i] = 1;  
        }  
      
        // Iterate over the array arr[] to  
        // store length of decreasing  
        // sequence that can be obtained  
        // at every index in the right array  
        for (int i = n - 2; i >= 0; i--) {  
      
            if (a[i] > a[i + 1]) {  
                right[i] = right[i + 1] + 1;  
            }  
      
            // Store the length of longest  
            // continuous decreasing  
            // sequence in maximum  
            maximum = Math.max(maximum, right[i]);  
        }  
      
        // Iterate over the array arr[] to  
        // store length of decreasing  
        // sequence that can be obtained  
        // at every index in the left array  
        for (int i = 1; i < n; i++) {  
            if (a[i] < a[i - 1]) {  
                left[i] = left[i - 1] + 1;  
            }  
        }  
      
        if (n > 2) {  
            // Check if we can obtain a  
            // longer decreasing sequence  
            // after removal of any element  
            // from the array arr[] with  
            // the help of left[] & right[]  
            for (int i = 1; i < n - 1; i++) {  
                if (a[i - 1] > a[i + 1]) {  
                    maximum = Math.max(maximum, left[i - 1] + right[i + 1]);  
                }  
            }  
        }  
      
        // Return maximum length of sequence  
        return maximum;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr[] = { 8, 7, 3, 5, 2, 9 };  
        int n = arr.length;  
      
        // Function calling  
        System.out.println(maxLength(arr, n));  
    }    
} 
  
// This code is contributed by AnkitRai01 

