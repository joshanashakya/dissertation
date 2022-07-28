

# Python3 implementation of the approach  
  
# Function to return the maximized number  
def get_maximum(s, a) :  
    s = list(s) 
    n = len(s)  
      
    # Iterate till the end of the string  
    for i in range(n) : 
          
        # Check if it is greater or not 
        if (ord(s[i]) - ord('0') < a[ord(s[i]) - ord('0')]) : 
            j = i 
              
            # Replace with the alternate till smaller  
            while (j < n and (ord(s[j]) - ord('0') <=
                            a[ord(s[j]) - ord('0')])) : 
                s[j] = chr(ord('0') + a[ord(s[j]) - ord('0')]) 
                j += 1
              
            return "".join(s); 
      
    # Return original s in case  
    # no change took place  
    return s  
  
  
# Driver Code  
if __name__ == "__main__" : 
      
    s = "1337"
    a = [ 0, 1, 2, 5, 4, 6, 6, 3, 1, 9 ]  
    print(get_maximum(s, a)) 
  
# This code is contributed by AnkitRai01 

