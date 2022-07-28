

# python program for sum of the  
# series 5 + 55 + 555.....n 
  
def sumOfSeries(n): 
    return (int) (0.6172 * 
                 (pow(10, n) - 1) -
                        0.55 * n) 
  
  
# Driver Code 
n = 2
print(sumOfSeries(n)) 
  
# This code is contributed  
# by Upendra Singh Bartwal 

