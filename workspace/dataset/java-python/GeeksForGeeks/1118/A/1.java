

// Java program to Create an array 
// of size N consisting of distinct 
// elements where sum of odd elements 
// is equal to sum of even elements 
class GFG{ 
   
// Function to conthe required array 
static void arrayConstruct(int N) 
{ 
   
    // To confirst half, 
    // distinct even numbers 
    for (int i = 2; i <= N; i = i + 2) 
        System.out.print(i+ " "); 
   
    // To consecond half, 
    // distinct odd numbers 
    for (int i = 1; i < N - 1; i = i + 2) 
        System.out.print(i+ " "); 
   
    // Calculate the last number of second half 
    // so as to make both the halves equal 
    System.out.print(N - 1 + (N / 2) +"\n"); 
} 
   
// Function to conthe required array 
static void createArray(int N) 
{ 
   
    // check if size is multiple of 4 
    // then array exist 
    if (N % 4 == 0) 
   
        // function call to conarray 
        arrayConstruct(N); 
   
    else
        System.out.print(-1 +"\n"); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int N = 8; 
   
    createArray(N); 
} 
} 
  
// This code is contributed by Princi Singh 

