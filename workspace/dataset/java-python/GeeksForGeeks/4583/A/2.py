

# Python3 Program to find the diagonal  
# of a regular heptagon  
  
# Function to return the diagonal  
# of a regular heptagon  
def heptdiagonal(a) : 
  
    # Side cannot be negative  
    if (a < 0) : 
        return -1
  
    # Length of the diagonal  
    d = 1.802 * a 
      
    return round(d, 3) 
  
# Driver code  
if __name__ == "__main__" : 
  
    a = 6
    print(heptdiagonal(a))  
  
# This code is contributed by Ryuga 

