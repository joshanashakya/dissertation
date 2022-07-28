

# Python3 implementation of above approach  
  
# Pre-computed values of segment  
# used by digit 0 to 9.  
seg = [ 6, 2, 5, 5, 4,  
        5, 6, 3, 7, 6 ]  
  
# Check if it is possible to 
# display the number  
def LedRequired(s, led) :  
  
    count = 0
  
    # Finding sum of the segments used  
    # by each digit of the number  
    for i in range(len(s)) : 
        count += seg[ord(s[i]) - 48] 
      
    if (count <= led) : 
        return "YES"
    else : 
        return "NO"
  
# Driver Code 
if __name__ == "__main__" :  
  
    S = "123456789"
    led = 20
  
    # Function call to print 
    # required answer  
    print(LedRequired(S, led))  
  
# This code is contributed by Ryuga 

