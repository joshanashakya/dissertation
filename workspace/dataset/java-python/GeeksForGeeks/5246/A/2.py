

# Python3 program to find if its possible to  
# distribute balls without repitiion 
  
  
MAX_CHAR = 26
  
# function to find if its possible to  
# distribute balls or not  
def distributingBalls(k, n, string) : 
  
    # count array to count how many times  
    # each color has occurred  
    a = [0] * MAX_CHAR 
      
    for i in range(n) :  
        # increasing count of each color 
        # every time it appears 
        a[ord(string[i]) - ord('a')] += 1
      
    for i in range(MAX_CHAR) : 
        # to check if any color appears 
        # more than K times if it does 
        # we will print NO 
        if (a[i] > k) : 
            return False 
      
    return True 
  
  
# Driver code  
if __name__ == "__main__" : 
   
    n, k = 6, 3
    string = "aacaab" 
  
    if (distributingBalls(k, n, string)) : 
        print("YES")  
    else : 
        print("NO")  
  
# This code is contributed by Ryuga 

