

# Python3 program to print the given pattern 
  
# function for displaying the pattern 
def pattern(): 
  
    # initialization 
    k = 0
    spaces = 1
    n = 7
  
    # This will print the upper half  
    # of the pattern 
    for i in range(n, 0, -1): 
        for j in range(1, i + 1): 
            print(i, end = "") 
          
        # for printing the space characters 
        if (i != n):  
            for k in range(1, spaces + 1): 
                print(end = " ") 
              
            spaces = spaces + 2
          
        # for displaying the corresponding 
        # values 
        for j in range(i, 0, -1): 
            if (j != n): 
                print(i, end = "") 
          
        print() 
      
    spaces = spaces - 4
  
    # This will print the lower half  
    # of the pattern 
    for i in range(2, n + 1): 
        for j in range(1, i + 1): 
            print(i, end = "") 
          
        # for displaying the space character 
        # in the lower half 
        if (i != n): 
            for k in range(1, spaces + 1): 
                print(end = " ") 
              
            spaces = spaces - 2
          
        # for displaying the corresponding 
        # values 
        for j in range(i, 0, -1): 
            if (j != n): 
                print(i, end = "") 
          
        print() 
      
# Driver code 
  
# function calling 
pattern() 
  
# This code is contributed by  
# Mohit Kumar 29 

