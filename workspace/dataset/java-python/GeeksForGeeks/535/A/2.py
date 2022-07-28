

# Python 3 program to find the sum of 
# elements present in all subsequences 
   
# Returns numeric value of a subsequence of 
# s. The subsequence to be picked is decided 
# using bit pattern of num (We pick all those 
# digits for which there is a set bit in num) 
def findSubSequence(s, num): 
  
    # Initialize the result 
    res = 0
   
    # till n!=0 
    i = 0
    while (num) : 
           
        # if i-th bit is set  
        # then add this number 
        if (num & 1): 
            res += ord(s[i]) - ord('0') 
        i+=1
           
        # right shift i 
        num = num >> 1
   
    return res 
   
# function to find combined sum 
# of all individual subsequence sum 
def combinedSum(s): 
  
    # length of string 
    n = len(s) 
       
    # stores the combined 
    c_sum = 0
   
    # 2^n-1 subsequences 
    ran = (1 << n) - 1
   
    # loop for all subsequences 
    for i in range( ran+1): 
        c_sum += findSubSequence(s, i) 
   
    # returns the combined sum 
    return c_sum 
   
# driver code 
if __name__ == "__main__": 
      
    s = "123"
    print(combinedSum(s)) 

