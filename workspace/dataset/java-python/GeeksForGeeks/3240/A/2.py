

# Python3 implementation of the approach  
  
# Function that returns true if the  
# given four integers are in proportion  
def inProportion(arr) : 
  
    # Array will consist of  
    # only four integers  
    n = 4;  
  
    # Sort the array  
    arr.sort() 
  
    # Find the product of extremes and means  
    extremes = arr[0] * arr[3];  
    means = arr[1] * arr[2];  
  
    # If the products are equal  
    if (extremes == means) : 
        return True;  
          
    return False;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 4, 2 ];  
  
    if (inProportion(arr)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by AnkitRai01 

