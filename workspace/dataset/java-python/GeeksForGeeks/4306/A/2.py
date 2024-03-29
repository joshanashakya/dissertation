

# Python3 implementation of the approach  
  
# Function to print the desired  
# Alphabet H Pattern  
def alphabetPattern(N):  
  
    # Declaring the values of left,  
    # middle, right side  
    left, middle, right = 0, N - 1, N + 1
  
    # Main Row Loop  
    for row in range(0, 2 * N - 1):  
  
        # Condition for the left Values  
        if row < N: 
            left += 1
            print(left, end = "")  
        else: 
            left -= 1
            print(left, end = "")  
  
        # Loop for the middle values  
        for col in range(1, N - 1):  
  
            # Condition for the middleValues  
            if row != N - 1: 
  
                # Two spaces for perfect alignment  
                print(" ", end = " ") 
                  
            else: 
                print(" " + str(middle), end = "") 
                middle -= 1
  
        # Condition for the right Values  
        if row < N:  
            right -= 1
            print(" " + str(right), end = "")  
        else: 
            right += 1
            print(" " + str(right), end = "") 
          
        print() 
  
# Driver Code  
if __name__ == "__main__": 
  
    # Size of the Pattern  
    N = 4
    alphabetPattern(N)  
  
# This code is contributed by Rituraj Jain 

