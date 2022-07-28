

# Python3 program to perform Queries  
# to add, remove and return  
# difference of maximum and minimum.  
  
# Function to perform query 1  
def performQueryOne(num):  
  
    # insert the element  
    s.add(num)  
  
# Function to perform query 2  
def performQueryTwo(num):  
  
    # erase the element  
    s.remove(num)  
  
# function to perform query 3  
def performQueryThree():  
  
    mini = min(s)  
    maxi = max(s)  
  
    return maxi - mini  
  
# Driver Code  
if __name__ == "__main__": 
      
    s = set()  
  
    # query type-1  
    num = 3
    performQueryOne(num)  
  
    # query type-1  
    num = 5
    performQueryOne(num)  
  
    # query type-1  
    num = 6
    performQueryOne(num)  
  
    # query type-2  
    num = 5
    performQueryTwo(num)  
  
    # query type-1  
    num = 2
    performQueryOne(num)  
  
    # query type-3  
    print(performQueryThree())  
  
# This code is contributed by Rituraj Jain 

