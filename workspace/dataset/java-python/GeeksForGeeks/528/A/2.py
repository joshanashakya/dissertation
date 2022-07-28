

# Python 3 program to count substrings with  
# recursive sum equal to 9 
  
def count9s(number): 
    n = len(number) 
  
    # to store no. of previous encountered  
    # modular sums 
    d = [0 for i in range(9)] 
  
    # no. of modular sum(==0) encountered  
    # till now = 1 
    d[0] = 1
    result = 0
  
    mod_sum = 0
    continuous_zero = 0
    for i in range(n):  
          
        # if number is 0 increase 
        if (ord(number[i]) - ord('0') == 0):  
            continuous_zero += 1 # no. of continuous_zero by 1 
        else: 
            continuous_zero = 0 # else continuous_zero is 0 
              
        mod_sum += ord(number[i]) - ord('0') 
        mod_sum %= 9
        result += d[mod_sum] 
        d[mod_sum] += 1     # increase d value of this mod_sum 
                         # subtract no. of cases where there  
                         # are only zeroes in substring 
        result -= continuous_zero 
  
    return result 
  
# Driver Code 
if __name__ == '__main__': 
    print(count9s("01809")) 
    print(count9s("1809")) 
    print(count9s("4189")) 
      
# This code is contributed by 
# Sahil_Shelangia 

