

// Java program to demonstrate that Fibonacci numbers  
// that are divisible by their indexes have indexes  
// as either power of 5 or multiple of 12.  
  
class GFG 
{ 
  
static int MAX = 100;  
  
public static void main(String[] args)  
{  
    // storing Fibonacci numbers  
    long[] arr = new long[MAX];  
    arr[0] = 0;  
    arr[1] = 1;  
    for (int i = 2; i < MAX; i++)  
        arr[i] = arr[i - 1] + arr[i - 2];  
  
    System.out.print("Fibonacci numbers divisible by "+ 
        "their indexes are :\n");  
    for (int i = 1; i < MAX; i++)  
        if (arr[i] % i == 0)  
            System.out.print(i + " ");  
} 
} 
  
// This code is contributed by mits 

