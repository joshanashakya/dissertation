

# Python 3 implementation of 
# above approach 
  
# import gcd() from math lib 
from math import gcd 
  
# Function to return the time when both the 
# persons will meet at the starting point 
def startingPoint(Length, Speed1, Speed2) : 
  
    result1 = 0
    result2 = 0
  
    # Time to cover 1 round by both 
    time1 = Length // Speed1 
    time2 = Length // Speed2 
  
    result1 = gcd(time1, time2) 
  
    # Finding LCM to get the meeting point 
    result2 = time1 * time2 // (result1) 
  
    return result2 
  
# Function to return the time when both 
# the persons will meet for the first time 
def firstTime(Length, Speed1, Speed2) : 
  
    result = 0
  
    relativeSpeed = abs(Speed1 - Speed2) 
  
    result = Length / relativeSpeed  
  
    return result 
  
# Driver Code 
if __name__ == "__main__" : 
      
    L = 30
    S1 = 5
    S2 = 2
  
    # Calling function 
    first_Time = firstTime(L, S1, S2) 
    starting_Point = startingPoint(L, S1, S2) 
  
    print("Met first time after", first_Time, "hrs") 
    print("Met at starting point after",  
                  starting_Point, "hrs") 
  
# This code is contributed by Ryuga 

