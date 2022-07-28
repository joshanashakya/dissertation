

# Python3 program to check 
# given number number y 
import math 
def isPower(x, y): 
    # logarithm function to 
    # calculate value 
    res1 = math.log(y) // math.log(x); 
      
    # Note : this is double 
    res2 = math.log(y) / math.log(x);  
  
    # compare to the result1 or 
    # result2 both are equal 
    return 1 if(res1 == res2) else 0; 
  
# Driver Code 
if __name__=='__main__': 
    print(isPower(27, 729)); 
  
# This code is contributed by mits 
# Improved by hsagarthegr8 

