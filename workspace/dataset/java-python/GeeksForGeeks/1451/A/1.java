

// Java implementation of the approach 
class GFG { 
  
    // Function to return the largest element 
    // such that its previous and next 
    // element product is maximum 
    static int maxElement(int a[], int n) 
    { 
        if (n < 3) 
            return -1; 
  
        int maxElement = a[0]; 
        int maxProd = a[n - 1] * a[1]; 
  
        for (int i = 1; i < n; i++) { 
  
            // Calculate the product of the previous 
            // and the next element for 
            // the current element 
            int currProd = a[i - 1] * a[(i + 1) % n]; 
  
            // Update the maximum product 
            if (currProd > maxProd) { 
                maxProd = currProd; 
                maxElement = a[i]; 
            } 
  
            // If current product is equal to the 
            // current maximum product then 
            // choose the maximum element 
            else if (currProd == maxProd) { 
                maxElement = Math.max(maxElement, a[i]); 
            } 
        } 
  
        return maxElement; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] a = { 5, 6, 4, 3, 2 }; 
        int n = a.length; 
        System.out.println(maxElement(a, n)); 
    } 
} 

