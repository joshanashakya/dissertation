

# Python3 program to find  
# Pythagoras triplet with  
# one side as given number. 
  
# Function, to evaluate the 
# Pythagoras triplet with  
# includes 'n' if possible 
def evaluate(n): 
    if (n == 1 or n == 2): 
        print("No Pythagoras" +
            " Triplet exists"); 
    elif (n % 2 == 0): 
          
        # Calculating for 
        # even case 
        var = n * n / 4; 
        print("Pythagoras Triplets" +
             " exist i.e. ", end = ""); 
        print(int(n), " ", int(var - 1), 
                      " ", int(var + 1)); 
    elif (n % 2 != 0): 
          
        # Calculating for odd case 
        var = n * n + 1; 
        print("Pythagoras Triplets " + 
             "exist i.e. ", end = ""); 
        print(int(n), " ", int(var / 2 - 1), 
                         " ", int(var / 2)); 
  
# Driver Code 
n = 22; 
evaluate(n); 
  
# This code is contributed by mits 

