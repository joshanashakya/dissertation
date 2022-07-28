

# Python3 program of number of leading zeros in 
# binary representation of a given number 
  
  
# Function to count the no. of leading zeros 
def countZeros(x): 
    n = 32; 
    y = x >> 16; 
    if (y != 0): 
        n = n - 16; 
        x = y; 
  
    y = x >> 8; 
    if (y != 0): 
        n = n - 8; 
        x = y; 
  
    y = x >> 4; 
    if (y != 0): 
        n = n - 4; 
        x = y; 
  
    y = x >> 2; 
    if (y != 0): 
        n = n - 2; 
        x = y; 
  
    y = x >> 1; 
    if (y != 0): 
        return n - 2; 
    return n - x; 
  
  
# Main function 
def main(): 
    x = 101; 
    print(countZeros(x)) 
  
  
if __name__ == '__main__': 
    main() 

