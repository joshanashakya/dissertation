

# Python3 program to find maximum value of  
# an integer for which factorial can be 
# calculated on your system 
import sys 
def findMaxValue(): 
  
    res = 2; 
    fact = 2; 
    while (True): 
          
        # when fact crosses its size 
        # it gives negative value 
        if (fact < 0 or fact > sys.maxsize): 
            break; 
        res += 1; 
        fact = fact * res; 
    return res - 1; 
  
# Driver Code 
if __name__ == '__main__': 
      
    print("Maximum value of integer:",  
                      findMaxValue()); 
      
# This code is contributed by 29AjayKumar 

