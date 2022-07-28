

# Python3 implementation of the approach  
  
# Function that returns true if str can be  
# generated from any permutation of the  
# two strings selected from the given vector  
def isPossible(v, string ) :  
      
    char_list = list(string) 
      
    # Sort the given string 
    char_list.sort() 
      
    # Select two strings at a time from given vector 
    for i in range(len(v)-1) : 
        for j in range(len(v)) : 
              
            # Get the concatenated string 
            temp = v[i] + v[j]; 
              
            # Sort the resultant string  
            temp_list = list(temp) 
            temp_list.sort() 
              
            # If the resultant string is equal 
            # to the given string str 
            if (temp_list == char_list) : 
                return True; 
                  
    # No valid pair found 
    return False;  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "amazon";  
    v = [ "fds", "oxq", "zoa", "epw", "amn" ];  
  
    if (isPossible(v, string)): 
        print("Yes");  
    else : 
        print("No");  
          
# This code is contributed by AnkitRai01 

