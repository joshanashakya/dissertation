

# Python 3 implementation of the approach 
  
# Function to print the desired  
# Alphabet N Pattern 
def Alphabet_N_Pattern(N): 
      
    # Declaring the values of Right, Left  
    # and Diagonal values 
    Right = 1
    Left = 1
    Diagonal = 2
  
    # Main Loop for the rows 
    for index in range(N): 
          
        # For the left Values 
        print(Left, end = "") 
        Left += 1
  
        # Spaces for the diagonals 
        for side_index in range(0, 2 * (index), 1): 
            print(" ", end = "") 
  
        # Condition for the diagonals 
        if (index != 0 and index != N - 1): 
            print(Diagonal, end = "") 
            Diagonal += 1
        else: 
            print(" ", end = "") 
  
        # Spaces for the Right Values 
        for side_index in range(0, 2 * (N - index - 1), 1): 
            print(" ", end = "") 
  
        # For the right values 
        print(Right, end = "") 
        Right += 1
          
        print("\n", end = "") 
      
# Driver Code 
if __name__ == '__main__': 
      
    # Size of the Pattern 
    Size = 6
  
    # Calling the function to print 
    # the desired Pattern 
    Alphabet_N_Pattern(Size) 
  
# This code is contributed by 
# Sanjit_Prasad 

