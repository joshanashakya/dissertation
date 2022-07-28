

# Python3 program to count number of  
# numbers from 1 to n are of type x^y 
# where x>0 and y>1 
import math  
  
# Function that keeps all the odd power 
# numbers upto n 
def powerNumbers( n): 
    v = [] 
    for i in range(2, 
               int(math.pow(n, 1.0 / 
                               3.0)) + 1) :  
        j = i * i 
        while (j * i <= n) : 
              
            j = j * i 
  
            # We need exclude perfect 
            # squares. 
            s = int(math.sqrt(j)) 
            if (s * s != j): 
                v.append(j) 
          
    # sort the vector 
    v.sort()  
    v = list(dict.fromkeys(v)) 
  
    # Return sum of odd and even powers. 
    return len(v) + int(math.sqrt(n)) 
  
# Driver Code 
if __name__=='__main__':  
    print (powerNumbers(50)) 
      
# This code is contributed by Arnab Kundu 

