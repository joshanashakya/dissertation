

# Python3 implementation of the approach  
  
# stick[i] stores the count of sticks  
# required to represent the digit i  
sticks = [ 6, 2, 5, 5, 4, 5,  
           6, 3, 7, 6 ];  
  
# Function to return the count of  
# matchsticks required to represent  
# the given number  
def countSticks(string, n) : 
  
    cnt = 0;  
  
    # For every digit of the given number  
    for i in range(n) : 
  
        # Add the count of sticks required  
        # to represent the current digit  
        cnt += (sticks[ord(string[i]) - ord('0')]);  
  
    return cnt;  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "56";  
    n = len(string);  
  
    print(countSticks(string, n));  
  
# This code is contributed by AnkitRai01 

