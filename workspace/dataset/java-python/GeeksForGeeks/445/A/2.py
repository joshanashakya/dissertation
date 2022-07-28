

# Python3 implementation of the above approach  
  
# stick[] stores the count  
# of matchsticks required to  
# represent the alphabets  
sticks = [ 6, 7, 4, 6, 5, 4, 6,  
            5, 2, 4, 4, 3, 6, 6,  
            6, 5, 7, 6, 5, 3, 5,  
            4, 6, 4, 3, 4 ];  
  
# number[] stores the count  
# of matchsticks required to  
# represent the numerals  
number = [ 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 ];  
  
# Function that return the count of  
# sticks required to represent  
# the given string  
def countSticks(string) : 
  
    cnt = 0;  
  
    # For every char of the given  
    # string  
    for i in range(len(string)) : 
  
        ch = string[i];  
  
        # Add the count of sticks  
        # required to represent the  
        # current character  
        if (ch >= 'A' and ch <= 'Z') : 
            cnt += sticks[ord(ch) - ord('A')];  
          
        else : 
            cnt += number[ord(ch) - ord('0')];  
      
    return cnt;  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "GEEKSFORGEEKS";  
  
    # Function call to find the  
    # count of matchsticks  
    print(countSticks(string));  
  
# This code is contributed by AnkitRai01 

