

// Java program to sort an array based on absolute 
// difference with a given value x. 
class GFG { 
  
static void arrange(int arr[], int n, int x) 
{ 
    // Below lines are similar to insertion sort 
    for (int i = 1; i < n; i++) { 
        int diff = Math.abs(arr[i] - x); 
  
        // Insert arr[i] at correct place 
        int j = i - 1; 
        if (Math.abs(arr[j] - x) > diff) 
        { 
            int temp = arr[i]; 
            while (j >= 0 && Math.abs(arr[j] - x) > diff)  
            { 
                arr[j + 1] = arr[j]; 
                j--; 
            } 
            arr[j + 1] = temp; 
        } 
    } 
} 
  
// Function to print the array 
static void print(int arr[], int n) 
{ 
    for (int i = 0; i < n; i++) 
    System.out.print(arr[i] + " "); 
} 
  
// Driver code 
public static void main(String[] args) { 
    int arr[] = { 10, 5, 3, 9, 2 }; 
    int n = arr.length; 
    int x = 7; 
  
    arrange(arr, n, x); 
    print(arr, n); 
    } 
} 
  
// This code is contributed by PrinciRaj1992 

