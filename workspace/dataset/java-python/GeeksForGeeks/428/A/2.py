

# Python3 implementation of the approach 
  
# Function to return the number of 
# pairs (x, y) such that x < y 
def getPairs(a): 
      
    # To store the number of valid pairs 
    count = 0
    for i in range(len(a)): 
        for j in range(len(a)): 
  
            # If a valid pair is found 
            if (a[i] < a[j]): 
                count += 1
  
    # Return the count of valid pairs 
    return count 
  
# Driver code 
if __name__ == "__main__": 
  
    a = [ 2, 4, 3, 1 ] 
    print(getPairs(a)) 
  
# This code is contributed by ita_c 

