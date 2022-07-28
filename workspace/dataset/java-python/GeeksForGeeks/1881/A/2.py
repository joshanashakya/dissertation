

# Python3 implementation of the above approach  
import sys; 
  
# Function to find the bitwise AND of  
# all the binary strings  
def strBitwiseAND(arr, n) : 
      
    res = ""  
      
    # To store the largest and the smallest  
    # string's size, We need this to add '0's  
    # in the resultant string  
    smallest_size = sys.maxsize;  
    largest_size = -(sys.maxsize - 1);  
      
    # Reverse each string  
    # Since we need to perform AND operation  
    # on bits from Right to Left  
    for i in range(n) : 
        arr[i] = arr[i][::-1] ; 
          
        # Update the respective length values  
        smallest_size = min(smallest_size, len(arr[i])); 
        largest_size = max(largest_size, len(arr[i]));  
      
    # Traverse bits from 0 to smallest string's size  
    for i in range(smallest_size) : 
        all_ones = True;  
          
        for j in range(n) : 
              
            # If at this bit position, there is a 0  
            # in any of the given strings then AND 
            # operation on current bit position  
            # will be 0 
            if (arr[j][i] == '0') : 
                all_ones = False; 
                break;  
          
        # Add resultant bit to result 
        if all_ones : 
            res += '1' ; 
        else : 
            res += '0' ; 
      
    # Add 0's to the string. 
    for i in range(largest_size - smallest_size) : 
        res += '0';  
      
    # Reverse the string  
    # Since we started from LEFT to RIGHT  
    res = res[::-1];  
  
    # Return the resultant string  
    return res;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ "101", "110110", "111" ];  
  
    n = len(arr) ;  
  
    print(strBitwiseAND(arr, n));  
      
# This code is contributed by Ryuga 

