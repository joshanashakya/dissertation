

# Python program to get the summation 
# of following series 
def summation(n): 
    sum = 0
    j = 1
      
    for i in range(1, n + 1): 
        sum = sum + j 
        j = (j * 10) + 1
          
    return sum
          
# Driver Code 
n = 5
print(summation(n)) 

