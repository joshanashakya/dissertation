

# Python3 Program to find the diagonal  
# of a regular pentagon  
  
# Function to find the diagonal  
# of a regular pentagon  
def pentdiagonal(a) :  
  
    # Side cannot be negative  
    if (a < 0) :  
        return -1
  
    # Length of the diagonal  
    d = 1.22 * a  
    return d 
  
# Driver code  
if __name__ == "__main__" : 
  
    a = 6
    print(pentdiagonal(a))  
  
# This code is contributed by Ryuga 

