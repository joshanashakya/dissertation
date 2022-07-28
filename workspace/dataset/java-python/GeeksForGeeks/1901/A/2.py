

# Python3 program to find the number of ways  
# to erase exactly one element  
# from this array to make XOR zero  
  
# Function to find the number of ways  
def no_of_ways(a, n):  
  
    count_0 = 0
    count_1 = 0
  
    # Calculate the number of 1's and 0's 
    for i in range(0, n):  
        if (a[i] == 0):  
            count_0 += 1
        else: 
            count_1 += 1
      
    # Considering the 4 cases  
    if (count_1 % 2 == 0):  
        return count_0  
    else: 
        return count_1  
  
# Driver code  
if __name__ == '__main__':  
    n = 4
    a1 = [ 1, 1, 0, 0 ]  
    print(no_of_ways(a1, n))  
  
    n = 5
    a2 = [ 1, 1, 1, 0, 0 ]  
    print(no_of_ways(a2, n))  
  
    n = 5
    a3 = [ 1, 1, 0, 0, 0 ]  
    print(no_of_ways(a3, n))  
  
    n = 6
    a4 = [ 1, 1, 1, 0, 0, 0 ]  
    print(no_of_ways(a4, n))  
  
# This code is contributed by ashutosh450 

