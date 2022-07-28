

# Python program to find  
# sum of first n terms 
  
# Function to calculate the sum  
def calculateSum(n) : 
  
    return (2 * (n * (n + 1) * 
           (2 * n + 1) // 6) + n *
           (n + 1) // 2 + 2 * (n)) 
          
# Driver code      
if __name__ == "__main__" : 
  
    # number of terms to be 
    # included in sum  
    n = 3
  
    # find the Sn  
    print("Sum =",calculateSum(n))  
  
# This code is contributed by ANKITRAI1 

