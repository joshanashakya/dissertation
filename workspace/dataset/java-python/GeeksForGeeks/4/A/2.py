

# Python 3 program to find LCM 
# of array of number is divisible 
# by a prime number k or not 
  
  
# Function to check any number of  
# array is divisible by k or not 
def func( a, k, n) : 
      
    # If any array element is  
    # divisible by k, then LCM  
    # of whole array should also 
    # be divisible. 
    for i in range(0, n) : 
        if ( a[i] % k == 0): 
            return True
  
  
# Driver Code 
a = [14, 27, 38, 76, 84] 
k = 19
res = func(a, k, 5) 
  
if(res) : 
    print("true")  
else : 
    print("false") 
      
  
  
# This code is contributed  
# by Nikita Tiwari.  

