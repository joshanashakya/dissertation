

# Python program to find Nth term of the series 
# 2 + 6 + 13 + 23 + 36 + ... 
  
# calculate Nth term of given series 
def Nth_Term(n): 
    return (3 * pow(n, 2) - n + 2) // (2) 
  
# Driver code 
N = 5
print(Nth_Term(N)) 

