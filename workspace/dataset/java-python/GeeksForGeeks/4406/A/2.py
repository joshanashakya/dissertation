

# Python program to find sum upto N term of the series: 
# 2 × 3 + 4 × 4 + 6 × 5 + 8 × 6 + ... 
  
# calculate sum upto N term of series 
def Sum_upto_nth_Term(n): 
    return n * (n + 1) * (2 * n + 7) // 3
  
# Driver code 
N = 5
print(Sum_upto_nth_Term(N)) 

