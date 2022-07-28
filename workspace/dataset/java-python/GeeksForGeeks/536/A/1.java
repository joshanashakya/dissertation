

// Java program to count pairs in array  
// such that one element is power of another 
  
class GFG  
{ 
  
    // Function to check if given number number y  
    // is power of x  
    static boolean isPower(int x, int y)  
    {  
        // log function to calculate value  
        int res1 = (int)(Math.log(y) / Math.log(x));  
        double res2 = Math.log(y) / Math.log(x);  
      
        // compare to the result1  
        // or result2 both are equal  
        return (res1 == res2);  
    }  
      
    // Function to find pairs from array  
    static int countPower(int arr[], int n)  
    {  
        int res = 0;  
      
        // Iterate through all pairs  
        for (int i = 0; i < n; i++)  
            for (int j = i + 1; j < n; j++)  
      
                // Increment count if one is  
                // the power of other  
                if (isPower(arr[i], arr[j])  
                    || isPower(arr[j], arr[i]))  
                    res++;  
      
        return res;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int a[] = { 16, 2, 3, 9 };  
        int n =a.length;  
        System.out.println(countPower(a, n));  
    }  
  
} 
  
// This code is contributed by AnkitRai01 

