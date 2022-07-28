

// Java program to check for primality using 
// Lucas-Lehmer series. 
  
class GFG{ 
// Function to check whether (2^p - 1) 
// is prime or not. 
static boolean isPrime(int p) { 
  
// generate the number 
double checkNumber = Math.pow(2, p) - 1; 
  
// First number of the series 
double nextval = 4 % checkNumber; 
  
// Generate the rest (p-2) terms 
// of the series. 
for (int i = 1; i < p - 1; i++)  
    nextval = (nextval * nextval - 2) % checkNumber;  
  
// now if the (p-1)th term is 
// 0 return true else false. 
return (nextval == 0); 
} 
  
// Driver Program 
public static void main(String[] args) { 
// Check whether 2^p-1 is prime or not. 
int p = 7; 
double checkNumber = Math.pow(2, p) - 1; 
  
if (isPrime(p)) 
    System.out.println((int)checkNumber+" is Prime."); 
else
    System.out.println((int)checkNumber+" is not Prime."); 
  
} 
} 
// This code is contributed by mits 

