

// Java implementation of the approach 
  
class GFG  
{ 
  
    static int MAX = 100000; 
  
    // Function to return the required sum 
    static int findSumofEle(int arr1[], int m, 
                            int arr2[], int n) 
    { 
        // Creating hash array initially 
        // filled with zero 
        int hash[] = new int[MAX]; 
  
        // Calculate the frequency 
        // of elements of arr2[] 
        for (int i = 0; i < n; i++)  
        { 
            hash[arr2[i]]++; 
        } 
  
        // Running sum of hash array 
        // such that hash[i] will give count of 
        // elements less than or equal to i in arr2[] 
        for (int i = 1; i < MAX; i++) 
        { 
            hash[i] = hash[i] + hash[i - 1]; 
        } 
  
        // To store the maximum value of 
        // the number of elements in arr2[] which are 
        // smaller than or equal to some element of arr1[] 
        int maximumFreq = 0; 
        for (int i = 0; i < m; i++) 
        { 
            maximumFreq = Math.max(maximumFreq, hash[arr1[i]]); 
        } 
  
        // Calculate the sum of elements from arr1[] 
        // corresponding to maximum frequency 
        int sumOfElements = 0; 
        for (int i = 0; i < m; i++) 
        { 
            sumOfElements += (maximumFreq == hash[arr1[i]]) ? arr1[i] : 0; 
        } 
  
        // Return the required sum 
        return sumOfElements; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr1[] = {2, 5, 6, 8}; 
        int arr2[] = {4, 10}; 
        int m = arr1.length; 
        int n = arr2.length; 
  
        System.out.println(findSumofEle(arr1, m, arr2, n)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

