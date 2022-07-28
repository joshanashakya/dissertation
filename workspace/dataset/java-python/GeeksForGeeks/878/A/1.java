

// Java program to find N-th  
// term in the series 
class GFG  
{ 
  
static int MAX = 1000; 
  
// Function to find Nth Prime Number 
static int NthPrime(int n) 
{ 
int count = 0; 
int i; 
for (i = 2; i <= MAX; i++)  
{ 
    int check = 0; 
    for (int j = 2; j <= Math.sqrt(i); j++) 
    { 
        if (i % j == 0)  
        { 
            check = 1; 
            break; 
        } 
    } 
    if (check == 0) 
        count++; 
  
    if (count == n)  
    { 
        return i; 
          
    } 
} 
    return 0; 
} 
  
// Function to find Nth Fibonacci Number 
static int NthFib(int n) 
{ 
// Declare an array to store  
// Fibonacci numbers. 
int []f = new int[n + 2]; 
int i; 
  
// 0th and 1st number of the 
// series are 0 and 1 
f[0] = 0; 
f[1] = 1; 
  
for (i = 2; i <= n; i++)  
{ 
    f[i] = f[i - 1] + f[i - 2]; 
} 
  
return f[n]; 
} 
  
// Function to find N-th term 
// in the series 
static void findNthTerm(int n) 
{ 
// If n is even 
if (n % 2 == 0)  
{ 
    n = n / 2; 
    n = NthPrime(n); 
    System.out.println(n); 
} 
  
// If n is odd 
else 
{ 
    n = (n / 2) + 1; 
    n = NthFib(n - 1); 
    System.out.println(n); 
} 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int X = 5; 
    findNthTerm(X); 
  
    X = 10; 
    findNthTerm(X); 
} 
} 
  
// This code is contributed  
// by ChitraNayal 

