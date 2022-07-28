

# Python3 implementation of the approach  
  
# Function to find the number having  
# sum of digits as s and d number of  
# digits such that the difference between  
# the maximum and the minimum digit  
# the minimum possible  
def findNumber(s, d) : 
  
    # To store the final number  
    num = "";  
  
    # To store the value that is evenly  
    # distributed among all the digits  
    val = s // d;  
  
    # To store the remaining sum that still  
    # remains to be distributed among d digits  
    rem = s % d;  
  
    # rem stores the value that still remains  
    # to be distributed  
    # To keep the difference of digits minimum  
    # last rem digits are incremented by 1  
    for i in range(1, d - rem + 1) : 
        num = num + str(val);  
  
    # In the last rem digits one is added to  
    # the value obtained by equal distribution  
    if (rem) : 
        val += 1;  
        for i in range(d - rem + 1, d + 1) : 
            num = num + str(val);  
  
    return num;  
  
# Driver function  
if __name__ == "__main__" :  
  
    s = 25; d = 4;  
  
    print(findNumber(s, d));  
  
# This code is contributed by AnkitRai01 

