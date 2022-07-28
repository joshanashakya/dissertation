

// Java program to find maximum and minimum  
// product from an array  
class GFG 
{ 
static class pair  
{  
    int first, second;  
    public pair(int first, int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}  
  
// method returns maximum and minimum obtainable  
// product of array arr  
static pair getMaxandMinProduct(int arr[], int n)  
{  
    // Initialize all products with arr[0]  
    int curMaxProduct = arr[0];  
    int curMinProduct = arr[0];  
    int prevMaxProduct = arr[0];  
    int prevMinProduct = arr[0];  
    int maxProduct = arr[0];  
    int minProduct = arr[0];  
  
    // Process all elements after arr[0]  
    for (int i = 1; i < n; ++i)  
    {  
        /* Current maximum product is maximum of following  
            1) prevMax * curelement (when curelement is +ve)  
            2) prevMin * curelement (when curelement is -ve)  
            3) Element itself  
            4) Previous max product */
        curMaxProduct = Math.max(prevMaxProduct * arr[i],  
                        Math.max(prevMinProduct * arr[i],  
                                                  arr[i]));  
        curMaxProduct = Math.max(curMaxProduct,  
                                 prevMaxProduct);  
  
        /* Current min product computation is  
        Similar to that of current max profuct */
        curMinProduct = Math.min(prevMaxProduct * arr[i],  
                        Math.min(prevMinProduct * arr[i],  
                                                  arr[i]));  
        curMinProduct = Math.min(curMinProduct, prevMinProduct);  
        maxProduct = Math.max(maxProduct, curMaxProduct);  
        minProduct = Math.min(minProduct, curMinProduct);  
  
        // copy current values to previous values  
        prevMaxProduct = curMaxProduct;  
        prevMinProduct = curMinProduct;  
    } 
    return new pair(minProduct, maxProduct);  
}  
  
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = {-4, -2, 3, 7, 5, 0, 1};  
    int n = arr.length;  
    pair product = getMaxandMinProduct(arr, n);  
    System.out.printf("Minimum product is %d and " +  
                      "Maximum product is %d",  
                       product.first, product.second);  
    } 
} 
  
// This code is contributed by Rajput-Ji 

