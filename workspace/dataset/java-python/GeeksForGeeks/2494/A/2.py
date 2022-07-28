

# Python3 implementation of the above approach  
  
# Function to check if it is possible or not  
def checkTriangularSumRepresentation(n) :  
      
    tri = list();  
    i = 1;  
  
    # Store all triangular numbers  
    # up to N in a Set  
    while (1) : 
        x = i * (i + 1) // 2;  
        if (x >= n) : 
            break;  
              
        tri.append(x);  
        i += 1;  
  
    # Check if a pair exists  
    for tm in tri : 
        if n - tm in tri: 
            return True;  
              
    return False;  
  
# Driver Code  
if __name__ == "__main__" : 
    n = 24;  
      
    if checkTriangularSumRepresentation(n) : 
        print("Yes") 
    else : 
        print("No") 
  
# This code is contributed by Ryuga         

