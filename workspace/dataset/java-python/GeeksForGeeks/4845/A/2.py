

"""Python program to find number of 
bombings required to kill all aliens"""
  
# function to print where to shoot 
def bomb_required(n): 
      
    # no. of bombs required 
    print(n+n // 2) 
      
    # bomb all the even positions 
    for i in range(2, n + 1, 2): 
        print(i, end = " ") 
      
    # bomb all the odd positions  
    for i in range(1, n + 1, 2): 
        print(i, end = " ") 
      
    # bomb all the even positions again  
    for i in range(2, n, 2): 
        print(i, end = " ") 
  
# Driver Code          
bomb_required(3)  
  
# This code is contributed by Abhishek Agrawal. 

