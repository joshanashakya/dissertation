

// Java code implementation for above approach 
class GFG 
{ 
      
    // Function to convert the  
    // number into binary and  
    // store the number into  
    // an array  
    static void convertToBinary(int num, 
                                int a[], int n)  
    {  
        int pointer = n - 1;  
        while (num > 0)  
        {  
            a[pointer] = num % 2;  
            num = num / 2;  
            pointer--;  
        }  
    }  
      
    // Function to check if the  
    // sum of the digits till  
    // the mid of the array and  
    // the sum of the digits  
    // from mid till n is the  
    // same, if they are same  
    // then print that binary  
    static void checkforsum(int a[], int n)  
    {  
        int sum1 = 0;  
        int sum2 = 0;  
        int mid = n / 2;  
      
        // Calculating the sum from  
        // 0 till mid and store  
        // in sum1  
        for (int i = 0; i < mid; i++)  
            sum1 = sum1 + a[i];  
      
        // Calculating the sum  
        // from mid till n and  
        // store in sum2  
        for (int j = mid; j < n; j++)  
            sum2 = sum2 + a[j];  
      
        // If sum1 is same as  
        // sum2 print the binary  
        if (sum1 == sum2) 
        {  
            for (int i = 0; i < n; i++)  
                System.out.print(a[i]);  
            System.out.println();  
        }  
    }  
      
    // Function to print sequence  
    static void print_seq(int m)  
    {  
      
        int n = (2 * m);  
      
        // Creating the array  
        int a[] = new int[n];  
      
        // Initialize the array  
        // with 0 to store the  
        // binary nnumbers  
        for (int j = 0; j < n; j++)  
        {  
            a[j] = 0;  
        }  
      
        for (int i = 0; i < (int)Math.pow(2, n); i++)  
        {  
      
            // Converting the number  
            // into binary first  
            convertToBinary(i, a, n);  
      
            // Checking if the sum of  
            // the first half of the  
            // array is same as the  
            // sum of the next half  
            checkforsum(a, n);  
        }  
    }  
      
    // Driver Code  
    public static void main (String[] args) 
    {  
        int m = 2;  
      
        print_seq(m);  
    }  
} 
  
// This code is contributed by AnkitRai01 

