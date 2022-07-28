

// Java implementation of Shell-Metzner Sort  
class GFG  
{ 
  
    // Function to swap two elements  
    static int[] swap(int[] arr, int i, int j) 
    { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
        return arr; 
    } 
      
    // Function to sort arr[] using Shell Metzner sort  
    static void sort_shell_metzner(int arr[], int n)  
    { 
  
        // Declare variables  
        int i, j, k, l, m, temp; 
  
        // Set initial step size to  
        // the size of the array  
        m = n; 
  
        while (m > 0) 
        { 
  
            // Step size decreases by half each time  
            m /= 2; 
  
            // k is the upper limit for j  
            k = n - m; 
  
            // j is the starting point  
            j = 0; 
  
            do
            { 
  
                // i equals to smaller value  
                i = j; 
  
                do
                { 
  
                    // l equals to larger value  
                    l = i + m; 
  
                    // Compare and swap arr[i] with arr[l]  
                    if (l < n && arr[i] > arr[l]) 
                    { 
                        swap(arr, i, l); 
  
                        // Decrease smaller value by step size  
                        i -= m; 
                    } 
                    else
                    { 
                        break; 
                    } 
                } while (i >= 0); 
  
                // Increment the lower limit of i  
                j++; 
  
            } while (j <= k); 
        } 
    } 
  
    // Function to print the contents of an array  
    static void printArray(int arr[], int n)  
    { 
        for (int i = 0; i < n; i++) 
        { 
            System.out.print(arr[i] + " "); 
        } 
    } 
  
    // Driver code  
    public static void main(String[] args) 
    { 
        int arr[] = {0, -2, 8, 5, 1}; 
        int n = arr.length; 
  
        // Sort the array using Shell Metzner Sort  
        sort_shell_metzner(arr, n); 
  
        // Print the sorted array  
        printArray(arr, n); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

