

# Python3 implementation of 
# the above approach  
  
# Return the number is  
# Flavious Number or not  
def Survives(n) : 
  
    # index i starts from 2 because  
    # at 1st iteration every 2nd  
    # element was remove and keep  
    # going for k-th iteration  
    i = 2
    while(True) : 
          
        if (i > n) : 
            return True;  
              
        if (n % i == 0) : 
            return False;  
  
        # removing the elements which are  
        # already removed at kth iteration  
        n -= n // i; 
        i += 1
  
# Driver Code  
if __name__ == "__main__" :  
  
    n = 17;  
      
    if (Survives(n)) : 
        print("Yes"); 
          
    else : 
        print("No"); 
          
# This code is contributed by AnkitRai01 

