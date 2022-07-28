

# Python3 program to find Seed of a number 
  
MAX = 10000; 
  
prodDig = [0] * MAX; 
  
# Stores product of digits of  
# x in prodDig[x] 
def getDigitProduct(x): 
      
    # If x has single digit 
    if (x < 10): 
        return x; 
  
    # If digit product is already computed 
    if (prodDig[x] != 0): 
        return prodDig[x]; 
  
    # If digit product is not computed before. 
    prod = (int(x % 10) * 
            getDigitProduct(int(x / 10))); 
  
    prodDig[x] = prod; 
    return prod; 
  
# Prints all seeds of n 
def findSeed(n): 
  
    # Find all seeds using prodDig[] 
    res = []; 
    for i in range(1, int(n / 2 + 2)): 
        if (i * getDigitProduct(i) == n): 
            res.append(i); 
  
    # If there was no seed 
    if (len(res) == 0): 
        print("NO seed exists"); 
        return; 
  
    # Print seeds 
    for i in range(len(res)): 
        print(res[i], end = " "); 
  
# Driver code 
n = 138; 
findSeed(n); 
  
# This code is contributed by mits 

