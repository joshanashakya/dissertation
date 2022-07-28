

# Python3 program to print the ladder pattern  
  
# Function to print the desired ladder Pattern  
def ladder_pattern(N) : 
  
    for i in range(N + 1) : 
          
        # Printing the sub-pattern 1  
        # N + 1 times  
        print("*   *");  
        print("*   *");  
  
        if (i < N) : 
              
            # Printing the sub-pattern 2  
            # N times  
            print("*****");  
  
# Driver Code  
if __name__ == "__main__" :  
      
    # Size of the Pattern  
    N = 3;  
  
    # Print the ladder  
    ladder_pattern(N);  
      
# This code is contributed by AnkitRai01 

