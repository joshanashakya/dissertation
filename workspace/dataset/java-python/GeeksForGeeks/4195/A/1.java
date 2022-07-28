

// Java program to find LCM of array of fractions 
  
class GFG{ 
      
// Recursive function to return gcd of a and b  
    static int gcd(int a, int b)  
    {  
        // Everything divides 0   
        if (a == 0)  
          return b;  
        if (b == 0)  
          return a;  
         
        // base case  
        if (a == b)  
            return a;  
         
        // a is greater  
        if (a > b)  
            return gcd(a-b, b);  
        return gcd(a, b-a);  
    }  
      
// Function that will calculate 
// the Lcm of Numerator 
static int LCM(int num[], int N) 
{ 
    int ans = num[0]; 
    for (int i = 1; i < N; i++) 
        ans = (((num[i] * ans)) / (gcd(num[i], ans))); 
    return ans; 
} 
  
// Function that will calculate 
// the Hcf of Denominator 
static int HCF(int den[], int N) 
{ 
    int ans = den[0];  
    for(int i = 1; i < N; i++) 
        ans = gcd(den[i], ans);  
    return ans; 
} 
  
static int LCMOfFractions(int num[], int den[], int N) 
{ 
    int Numerator = LCM(num, N); 
    int Denominator = HCF(den, N); 
  
    int gcd1 = gcd(Numerator, Denominator); 
  
    Numerator = Numerator / gcd1; 
    Denominator = Denominator / gcd1; 
  
    System.out.println("LCM is = " +Numerator+ "/" + Denominator); 
    return 0; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int num[] = { 1, 7, 4 }, den[] = { 2, 3, 6 }; 
    int N = num.length; 
    LCMOfFractions(num, den, N);  
} 
} 

