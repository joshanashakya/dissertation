

# Python 3 program to  
# print above pattern 
  
def display() : 
    n = 5
    space = n // 2
    num = 1
      
    # Outer for loop for  
    # number of rows 
    for i in range(1, n+1) : 
          
        # Inner for loop for   
        # printing space 
        for j in range(1, space+1) : 
            print(" ", end = "")  
              
        # Logic for printing the 
        # pattern for everyline 
        count = num // 2 + 1
          
        for k in range(1, num+1) : 
            print(count, end = "") 
              
            # Value of count decrements 
            # in every cycle 
            if (k <= num // 2 ) : 
                count = count -1
  
            # Value of count will  
            # increment in every cycle 
            else : 
                count = count + 1
        print() 
  
        # Befor reaching half Space 
        # is decreased by 1 and num 
        # is increased by 2 
        if (i <= n // 2) : 
            space = space - 1
            num = num + 2
          
        # After reaching to half  
        # space is increased by 1 
        # and num is decreased by 2 
        else : 
            space = space + 1
            num = num - 2
              
# Driver Code 
display() 
  
#This code is contributed by Nikita Tiwari. 

