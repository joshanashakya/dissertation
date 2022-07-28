

# Python3 def program to find LCM  
# of array of fractions 
  
# Recursive function to  
# return gcd of a and b  
def gcd(a, b): 
  
    # Everything divides 0  
    if (a == 0):  
        return b;  
    if (b == 0):  
        return a;  
      
    # base case  
    if (a == b):  
        return a;  
      
    # a is greater  
    if (a > b):  
        return gcd(a - b, b);  
    return gcd(a, b - a);  
      
# Function that will calculate 
# the Lcm of Numerator 
def LCM(den, N): 
  
    ans = den[0]; 
    for i in range(1,N): 
        ans = (((den[i] * ans)) / 
                (gcd(den[i], ans))); 
    return ans; 
  
# Function that will calculate 
# the Hcf of Denominator 
def HCF(num, N): 
  
    ans = num[0];  
    for i in range(1, N): 
        ans = gcd(num[i], ans);  
    return ans; 
  
def HCFOfFractions(num, den, N): 
  
    Numerator = HCF(num, N); 
    Denominator = LCM(den, N); 
  
    gcd1 = gcd(Numerator, Denominator); 
  
    Numerator = int(Numerator / gcd1); 
    Denominator = int(Denominator / gcd1); 
  
    print("HCF is =", Numerator, 
                 "/", Denominator); 
  
# Driver code 
num = [24, 48, 72, 96 ]; 
den = [2, 6, 8, 3 ]; 
N = len(num); 
HCFOfFractions(num, den, N);  
  
# This code is contributed  
# by Akanksha Rai 

