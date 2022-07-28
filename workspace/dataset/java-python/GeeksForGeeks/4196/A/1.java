

// Java program to find GCD of array of fractions 
  
class GFG{ 
  
static int __gcd(int a, int b)  
{  
    if (a == 0)  
        return b;  
    return __gcd(b % a, a);  
} 
// Function that will calculate 
// the Lcm of Denominator 
static int LCM(int den[], int N) 
{ 
    int ans = den[0]; 
    for (int i = 1; i < N; i++) 
        ans = (((den[i] * ans)) / (__gcd(den[i], ans))); 
    return ans; 
} 
  
// Function that will calculate 
// the Hcf of Numerator 
static int HCF(int num[], int N) 
{ 
    int ans = num[0]; 
    for (int i = 1; i < N; i++) 
        ans = __gcd(num[i], ans); 
    return ans; 
} 
  
static void HCFOfFractions(int num[], int den[], int N) 
{ 
    int Numerator = HCF(num, N); 
    int Denominator = LCM(den, N); 
  
    int result = __gcd(Numerator, Denominator); 
  
    Numerator = Numerator / result; 
    Denominator = Denominator / result; 
  
    System.out.println("HCF is = "+Numerator+"/"+Denominator); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int num[] = { 24, 48, 72, 96 }, den[] = { 2, 6, 8, 3 }; 
    int N = num.length; 
    HCFOfFractions(num, den, N); 
      
} 
} 
// This code is contributed by mits 

