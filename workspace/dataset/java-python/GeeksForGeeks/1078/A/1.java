

// Java Implementation to Check  
// if Sum and XOR of all Elements  
// of Array is equal  
class GFG 
{ 
      
    // Function to Check if Sum and XOR  
    // of all elements of array is equal  
    static void equal_xor_sum(int arr[], int n)  
    {  
        int Sum = 0;  
        int Xor = 0;  
      
        // Sum and XOR of all elements  
        for (int i = 0; i < n; i++)  
        {  
            Sum = Sum + arr[i];  
            Xor = Xor ^ arr[i];  
        }  
      
        // Checking Sum and XOR to be equal  
        if (Sum == Xor)  
            System.out.println("YES");  
        else
            System.out.println("NO");  
  
    }  
      
    // Driver Function  
    public static void main (String[] args) 
    {  
        int arr[] = { 6, 3, 7, 10 };  
        int n = arr.length;  
      
        // Check Sum and XOR is equal  
        equal_xor_sum(arr, n);  
    }  
} 
  
// This code is contributed by AnkitRai01 

