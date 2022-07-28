

# Python3 implementation of above approach 
  
# Recursive function to  
# return gcd of a and b  
def __gcd(a, b): 
      
    # Everything divides 0 
    if(a == 0 or b == 0): 
        return 0; 
      
    # base case 
    if(a == b): 
        return a; 
      
    # a is greater 
    if(a > b): 
        return __gcd(a - b, b); 
    return __gcd(a, b - a);  
  
# Calculating GCD of an array. 
def find_Gcd(crr, n): 
    result = crr[0]; 
    for i in range(1, n): 
        result = __gcd(crr[i], result); 
    return result; 
  
# Function to calculate the Share 
def profitRatio(amountArr, timeTrr, n): 
    i = 0; 
    crr = [0] * n; 
    for i in range(n): 
        crr[i] = amountArr[i] * timeTrr[i]; 
      
    Share = find_Gcd(crr, n); 
      
    for i in range(n - 1): 
        print(int(crr[i] / Share),  
                     end = " : "); 
    print(int(crr[i + 1] / Share)); 
  
# Driver Code 
amountArr = [5000, 6000, 1000]; 
timeTrr = [6, 6, 12]; 
  
n = len(amountArr);  
  
profitRatio(amountArr, timeTrr, n); 
  
# This code is contributed  
# by mits 

