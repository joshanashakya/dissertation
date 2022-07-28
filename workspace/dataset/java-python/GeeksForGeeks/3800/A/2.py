

# Python 3 implementation of the approach 
def Count( temp ): 
    query = [9, 3, 2] 
    Q = len(query) 
    for i in range( Q ): 
        pos = query[i] 
        print( temp[pos-1] ) 
def processing( s ): 
    temp = [ 0 ] * len( s ) 
    d = dict( ) 
    for i in range( len( s ) ): 
        if s[i] not in d: 
            d[ s[i] ] = i 
        else: 
            temp[i] = temp[ d[ s[i] ] ] + 1
            d[ s[i] ] = i 
    return temp 
      
# Driver Code     
if __name__ == "__main__" : 
    s = "abacsddaa"
    n = len(s) 
    temp = processing( s ) 
    Count( temp ) 

