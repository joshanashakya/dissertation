

// Java program to find maximum possible  
// elements which divisible by 2  
class GFG  
{ 
  
    // Function to find maximum possible  
    // elements which divisible by 2  
    static int Divisible(int arr[], int n)  
    {  
        // To store count of even numbers  
        int count_even = 0;  
      
        for (int i = 0; i < n; i++)  
            if (arr[i] % 2 == 0)  
                count_even++;  
      
        // All even numbers and half of odd numbers  
        return count_even + (n - count_even) / 2;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    { 
        int arr[] = { 1, 2, 3, 4, 5 };  
      
        int n = arr.length;  
      
        // Function call  
        System.out.println(Divisible(arr, n));  
    } 
} 
  
// This code is contributed by AnkitRai01 

