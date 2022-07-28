

# Python3 implmentation to find the  
# count of numbers possible less  
# than N, such that every digit  
# is from the given set of digits  
import numpy as np; 
dp = np.ones((15,2))*-1;  
  
# Function to convert integer  
# into the string  
def convertToString(num) :  
    return str(num);  
  
# Recursive function to find the  
# count of numbers possible less  
# than N, such that every digit  
# is from the given set of digits  
def calculate(pos,tight,  D, sz, num) :  
  
    # Base case  
    if (pos == len(num)):  
        return 1;  
      
    # Condition when the subproblem  
    # is computed previously  
    if (dp[pos][tight] != -1) : 
        return dp[pos][tight];  
  
    val = 0;  
      
    # Condition when the number  
    # chosen till now is definietly  
    # smaller than the given number N  
    if (tight == 0) : 
          
        # Loop to traverse all the  
        # digits of the given set  
        for i in range(sz) :  
              
            if (D[i] < (ord(num[pos]) - ord('0'))) : 
                val += calculate(pos + 1, 1, D, sz, num);  
              
            elif (D[i] == ord(num[pos]) - ord('0')) : 
                val += calculate(pos + 1, tight, D, sz, num);  
      
    else : 
        # Loop to traverse all the  
        # digits from the given set  
        for i in range(sz) :  
            val += calculate(pos + 1, tight, D, sz, num); 
              
    # Store the solution for 
    # current subproblem 
    dp[pos][tight] = val; 
      
    return dp[pos][tight]; 
  
# Function to count the numbers  
# less then N from given set of digits  
def countNumbers(D, N, sz) :  
  
    # Converting the number to string  
    num = convertToString(N);  
    length = len(num);  
      
    # Intially no subproblem  
    # is solved till now 
    # dp = np.ones((15,2))*-1; 
      
    # Find the solution of all the  
    # number equal to the length of  
    # the given number N  
    ans = calculate(0, 0, D, sz, num);  
      
    # Loop to find the number less in  
    # in the length of the given number  
    for i in range(1,length) : 
        ans += calculate(i, 1, D, sz, num);  
  
    return ans;  
  
  
# Driver Code  
if __name__ == "__main__" :  
  
    sz = 3;  
  
    D = [ 1, 4, 9 ];  
    N = 10;  
      
    # Function Call  
    print(countNumbers(D, N, sz));  
  
    # This code is contributed by AnkitRai01 

