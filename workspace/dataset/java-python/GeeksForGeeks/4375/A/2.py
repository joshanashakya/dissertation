

# Python3 Program to find the  
# solutions of specified equations  
  
# function to check for 
# solutions of equations  
def checkSolution(a, b, c) : 
  
    # If the expression is greater 
    # than 0, then 2 solutions  
    if ((b * b) - (4 * a * c)) > 0 : 
        print("2 solutions") 
  
    # If the expression is equal 0,  
    # then 1 solutions 
    elif ((b * b) - (4 * a * c)) == 0 : 
        print("1 solution") 
  
    # Else no solutions  
    else : 
        print("No solutions") 
  
# Driver code 
if __name__ == "__main__" : 
  
    a, b, c = 2, 5, 2
    checkSolution(a, b, c) 
  
# This code is contributed 
# by ANKITRAI1 

