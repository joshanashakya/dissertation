

# Python3 implementation of above approach 
  
def minItems(k, r) : 
  
    # See if we can buy less than 10 items  
    # Using 10 Rs coins and one r Rs coin  
    for i in range(1, 10) :  
            if ((i * k - r) % 10 == 0 or 
                (i * k) % 10 == 0) : 
                return i  
      
    # We can always buy 10 items  
    return 10;  
      
# Driver Code 
if __name__ == "__main__" :  
  
    k, r = 15 , 2;  
    print(minItems(k, r)) 
  
# This code is contributed by Ryuga 

