

# Python3 program to print diamond pattern 
def display(n): 
      
    # sp stands for space 
    # st stands for number 
    sp = n // 2
    st = 1
      
    # Outer for loop for number of lines 
    for i in range(1, n + 1): 
          
        # Inner for loop for printing space 
        for j in range(1, sp + 1): 
            print (" ", end = ' ') 
  
        # Inner for loop for printing number          
        count = st // 2 + 1
          
        for k in range(1, st + 1): 
            print (count, end = ' ') 
            if (k <= (st // 2)): 
                count -= 1
            else: 
                count += 1
                  
        # To go to next line      
        print()  
          
        if (i <= n // 2): 
              
            # sp decreased by 1 
            # st decreased by 2  
            sp -= 1
            st += 2
        else: 
              
            # sp increased by 1  
            # st decreased by 2 
            sp += 1
            st -= 2    
              
# Driver code          
n = 7
display(n) 
  
# This code is contributed by DrRoot_ 

