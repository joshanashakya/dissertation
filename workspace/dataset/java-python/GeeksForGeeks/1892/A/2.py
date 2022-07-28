

# Python 3 implementation of the approach 
  
# Function to return max possible operation 
# of the given type that can be performed  
# on str 
def maxOperations( str): 
  
    i, g, gk, gks = 0, 0, 0, 0
    for i in range(len(str)) : 
        if (str[i] == 'g') : 
  
            # Increment count of sub-sequence 'g' 
            g += 1
          
        elif (str[i] == 'k') : 
  
            # Increment count of sub-sequence  
            # 'gk', if 'g' is available 
            if (g > 0) : 
                g -= 1
                gk += 1
              
        elif (str[i] == 's') : 
  
            # Increment count of sub-sequence 'gks' 
            # if sub-sequence 'gk' appeared previously 
            if (gk > 0) : 
                gk -= 1
                gks += 1
  
    # Return the count of sub-sequence 'gks' 
    return gks 
  
# Driver code 
if __name__ == "__main__": 
      
    a = "ggkssk"
    print(maxOperations(a)) 
  
# This code is contributed by ita_c 

