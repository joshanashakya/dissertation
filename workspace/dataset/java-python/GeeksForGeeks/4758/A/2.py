

# Python 3 implementation of the approach 
  
# Function to return the integer X such that 
# (A xor X) + (B ^ X) is minimized 
def findX(A,B): 
    j = 0
    x = 0
  
    # While either A or B is non-zero 
    while (A or B): 
          
        # Position at which both A and B 
        # have a set bit 
        if ((A & 1) and (B & 1)): 
              
            # Inserting a set bit in x 
            x += (1 << j) 
  
        # Left shifting both numbers to 
        # traverse all the bits 
        A >>= 1
        B >>= 1
        j += 1
    return x 
  
# Driver code 
if __name__ == '__main__': 
    A = 2
    B = 3
    X = findX(A, B) 
  
    print("X =",X,", Sum =",(A ^ X) + (B ^ X)) 
      
# This code is contributed by 
# Surendra_Gangwar 

