

// Java program to find minimum number to 
// insert in array so their sum is prime 
  
class GFG 
{ 
    // function to check if a 
    // number is prime or not 
    static boolean isPrime(int n) 
        { 
            // Corner case 
            if (n <= 1) 
                return false; 
  
            // Check from 2 to n - 1 
            for (int i = 2; i < n; i++) 
                if (n % i == 0) 
                    return false; 
  
            return true; 
        } 
  
    // Find prime number  
    // greater than a number 
    static int findPrime(int n) 
        { 
            int num = n + 1; 
  
            // find prime greater than n 
            while (num > 0)  
                { 
  
                    // check if num is prime 
                    if (isPrime(num)) 
                        return num; 
  
                    // increment num 
                    num = num + 1; 
                } 
            return 0; 
        } 
  
    // To find number to be added  
    // so sum of array is prime 
    static int minNumber(int arr[], int n) 
        { 
            int sum = 0; 
  
            // To find sum of array elements 
            for (int i = 0; i < n; i++) 
                sum += arr[i]; 
  
            // if sum is already prime  
            // return 0 
            if (isPrime(sum)) 
                return 0; 
  
            // To find prime number  
            // greater than sum 
            int num = findPrime(sum); 
  
            // Return difference of  
            // sum and num 
            return num - sum; 
        } 
  
    // Driver Code 
    public static void main(String[]args) 
        { 
            int arr[] = { 2, 4, 6, 8, 12 }; 
            int n = arr.length; 
            System.out.println(minNumber(arr, n)); 
        } 
} 
      
// This code is contributed by Azkia Anam. 

