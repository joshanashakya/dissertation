

# Python 3 program to find Xor of all  
# elements with set bits equal to K 
  
# Function to find Xor of desired elements 
def xorGivenSetBits(arr, n, k): 
      
    # Initialize vector 
    v = [] 
    for i in range(0, n, 1): 
        if (bin(arr[i]).count('1') == k): 
              
            # push required elements 
            v.append(arr[i]) 
          
    # Initialize result with first  
    # element of vector 
    result = v[0] 
  
    for i in range(1, len(v), 1): 
        result = result ^ v[i] 
  
    return result 
  
# Driver code 
if __name__ == '__main__': 
    arr = [2, 13, 1, 19, 7] 
    n = len(arr) 
    k = 3
  
    print(xorGivenSetBits(arr, n, k)) 
  
# This code is contributed by 
# Surendra_Gangwar 

