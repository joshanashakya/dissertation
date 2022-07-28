

class CountSmaller  
{ 
    void constructLowerArray(int arr[], int countSmaller[], int n)  
    { 
        int i, j; 
  
        // initialize all the counts in countSmaller array as 0 
        for (i = 0; i < n; i++) 
            countSmaller[i] = 0; 
  
        for (i = 0; i < n; i++)  
        { 
            for (j = i + 1; j < n; j++)  
            { 
                if (arr[j] < arr[i]) 
                    countSmaller[i]++; 
            } 
        } 
    } 
  
    /* Utility function that prints out an array on a line */
    void printArray(int arr[], int size)  
    { 
        int i; 
        for (i = 0; i < size; i++) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(""); 
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args)  
    { 
        CountSmaller small = new CountSmaller(); 
        int arr[] = {12, 10, 5, 4, 2, 20, 6, 1, 0, 2}; 
        int n = arr.length; 
        int low[] = new int[n]; 
        small.constructLowerArray(arr, low, n); 
        small.printArray(low, n); 
    } 
} 

