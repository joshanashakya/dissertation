

# Python program to find numbers 
# that divide X and Y to 
# produce the same remainder 
  
# Function to prall the possible values 
# of M such that X % M = Y % M 
def printModulus(X, Y): 
    # Finding the absolute difference 
    # of X and Y 
    d = abs(X - Y); 
  
    # Iterating from 1 
    i = 1; 
  
    # Loop to prall the factors of D 
    while (i * i <= d): 
  
        # If i is a factor of d, then pri 
        if (d % i == 0): 
            print(i, end=""); 
  
            # If d / i is a factor of d, 
            # then prd / i 
            if (d // i != i): 
                print(d // i, end=" "); 
          
        i+=1; 
      
  
  
# Driver code 
if __name__ == '__main__': 
  
    X = 10; 
    Y = 26; 
  
    printModulus(X, Y); 
  
# This code contributed by Princi Singh 

