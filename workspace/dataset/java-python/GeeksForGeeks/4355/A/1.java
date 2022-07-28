

// Java implementation of the above approach. 
class GFG { 
  
    // Function to return 
    // the sign of the number 
    int sign(double x) 
    { 
        if (x < 0) 
            return -1; 
        if (x > 0) 
            return 1; 
        return 0; 
    } 
  
    // Function to swap two numbers in an array 
    void swap(int arr[], int i, int j) 
    { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    } 
  
    // Function to return kth smallest number 
    int select(int arr[], int left, 
               int right, int k) 
    { 
        while (right > left) { 
            if (right - left > 600) { 
                // Choosing a small subarray 
                // S based on sampling. 
                // 600, 0.5 and 0.5 are 
                // arbitrary constants 
                int n = right - left + 1; 
                int i = k - left + 1; 
                double z = Math.log(n); 
                double s = 0.5 * Math.exp(2 * z / 3); 
  
                double sd = 0.5 * Math.sqrt(z * s * (n - s) / n) 
                            * sign(i - n / 2); 
  
                int newLeft = Math.max(left, 
                                       (int)(k - i * s / n 
                                             + sd)); 
  
                int newRight = Math.min(right, 
                                        (int)(k + (n - i) * s / n 
                                              + sd)); 
  
                select(arr, newLeft, newRight, k); 
            } 
  
            // Partition the subarray S[left..right] 
            // with arr[k] as pivot 
            int t = arr[k]; 
            int i = left; 
            int j = right; 
            swap(arr, left, k); 
            if (arr[right] > t) { 
                swap(arr, left, right); 
            } 
  
            while (i < j) { 
                swap(arr, i, j); 
                i++; 
                j--; 
  
                while (arr[i] < t) 
                    i++; 
                while (arr[j] > t) 
                    j--; 
            } 
  
            if (arr[left] == t) 
                swap(arr, left, j); 
            else { 
                j++; 
                swap(arr, right, j); 
            } 
  
            // Adjust the left and right 
            // pointers to select the subarray having k 
            if (j <= k) 
                left = j + 1; 
            if (k <= j) 
                right = j - 1; 
        } 
        return arr[k]; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] arr = new int[] { 7, 3, 4, 0, 1, 6 }; 
  
        // k-th smallest element. 
        // In this we get the 2nd smallest element 
        int k = 2; 
        FloydRivest f = new FloydRivest(); 
        int res = f.select(arr, 0, arr.length - 1, k - 1); 
        System.out.println("The " + k 
                           + "-th smallest element is " + res); 
    } 
} 

