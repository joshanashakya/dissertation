

# Python3 program to check whether the number 
# can be made palindrome number after adding K 
  
# Function to check whether a number 
# is a palindrome or not 
def checkPalindrome(num): 
  
    # Convert num to stringing 
    string = str(num) 
  
    l = 0
    r = len(string) - 1; 
  
    # Comparing kth character from the 
    # beginning and N - kth character 
    # from the end. If all the characters 
    # match, then the number is a palindrome 
    while (l < r): 
  
        if (string[l] != string[r]) : 
            print("No") 
            return; 
          
        l = l + 1; 
        r = r - 1; 
      
    # If all the above conditions satisfy, 
    # it means that the number is a palindrome 
    print("Yes") 
    return; 
  
# Driver code 
if __name__=='__main__':  
  
    n = 19
    k = 3
  
    checkPalindrome(n + k); 
  
# This code is contributed by Princi Singh 

