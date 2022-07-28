

# Python3 implementation of the  
# above approach 
  
def isPossibleToZero(a, n): 
      
    # converting array element  
    # into number 
    num = 0; 
    for i in range(n): 
        num = num * 10 + a[i];  
  
    # Check if divisible by 11 
    return (num % 11 == 0); 
  
# Driver Code 
arr = [ 0, 1, 1, 0 ]; 
n = len(arr); 
if (isPossibleToZero(arr, n)): 
    print("YES"); 
else: 
    print("NO"); 
  
# This code is contributed mits 

