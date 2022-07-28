

# Python program to print the initials 
# of a name with the surname 
def printInitials(string: str): 
    length = len(string) 
  
    # to remove any leading or trailing spaces 
    string.strip() 
  
    # to store extracted words 
    t = "" 
    for i in range(length): 
        ch = string[i] 
        if ch != ' ': 
  
            # forming the word 
            t += ch 
  
        # when space is encountered 
        # it means the name is completed 
        # and thereby extracted 
        else: 
  
            # printing the first letter 
            # of the name in capital letters 
            print(t[0].upper() + ". ", end="") 
            t = "" 
  
    temp = "" 
  
    # for the surname, we have to print the entire 
    # surname and not just the initial 
    # string "t" has the surname now 
    for j in range(len(t)): 
  
        # first letter of surname in capital letter 
        if j == 0: 
            temp += t[0].upper() 
  
        # rest of the letters in small 
        else: 
            temp += t[j].lower() 
  
    # printing surname 
    print(temp) 
  
# Driver Code 
if __name__ == "__main__": 
  
    string = "ishita bhuiya"
    printInitials(string) 
  
# This code is contributed by 
# sanjeev2552 

