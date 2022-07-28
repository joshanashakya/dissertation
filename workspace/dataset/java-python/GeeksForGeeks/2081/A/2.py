

# Python 3 program to find 
# the largest number that  
# can be formed from given 
# sum of digits and number 
# of digits. 
  
  
# Prints the smalles  
# possible number with digit  
# sum 's' and 'm' number of 
# digits. 
def findLargest( m, s) : 
  
    # If sum of digits is 0, 
    # then a nuber is possible 
    # only if number of digits 
    # is 1. 
    if (s == 0) : 
      
        if(m == 1) : 
            print("Largest number is " , "0",end = "")  
        else : 
            print("Not possible",end = "") 
      
        return
  
    # Sum greater than the  
    # maximum possible sum. 
    if (s > 9 * m) : 
        print("Not possible",end = "") 
        return
      
    # Create an array to  
    # store digits of 
    # result 
    res = [0] * m 
  
    # Fill from most significant 
    # digit to least significant 
    # digit. 
    for i in range(0, m) : 
          
        # Fill 9 first to make 
        # the number largest 
        if (s >= 9) : 
            res[i] = 9
            s = s - 9
          
        # If remaining sum  
        # becomes less than  
        # 9, then fill the  
        # remaining sum 
        else : 
            res[i] = s 
            s = 0
          
          
    print( "Largest number is ",end = "") 
      
    for i in range(0, m) : 
        print(res[i],end = "") 
  
# Driver code 
s = 9
m = 2
findLargest(m, s) 
  
# This code is contributed by Nikita Tiwari. 

