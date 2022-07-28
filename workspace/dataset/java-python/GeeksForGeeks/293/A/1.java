

// JAVA program of above approach 
  
class GFG  
{ 
  
    /* A utility function that prints a given arr[] of length size*/
    static void printArray(int arr[], int size)  
    { 
        for (int i = 0; i < size; i++) 
        { 
            System.out.printf("%d ", arr[i]); 
        } 
        System.out.printf("\n"); 
        return; 
    } 
  
    /* This function returns 0 if there are  
    no more sequences to be printed, otherwise 
    modifies arr[] so that arr[] contains  
    next sequence to be printed */
    static int getSuccessor(int arr[], int k, int n)  
    { 
        /* start from the rightmost side and 
        find the first number less than n */
        int p = k - 1; 
        while (arr[p] == n) 
        { 
            p--; 
            if (p < 0) 
            { 
                break; 
            } 
        } 
  
        /* If all numbers are n in the array 
        then there is no successor, return 0 */
        if (p < 0) 
        { 
            return 0; 
        } 
  
        /* Update arr[] so that it contains successor */
        arr[p] = arr[p] + 1; 
        for (int i = p + 1; i < k; i++)  
        { 
            arr[i] = 1; 
        } 
        return 1; 
    } 
  
    /* The main function that prints all 
    sequences from 1, 1, ..1 to n, n, ..n */
    static void printSequences(int n, int k)  
    { 
        int[] arr = new int[k]; 
  
        /* Initialize the current sequence as  
        the first sequence to be printed */
        for (int i = 0; i < k; i++)  
        { 
            arr[i] = 1; 
        } 
  
        /* The loop breaks when there are  
        no more successors to be printed */
        while (true)  
        { 
            /* Print the current sequence */
            printArray(arr, k); 
  
            /* Update arr[] so that it contains  
            next sequence to be printed. And if 
            there are no more sequences then 
            break the loop */
            if (getSuccessor(arr, k, n) == 0) 
            { 
                break; 
            } 
        } 
    } 
  
    /* Driver code */
    public static void main(String[] args)  
    { 
        int n = 3; 
        int k = 2; 
        printSequences(n, k); 
    } 
} 
  
// This code is contributed by PrinciRaj1992 

