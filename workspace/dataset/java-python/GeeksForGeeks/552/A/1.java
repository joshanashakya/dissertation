

// Java program to count number of steps 
// required to convert an integer array 
// to array of factors. 
  
class GFG  
{ 
    static final int MAX = 1000001; 
  
    // array to store prime factors 
    static int factor[] = new int[MAX]; 
  
    // function to generate all prime factors 
    // of numbers from 1 to 10^6 
    static void cal_factor() { 
    factor[1] = 1; 
  
    // Initializes all the positions 
    // with their value. 
    for (int i = 2; i < MAX; i++) 
    factor[i] = i; 
  
    // Initializes all multiples of 2 with 2 
    for (int i = 4; i < MAX; i += 2) 
    factor[i] = 2; 
  
    // A modified version of Sieve of Eratosthenes to 
    // store the smallest prime factor that divides 
    // every number. 
    for (int i = 3; i * i < MAX; i++) { 
  
    // check if it has no prime factor. 
    if (factor[i] == i) { 
  
        // Initializes of j starting from i*i 
        for (int j = i * i; j < MAX; j += i) { 
  
        // if it has no prime factor before, then 
        // stores the smallest prime divisor 
        if (factor[j] == j) 
            factor[j] = i; 
        } 
    } 
    } 
} 
  
// function to calculate the  
// number of representations 
static int no_of_representations(int a[], int n) { 
      
    // keep an count of prime factors 
    int count = 0; 
  
    // traverse for every element 
    for (int i = 0; i < n; i++) { 
  
    int temp = a[i]; 
    int flag = 0; 
  
    // count the no of factors 
    while (factor[temp] != 1) { 
        flag = -1; 
        count++; 
        temp = temp / factor[temp]; 
    } 
  
    // subtract 1 if Ai is not 1 as the  
    // last step wont be taken into count 
    count += flag; 
    } 
  
    return count; 
} 
  
// Driver code 
public static void main(String[] args) { 
      
    // call sieve to calculate the factors 
    cal_factor(); 
  
    int a[] = {4, 4, 4}; 
    int n = a.length; 
  
    System.out.print(no_of_representations(a, n)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

