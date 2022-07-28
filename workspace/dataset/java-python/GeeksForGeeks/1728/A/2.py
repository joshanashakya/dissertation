

# Python3 implementation of the above approach 
from math import sqrt 
  
def centeredSquare_number(N) :  
  
    n = (9 + sqrt(36 * N + 45))/18;  
    if (n - int(n)) == 0 : 
        return 1
    else : 
        return 0
  
# Driver Code 
if __name__ == "__main__" :  
  
    i = 13; 
    print(centeredSquare_number(i)); 
  
# This code is contributed by Yash_R 

