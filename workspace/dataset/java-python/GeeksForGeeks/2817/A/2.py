

# Python3 implementation of the approach  
  
# Function to return the number  
# of operations required  
def changeToOnes(string) :  
  
    # ctr will store the number of  
    # consecutive ones at the end  
    # of the given binary string  
    ctr = 0;  
    l = len(string);  
  
    # Loop to find number of 1s  
    # at the end of the string  
    for i in range(l - 1, -1, -1) :  
  
        # If the current character is 1  
        if (string[i] == '1') : 
            ctr += 1;  
  
        # If we encounter the first 0  
        # from the LSB position then  
        # we'll break the loop  
        else : 
            break;  
  
    # Number of operations  
    # required is (l - ctr)  
    return l - ctr;  
  
# Function to remove leading  
# zeroes from the string  
def removeZeroesFromFront(string) :  
  
    s = "";  
  
    i = 0;  
  
    # Loop until s[i] becomes  
    # not equal to 1  
    while (i < len(string) and 
                   string[i] == '0') : 
        i += 1;  
  
    # If we reach the end of  
    # the string, it means that  
    # string contains only 0's  
    if (i == len(string)) : 
        s = "0";  
  
    # Return the string without  
    # leading zeros  
    else : 
        s = string[i: len(string) - i];  
          
    return s;  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "10010111";  
  
    # Removing the leading zeroes  
    string = removeZeroesFromFront(string);  
  
    print(changeToOnes(string));  
  
# This code is contributed by AnkitRai01 

