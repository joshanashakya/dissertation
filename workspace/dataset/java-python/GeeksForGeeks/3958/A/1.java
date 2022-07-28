

      
// Java program to find maximum subarray product. 
 class GFG{ 
// Function to find maximum subarray product. 
static int findMaxProduct(int arr[], int n) 
{ 
    int i; 
   
    // As maximum product can be negative, so 
    // initialize ans with minimum integer value. 
    int ans = Integer.MIN_VALUE; 
   
    // Variable to store maximum product until 
    // current value. 
    int maxval = 1; 
   
    // Variable to store minimum product until 
    // current value. 
    int minval = 1; 
   
    // Variable used during updation of maximum 
    // product and minimum product. 
    int prevMax; 
   
    for (i = 0; i < n; i++) { 
   
        // If current element is positive, update 
        // maxval. Update minval if it is 
        // negative. 
        if (arr[i] > 0) { 
            maxval = maxval * arr[i]; 
            minval = Math.min(1, minval * arr[i]); 
        } 
   
        // If current element is zero, maximum 
        // product cannot end at current element. 
        // Update minval with 1 and maxval with 0. 
        // maxval is updated to 0 as in case all 
        // other elements are negative, then maxval 
        // is 0. 
        else if (arr[i] == 0) { 
            minval = 1; 
            maxval = 0; 
        } 
   
        // If current element is negative, then new 
        // value of maxval is previous minval*arr[i] 
        // and new value of minval is previous 
        // maxval*arr[i]. Before updating maxval, 
        // store its previous value in prevMax to 
        // be used to update minval. 
        else if (arr[i] < 0) { 
            prevMax = maxval; 
            maxval = minval * arr[i]; 
            minval = prevMax * arr[i]; 
        } 
   
        // Update ans if necessary. 
        ans = Math.max(ans, maxval); 
   
        // If maxval is zero, then to calculate 
        // product for next iteration, it should 
        // be set to 1 as maximum product 
        // subarray does not include 0. 
        // The minimum possible value 
        // to be considered in maximum product 
        // subarray is already stored in minval, 
        // so when maxval is negative it is set to 1. 
        if (maxval <= 0) { 
            maxval = 1; 
        } 
    } 
   
    return ans; 
} 
   
     public static void main(String[] args) { 
           
  
    int arr[] = { 0, -4, 0, -2 }; 
    int n = arr.length; 
         System.out.println(findMaxProduct(arr, n)); 
     } 
} 

