

# Python3 implementation of the approach 
  
# Function to return the highest power of 2 
# which divides the given binary number 
def highestPower(str, lenngth): 
  
    # To store the highest required power of 2 
    ans = 0; 
  
    # Counting number of consecutive zeros 
    # from the end in the given binary string 
    for i in range(lenngth-1,-1,-1): 
        if (str[i] == '0'): 
            ans+=1; 
        else: 
            break; 
    return ans; 
  
# Driver code 
def main(): 
    str = "100100"; 
    lenngth = len(str); 
    print(highestPower(str, lenngth)); 
  
if __name__ == '__main__': 
    main() 
  
# This code contributed by PrinciRaj1992 

