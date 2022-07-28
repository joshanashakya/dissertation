

# Function to print the longest palindrome 
def printPalindrome(left,mid,right): 
  
    # Printing every string in left vector 
    for x in left: 
        print(x, end="") 
  
    # Printing the palindromic string 
    # in the middle 
    print(mid, end="") 
  
    # Printing the reverse of the right vector 
    # to make the final output palindromic 
    right = right[::-1] 
    for x in right: 
        print(x, end = "") 
  
    print('\n', end = "") 
  
# Function to find and print the 
# longest palindrome that can be formed 
def findPalindrome(S, N, M): 
    d = set() 
    for i in range(M): 
        # Inserting each string in the set 
        d.add(S[i]) 
  
    # Vectors to add the strings 
    # in the left and right side 
    left = [] 
    right = [] 
  
    # To add the already present palindrome 
    # string in the middle of the solution 
    mid = "" 
  
    # Iterating through all the given strings 
    for i in range(N): 
        t = S[i] 
        t = t[::-1] 
  
        # If the string is a palindrome 
        # it is added in the middle 
        if (t == S[i]): 
            mid = t 
  
        # Checking if the reverse 
        # of the string is already 
        # present in the set 
        elif (t in d): 
            left.append(S[i]) 
            right.append(t) 
            d.remove(S[i]) 
            d.remove(t) 
  
    printPalindrome(left, mid, right) 
  
# Driver code 
if __name__ == '__main__': 
    S = ["tab", "one", "bat"] 
    M = 3
    N = len(S) 
    findPalindrome(S, N, M) 
  
# This code is contributed by Surendra_Gangwar 

