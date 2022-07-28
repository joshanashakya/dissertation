

// Java program to find the number of ways  
// to erase exactly one element  
// from this array to make XOR zero  
class GFG 
{ 
      
    // Function to find the number of ways  
    static int no_of_ways(int a[], int n)  
    {  
        int count_0 = 0, count_1 = 0;  
      
        // Calculate the number of 1's and 0's  
        for (int i = 0; i < n; i++)  
        {  
            if (a[i] == 0)  
                count_0++;  
            else
                count_1++;  
        }  
      
        // Considering the 4 cases  
        if (count_1 % 2 == 0)  
            return count_0;  
        else
            return count_1;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int n = 4;  
        int a1[] = { 1, 1, 0, 0 };  
        System.out.println(no_of_ways(a1, n));  
      
        n = 5;  
        int a2[] = { 1, 1, 1, 0, 0 };  
        System.out.println(no_of_ways(a2, n));  
      
        n = 5;  
        int a3[] = { 1, 1, 0, 0, 0 };  
        System.out.println(no_of_ways(a3, n));  
      
        n = 6;  
        int a4[] = { 1, 1, 1, 0, 0, 0 };  
        System.out.println(no_of_ways(a4, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

