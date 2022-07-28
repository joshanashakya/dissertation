

# Python3  implementation of the approach 
import math 
  
# Function to return an ArrayList containing 
# all the perfect squares upto n 
def getPerfectSquares(n): 
  
    perfectSquares = [] 
    current = 1
    i = 1
  
    # while current perfect square is less than or equal to n 
    while (current <= n) : 
        perfectSquares.append(current) 
        i += 1
        current = i** 2
      
    return perfectSquares 
  
# Function to return the count of triplet (a, b, c) pairs 
# such that a^2 + b^2 = c^2 and 1 <= a <= b <= c <= n 
def countTriplets(n): 
  
    # List of perfect squares upto n^2 
    perfectSquares= getPerfectSquares(n**2) 
  
    count = 0
    for a in range(1, n +1 ): 
        aSquare = a**2
        for i in range(len(perfectSquares)): 
            cSquare = perfectSquares[i] 
  
            # Since, a^2 + b^2 = c^2 
            bSquare = abs(cSquare - aSquare) 
            b = math.sqrt(bSquare) 
            b = int(b) 
            c = math.sqrt(cSquare) 
            c = int(c) 
              
            # If c < a or bSquare is not a perfect square 
            if (c < a or (bSquare not in perfectSquares)): 
                continue
  
            # If triplet pair (a, b, c) satisfy the given condition 
            if ((b >= a) and (b <= c) and (aSquare + bSquare == cSquare)): 
                count += 1 
                  
    return count 
  
# Driver code 
if __name__ == "__main__": 
  
    n = 10
  
    print(countTriplets(n)) 
  
# This code is contributed by chitranayal 

