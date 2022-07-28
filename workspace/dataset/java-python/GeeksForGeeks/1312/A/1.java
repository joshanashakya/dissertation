

// Java implementation of above approach 
class GFG  
{ 
  
// Function to count the elements 
// with maximum number of divisors 
static int MaximumDivisors(int X, int Y) 
{ 
      
// to store number of divisors 
int[] arr = new int[Y - X + 1]; 
  
// initialise with zero 
for(int i = 0; i < arr.length; i++) 
    arr[i] = 0; 
  
// to store the maximum  
// number of divisors 
int mx = 0; 
  
// to store required answer 
int cnt = 0; 
  
for (int i = 1; i * i <= Y; i++) 
{ 
    int sq = i * i; 
    int first_divisible; 
  
    // Find the first divisible number 
    if ((X / i) * i >= X) 
        first_divisible = (X / i) * i; 
    else
        first_divisible = (X / i + 1) * i; 
  
    // Count number of divisors 
    for (int j = first_divisible; 
             j <= Y; j += i)  
    { 
        if (j < sq) 
            continue; 
        else if (j == sq) 
            arr[j - X]++; 
        else
            arr[j - X] += 2; 
    } 
} 
  
// Find number of elements with 
// maximum number of divisors 
for (int i = X; i <= Y; i++) 
{ 
    if (arr[i - X] > mx)  
    { 
        cnt = 1; 
        mx = arr[i - X]; 
    } 
    else if (arr[i - X] == mx) 
        cnt++; 
} 
  
return cnt; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int X = 1, Y = 10; 
    System.out.println(MaximumDivisors(X, Y)); 
} 
} 
  
// This code is contributed  
// by ChitraNayal 

