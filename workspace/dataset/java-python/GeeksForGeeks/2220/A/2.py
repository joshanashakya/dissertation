

# Python 3 implementation of 
# above approach 
import math 
  
# Function to return the number  
# of cuts required to divide a 
# circle into equal parts 
def Parts(Arr, N): 
  
    factor = Arr[1] - Arr[0] 
    for i in range(2, N) : 
        factor = math.gcd(factor, Arr[i] - 
                                  Arr[i - 1]) 
      
    # Since last part is connected 
    # with the first 
    factor = math.gcd(factor, 360 - 
                      Arr[N - 1] + Arr[0]) 
  
    cuts = (360 // factor) - N 
  
    return cuts 
  
# Driver code 
if __name__ == "__main__": 
    Arr = [ 0, 1 ] 
    N = len(Arr)  
  
    print( Parts(Arr, N)) 
  
# This code is contributed  
# by ChitraNayal 

