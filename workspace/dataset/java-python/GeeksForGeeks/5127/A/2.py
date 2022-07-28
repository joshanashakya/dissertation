

# Python3 code to find Triangular  
# Number Series 
  
# Function to find triangular number 
def triangular_series( n ): 
    j = 1
    k = 1
      
    # For each iteration increase j  
    # by 1 and add it into k 
    for i in range(1, n + 1): 
        print(k, end = ' ') 
        j = j + 1 # Increasing j by 1 
          
        # Add value of j into k and update k 
        k = k + j  
          
# Driven Code 
n = 5
triangular_series(n) 
  
# This code is contributed by "Sharad_Bhardwaj" 

