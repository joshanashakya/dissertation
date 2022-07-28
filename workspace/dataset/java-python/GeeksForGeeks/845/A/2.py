

# Python3 program to pr multiplication table 
# till N rows where every Kth row 
# is the table of K up to Kth term 
  
# Function to pr the multiplication table 
# upto K-th term 
def prMultiples(N): 
  
    # For loop to iterate from 1 to N 
    # where i serves as the value of K 
    for i in range(1, N + 1): 
  
        # Inner loop which at every 
        # iteration goes till i 
        for j in range(1, i + 1): 
  
            # Printing the table value for i 
            print((i * j), end = " ") 
  
        # New line after every row 
        print() 
  
# Driver code 
if __name__ == '__main__': 
    N = 5
  
    prMultiples(N) 
  
# This code is contributed by mohit kumar 29 

