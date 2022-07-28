

# Python3 program to find smallest number Y for  
# a given value of X such that X AND Y is zero 
  
# Method to find smallest number Y for  
# a given value of X such that X AND Y is zero 
def findSmallestNonZeroY(A_num) : 
      
    # Convert the number into its binary form 
    A_binary = bin(A_num)  
    B = 1
    length = len(A_binary); 
    no_ones = (A_binary).count('1'); 
      
    # Case 1 : If all bits are ones,  
    # then return the next number 
    if length == no_ones : 
        return A_num + 1; 
          
    # Case 2 : find the first 0-bit  
    # index and return the Y  
    for i in range(length) :  
            ch = A_binary[length - i - 1]; 
              
            if (ch == '0') : 
                B = pow(2.0, i);  
                break;  
                  
    return B;  
  
# Driver Code 
if __name__ == "__main__" : 
    X = findSmallestNonZeroY(10); 
    print(X) 
      
# This code is contributed by AnkitRai01 

