

# Python3 program to find if number N can  
# be represented as sum of a's and b's  
  
# Function to find if number N can  
# be represented as sum of a's and b's  
def checkIfPossibleRec(x, a, b, isPossible, n):  
  
    # base condition  
    if x > n: 
        return
  
    # If x is already visited  
    if isPossible[x]:  
        return
  
    # Set x as possible  
    isPossible[x] = True
  
    # Recursive call  
    checkIfPossibleRec(x + a, a, b, isPossible, n)  
    checkIfPossibleRec(x + b, a, b, isPossible, n)  
  
def checkPossible(n, a, b): 
  
    isPossible = [False] * (n + 1)  
    checkIfPossibleRec(0, a, b, isPossible, n)  
    return isPossible[n]  
  
  
# Driver Code 
if __name__ == "__main__": 
  
    a, b, n = 3, 7, 8
    if checkPossible(a, b, n):  
        print("Yes")  
    else: 
        print("No")  
  
# This code is contributed by Rituraj Jain 

