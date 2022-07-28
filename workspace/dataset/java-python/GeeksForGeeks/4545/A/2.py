

# Python3 program to print above pattern 
  
def display(n): 
  
    # 'sp' used for space and  
    # 'st' used for star 
    sp = n // 2
    st = 1
  
    # Outer for loop prints number 
    # of lines 
    for i in range(1, n + 1):  
        for j in range(1, sp + 1): 
            print(end = " ") 
  
        count = 1
        for k in range(1, st + 1):  
            if (k % 2 == 0): 
                print("*", end = "") 
            else: 
                print(count, end = "") 
                count += 1
          
        print() 
  
        if (i <= n // 2):  
              
            # Before reaching to half after 
            # every line space is decreased 
            # by 1 and star is increased by 2 
            sp = sp - 1
            st = st + 2
          
        else:  
              
            # After reaching to half 
            # space is increased by 1 
            # and star is decreased by 2 
            sp = sp + 1
            st = st - 2
          
# Driver Code 
n = 5
display(n) 
  
# This code is contributed by  
# Mohit kumar 29 

