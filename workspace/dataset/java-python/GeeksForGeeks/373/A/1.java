

// Java program to find coins to be  
// picked to make sure that we never loose. 
class GFG  
{ 
  
// Returns optimal value possible  
// that a player can collect from  
// an array of coins of size n.  
// Note than n must be even 
static void printCoins(int arr[], int n) 
{ 
// Find sum of odd positioned coins 
int oddSum = 0; 
for (int i = 0; i < n; i += 2) 
    oddSum += arr[i]; 
  
// Find sum of even positioned coins 
int evenSum = 0; 
for (int i = 1; i < n; i += 2) 
    evenSum += arr[i]; 
  
// Print even or odd coins depending  
// upon which sum is greater. 
int start = ((oddSum > evenSum) ? 0 : 1); 
for (int i = start; i < n; i += 2) 
    System.out.print(arr[i]+" "); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int arr1[] = { 8, 15, 3, 7 }; 
    int n = arr1.length; 
    printCoins(arr1, n); 
    System.out.println(); 
  
    int arr2[] = { 2, 2, 2, 2 }; 
    n = arr2.length; 
    printCoins(arr2, n); 
    System.out.println(); 
  
    int arr3[] = { 20, 30, 2, 2, 2, 10 }; 
    n = arr3.length; 
    printCoins(arr3, n); 
} 
} 
  
// This code is contributed by ChitraNayal 

