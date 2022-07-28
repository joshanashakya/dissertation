

// Java program to print lexicographically 
// permutation array by replacing minimum 
// element of array 
  
class GFG { 
  
// Function to calculate lexicographically permutation 
// in array 
    static void lexicoSmallestPermuatation(int arr[], int n) { 
        // Calculate frequency of array elements 
        int cnt[] = new int[n + 1]; 
        for (int i = 0; i < n; ++i) { 
            ++cnt[arr[i]]; 
        } 
  
        int ele = 1, replacement = 0; 
        boolean vis[] = new boolean[n + 1]; 
        for (int i = 0; i < n; ++i) { 
  
            // If count of element is 1, no 
            // need to replace 
            if (cnt[arr[i]] == 1) { 
                continue; 
            } 
  
            // Find the element that has not 
            // occurred in array 
            while (cnt[ele]>0) { 
                ++ele; 
            } 
  
            // If replacement element is greater 
            // than current arr[i] then visit 
            // that element for next iteration 
            if (ele > arr[i] && !vis[arr[i]]) { 
                vis[arr[i]] = true; 
            } else { 
  
                // Decrement count and assign the element 
                // to array 
                --cnt[arr[i]]; 
                arr[i] = ele; 
  
                // Increment the replacement count 
                ++replacement; 
  
                // Increment element after assigning 
                // to the array 
                ++ele; 
            } 
        } 
  
        System.out.print(replacement + "\n"); 
        for (int i = 0; i < n; ++i) { 
            System.out.print(arr[i] + " "); 
        } 
    } 
  
// Driver code 
    public static void main(String[] args) { 
        int arr[] = {2, 3, 4, 3, 2}; 
        int sz = arr.length; 
        lexicoSmallestPermuatation(arr, sz); 
  
    } 
}  
  
// This code is contributed by 29AjayKumar 

