

// Java program to count subarrays with 
// same sum and product. 
  
class GFG 
{ 
    // returns required number of subarrays 
    static int numOfsubarrays(int arr[] , int n) 
    { 
        int count = 0; // Initialize result 
       
        // checking each subarray 
        for (int i=0; i<n; i++) 
        { 
            int product = arr[i]; 
            int sum = arr[i]; 
            for (int j=i+1; j<n; j++) 
            { 
                // checking if product is equal 
                // to sum or not 
                if (product==sum) 
                    count++; 
       
                product *= arr[j]; 
                sum += arr[j]; 
            } 
       
            if (product==sum) 
                count++; 
        } 
        return count; 
    } 
      
    // Driver function 
    public static void main(String args[]) 
    { 
        int arr[] = {1,3,2}; 
        int n = arr.length; 
        System.out.println(numOfsubarrays(arr , n)); 
    } 
} 

