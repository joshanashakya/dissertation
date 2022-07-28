

# Python 3 implementation of the approach 
def Count( s, pos ): 
    # returns character at index pos - 1 
    c = s[pos - 1] 
    counter = 0
    for i in range( pos - 1 ): 
        if s[i] == c: 
              counter = counter + 1  
    return counter 
  
# Driver Code     
if __name__ == "__main__" : 
    s = "abacsddaa"
    n = len(s) 
    query = [9, 3, 2] 
    Q = len(query) 
    for i in range( Q ): 
        pos = query[i] 
        print(Count( s, pos )) 

