

// Java program to generate  
// largest possible number 
// with given digits 
class GFG  
{ 
  
// Function to generate  
// largest possible number  
// with given digits 
static void findMaxNum(int arr[], 
                       int n) 
{  
// Declare a hash array of  
// size 10 and initialize  
// all the elements to zero 
int []hash = new int[10]; 
  
// store the number of occurrences  
// of the digits in the given array 
// into the hash table 
for(int i = 0; i < n; i++) 
{ 
    hash[arr[i]]++; 
} 
  
// Traverse the hash in descending 
// order to print the required number 
for(int i = 9; i >= 0; i--) 
{ 
    // Print the number of  
    // times a digits occurs 
    for(int j = 0; j < hash[i]; j++) 
        System.out.print(i); 
} 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = {1, 2, 3, 4, 5, 0}; 
      
    int n = arr.length; 
      
    findMaxNum(arr,n); 
} 
} 
  
// This code is contributed  
// by ChitraNayal 

