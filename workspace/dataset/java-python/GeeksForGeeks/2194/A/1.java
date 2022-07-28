

    
// Java implementation of above approach 
  
import java.io.*; 
  
class SmallPrime  
{ 
  
// function to check prime 
static boolean isPrime(int n) 
{ 
    int i, c = 0; 
    for (i = 1; i < n / 2; i++)  
    { 
        if (n % i == 0) 
            c++; 
    } 
    if (c == 1) 
    { 
        return true; 
    } 
    else
    { 
        return false; 
    } 
} 
  
// Function to generate smallest possible 
// number with given digits 
static void findMinNum(int arr[], int n) 
{ 
    // Declare a hash array of size 10 
    // and initialize all the elements to zero 
    int first = 0, last = 0, num, rev, i; 
    int hash[] = new int[10]; 
  
    // store the number of occurrences of the digits 
    // in the given array into the hash table 
    for ( i = 0; i < n; i++) 
    { 
        hash[arr[i]]++; 
    } 
  
    // Traverse the hash in ascending order 
    // to print the required number 
    System.out.print("Minimum number: "); 
    for ( i = 0; i <= 9; i++) 
    { 
  
        // Print the number of times a digits occurs 
        for (int j = 0; j < hash[i]; j++) 
            System.out.print(i); 
              
    } 
    System.out.println(); 
  
    System.out.println(); 
    // extracting the first digit 
    for (i = 0; i <= 9; i++) 
    { 
        if (hash[i] != 0)  
        { 
            first = i; 
            break; 
        } 
    } 
    // extracting the last digit 
    for (i = 9; i >= 0; i--)  
    { 
        if (hash[i] != 0) 
        { 
            last = i; 
            break; 
        } 
    } 
  
    num = first * 10 + last; 
    rev = last * 10 + first; 
  
    // printing the prime combinations 
    System.out.print( "Prime combinations: "); 
    if (isPrime(num) && isPrime(rev)) 
    { 
        System.out.println(num + " " + rev); 
    }     
    else if (isPrime(num)) 
    { 
        System.out.println(num); 
    }     
    else if (isPrime(rev)) 
    { 
        System.out.println(rev); 
    }     
  
    else
    { 
        System.out.println("No combinations exist"); 
    } 
} 
  
// Driver code 
  
    public static void main (String[] args)  
    { 
       SmallPrime smallprime = new SmallPrime();  
       int arr[] = {1, 2, 4, 7, 8}; 
       smallprime.findMinNum(arr, 5); 
    } 
} 
  
// This code has been contributed by inder_verma. 

