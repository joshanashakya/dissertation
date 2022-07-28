

# Python3 to find the value of f(n)/f(r)*f(n-r) 
  
# Function to find value of given F(n) 
def calcFunction(n, r): 
  
    finalDenominator = 1
    mx = max(r, n - r) 
  
    # iterate over n 
    for i in range(mx + 1, n + 1):  
  
        # calculate result 
        denominator = pow(i, i) 
        numerator = pow(i - mx, i - mx) 
        finalDenominator = (finalDenominator * 
                            denominator) // numerator 
  
    # return the result 
    return finalDenominator 
  
# Driver code 
if __name__ == "__main__": 
      
    n = 6
    r = 2
    print("1/", end = "")  
    print(calcFunction(n, r)) 
  
# This code is contributed by ita_c 

