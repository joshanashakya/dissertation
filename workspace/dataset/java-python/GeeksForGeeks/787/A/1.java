

// Java program to find the largest number 
// that can be mode from elements of the 
// array and is divisible by 3 
import java.util.*; 
  
class GFG  
{ 
  
    // Number of digits 
    static int MAX_SIZE = 10; 
  
    // function to sort array of digits using 
    // counts 
    static void sortArrayUsingCounts(int arr[],  
                                     int n) 
    { 
        // Store count of all elements 
        int[] count = new int[MAX_SIZE]; 
        for (int i = 0; i < n; i++)  
        { 
            count[arr[i]]++; 
        } 
  
        // Store 
        int index = 0; 
        for (int i = 0; i < MAX_SIZE; i++)  
        { 
            while (count[i] > 0)  
            { 
                arr[index++] = i; 
                count[i]--; 
            } 
        } 
    } 
  
    // Remove elements from arr[] 
    // at indexes ind1 and ind2 
    static void removeAndPrintResult(int arr[], int n,  
                                     int ind1, int ind2) 
    { 
        for (int i = n - 1; i >= 0; i--) 
        { 
            if (i != ind1 && i != ind2)  
            { 
                System.out.print(arr[i]); 
            } 
        } 
    } 
  
    // Returns largest multiple of 3  
    // that can be formed using 
    // arr[] elements. 
    static boolean largest3Multiple(int arr[],  
                                    int n) 
    { 
        // Sum of all array element 
        int sum = accumulate(arr, 0, n); 
  
        // If sum is divisible by 3,  
        // no need to delete an element 
        if (sum % 3 == 0)  
        { 
            return true; 
        } 
  
        // Sort array element in increasing order 
        sortArrayUsingCounts(arr, n); 
  
        // Find reminder 
        int remainder = sum % 3; 
  
        // If remainder is '1', we have to  
        // delete either one element of  
        // remainder '1' or two elements of  
        // remainder '2' 
        if (remainder == 1) 
        { 
            int[] rem_2 = new int[2]; 
            rem_2[0] = -1; 
            rem_2[1] = -1; 
  
            // Traverse array elements 
            for (int i = 0; i < n; i++)  
            { 
                  
                // Store first element of remainder '1' 
                if (arr[i] % 3 == 1) 
                { 
                    removeAndPrintResult(arr, n, i, -1); 
                    return true; 
                } 
  
                if (arr[i] % 3 == 2) 
                { 
                      
                    // If this is first occurrence 
                    // of remainder 2 
                    if (rem_2[0] == -1) 
                    { 
                        rem_2[0] = i; 
                    } 
                      
                    // If second occurrence 
                    else if (rem_2[1] == -1)  
                    { 
                        rem_2[1] = i; 
                    } 
                } 
            } 
  
            if (rem_2[0] != -1 &&  
                rem_2[1] != -1)  
            { 
                removeAndPrintResult(arr, n, rem_2[0],  
                                             rem_2[1]); 
                return true; 
            } 
        }  
          
        // If remainder is '2', we have to  
        // delete either one element of  
        // remainder '2' or two elements of 
        // remainder '1' 
        else if (remainder == 2)  
        { 
            int[] rem_1 = new int[2]; 
            rem_1[0] = -1; 
            rem_1[1] = -1; 
  
            // traverse array elements 
            for (int i = 0; i < n; i++)  
            { 
                  
                // store first element of remainder '2' 
                if (arr[i] % 3 == 2)  
                { 
                    removeAndPrintResult(arr, n, i, -1); 
                    return true; 
                } 
  
                if (arr[i] % 3 == 1)  
                { 
                      
                    // If this is first occurrence 
                    // of remainder 1 
                    if (rem_1[0] == -1)  
                    { 
                        rem_1[0] = i; 
                    }  
                      
                    // If second occurrence 
                    else if (rem_1[1] == -1)  
                    { 
                        rem_1[1] = i; 
                    } 
                } 
            } 
  
            if (rem_1[0] != -1 &&  
                rem_1[1] != -1) 
            { 
                removeAndPrintResult(arr, n, rem_1[0],  
                                             rem_1[1]); 
                return true; 
            } 
        } 
        System.out.print("Not possible"); 
        return false; 
    } 
  
    static int accumulate(int[] arr, 
                          int start,  
                          int end)  
    { 
        int sum = 0; 
        for (int i = 0; i < arr.length; i++)  
        { 
            sum += arr[i]; 
        } 
        return sum; 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = {4, 4, 1, 1, 1, 3}; 
        int n = arr.length; 
        largest3Multiple(arr, n); 
    } 
} 
  
// This code is contributed 
// by Princi Singh 

