

// Java program to decide if an array 
// represents a permutation or not 
class GFG{ 
   
// Function to check if an 
// array represents a permutation or not 
static String permutation(int arr[], int N) 
{ 
   
    int []hash = new int[N + 1]; 
   
    // Counting the frequency 
    for (int i = 0; i < N; i++) { 
        hash[arr[i]]++; 
    } 
   
    // Check if each frequency is 1 only 
    for (int i = 1; i <= N; i++) { 
        if (hash[i] != 1) 
            return "No"; 
    } 
   
    return "Yes"; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 1, 5, 5, 3 }; 
    int n = arr.length; 
    System.out.print(permutation(arr, n) +"\n"); 
} 
} 
  
// This code is contributed by Princi Singh 

