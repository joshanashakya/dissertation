

# Python3 Program to check whether valid  
# expression is redundant or not 
  
# Function to check redundant brackets  
# in a balanced expression  
def checkRedundancy(Str): 
      
    # create a stack of characters  
    st = []  
  
    # Iterate through the given expression  
    for ch in Str:  
  
        # if current character is close  
        # parenthesis ')'  
        if (ch == ')'):  
            top = st[-1]  
            st.pop()  
  
            # If immediate pop have open parenthesis  
            # '(' duplicate brackets found  
            flag = True
  
            while (top != '('):  
  
                # Check for operators in expression  
                if (top == '+' or top == '-' or
                    top == '*' or top == '/'):  
                    flag = False
  
                # Fetch top element of stack  
                top = st[-1]  
                st.pop() 
  
            # If operators not found  
            if (flag == True): 
                return True
  
        else: 
            st.append(ch) # append open parenthesis '(',  
                          # operators and operands to stack 
    return False
  
# Function to check redundant brackets  
def findRedundant(Str): 
    ans = checkRedundancy(Str)  
    if (ans == True):  
        print("Yes")  
    else: 
        print("No") 
  
# Driver code  
if __name__ == '__main__': 
    Str = "((a+b))"
    findRedundant(Str)  
  
    Str = "(a+(b)/c)"
    findRedundant(Str)  
  
    Str = "(a+b*(c-d))"
    findRedundant(Str) 
  
# This code is contributed by PranchalK 

