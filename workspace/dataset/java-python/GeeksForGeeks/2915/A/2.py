

# Python program to find Nth term of the series: 
# 1 + 2 + 6 + 15 + 31 + 56 + ... 
  
# calculate Nth term of given series 
def Nth_Term(n): 
    return (2 * pow(n, 3) - 3 * pow(n, 2) + n + 6) // 6
  
# Driver code 
N = 8
print(Nth_Term(N)) 

