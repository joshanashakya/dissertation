

// Java program to find Maximum modulo value 
  
import java.util.Arrays; 
  
class Test { 
    static int maxModValue(int arr[], int n) 
    { 
        int ans = 0; 
  
        // Sort the array[] by using inbuilt sort function 
        Arrays.sort(arr); 
  
        for (int j = n - 2; j >= 0; --j) { 
            // Break loop if answer is greater or equals to 
            // the arr[j] as any number modulo with arr[j] 
            // can only give maximum value up-to arr[j]-1 
            if (ans >= arr[j]) 
                break; 
  
            // If both elements are same then skip the next 
            // loop as it would be worthless to repeat the 
            // rest process for same value 
            if (arr[j] == arr[j + 1]) 
                continue; 
  
            for (int i = 2 * arr[j]; i <= arr[n - 1] + arr[j]; i += arr[j]) { 
                // Fetch the index which is greater than or 
                // equals to arr[i] by using binary search 
  
                int ind = Arrays.binarySearch(arr, i); 
  
                if (ind < 0) 
                    ind = Math.abs(ind + 1); 
  
                else { 
                    while (arr[ind] == i) { 
                        ind--; 
  
                        if (ind == 0) { 
                            ind = -1; 
                            break; 
                        } 
                    } 
                    ind++; 
                } 
  
                // Update the answer 
                ans = Math.max(ans, arr[ind - 1] % arr[j]); 
            } 
        } 
        return ans; 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = { 3, 4, 5, 9, 11 }; 
        System.out.println(maxModValue(arr, arr.length)); 
    } 
} 

