

# Python 3 program to find the  
# index of the left pointer 
  
# Function that returns the  
# index of the left pointer 
def getIndex(a, n): 
      
    # there's only one element  
    # in the array 
    if(n == 1): 
        return 0
  
    # initially both are at end 
    ptrL = 0
    ptrR = n-1
    sumL = a[0] 
    sumR = a[n-1] 
  
    while (ptrR - ptrL > 1) : 
        if (sumL < sumR) : 
            ptrL += 1
            sumL += a[ptrL] 
          
        elif (sumL > sumR) : 
            ptrR -= 1
            sumR += a[ptrR] 
          
        else : 
            break
    return ptrL 
  
# Driver code 
if __name__ == "__main__": 
      
    a = [ 2, 7, 9, 8, 7 ] 
  
    n = len(a) 
  
    print(getIndex(a, n)) 
      
# This code is contributed by 
# ChitraNayal 

