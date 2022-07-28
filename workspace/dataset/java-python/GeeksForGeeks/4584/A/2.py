

# Python3 program to find the diagonal  
# of a regular decagon  
  
# Function to return the diagonal  
# of a regular decagon  
def decdiagonal(a) : 
  
    # Side cannot be negative  
    if (a < 0) :  
        return -1
  
    # Length of the diagonal  
    d = 1.902 * a 
    return d  
  
# Driver code  
if __name__ == "__main__" : 
  
    a = 9
    print(decdiagonal(a))  
      
# This code is contributed by Ryuga 

