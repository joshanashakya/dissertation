

# Python3 implementation of above  
# approach 
  
# Function to count the pairs 
def countPairs(A,B): 
  
    # Variable to store a number  
    # of special pairs 
    cnt=0
    for i in range(0,A+1): 
        for j in range(i,A+1): 
  
            # Calculating AND of i, j 
            AND = i&j 
            OR = i|j 
  
            # If the conditions are met, 
            # then increment the count of  
            # special pairs 
            if(OR==A and AND==B): 
                cnt +=1
    return cnt 
  
if __name__=='__main__': 
    A = 3
    B = 0
    print(countPairs(A,B)) 
  
# This code is contributed by  
# Shrikant13 

