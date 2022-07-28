

# Python3 program to find max  
# between two Rational numbers 
  
# Get max of the two fractions 
def maxFraction(first, sec): 
      
    # Declare nume1 and nume2 for get the value  
    # of first numerator and second numerator 
    a = first[0]; b = first[1] 
    c = sec[0]; d = sec[1] 
  
    # Compute ad-bc 
    Y = a * d - b * c 
  
    return first if Y else sec 
  
# Driver Code 
first = ( 3, 2 ) 
sec = ( 3, 4 ) 
res = maxFraction(first, sec) 
print(str(res[0]) + "/" + str(res[1])) 
  
  
# This code is contributed by Ansu Kumari. 

