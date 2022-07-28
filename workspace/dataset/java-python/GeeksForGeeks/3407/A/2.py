

# Python3 Program to find  
# minimum number of '(' or ')'  
# must be added to make Parentheses  
# string valid.  
  
# Function to return required  
# minimum number  
def minParentheses(p): 
      
    # maintain balance of string  
    bal=0
    ans=0
    for i in range(0,len(p)): 
        if(p[i]=='('): 
            bal+=1
        else: 
            bal+=-1
              
        # It is guaranteed bal >= -1 
        if(bal==-1): 
            ans+=1
            bal+=1
    return bal+ans 
  
# Driver code 
if __name__=='__main__': 
    p = "())"
      
# Function to print required answer  
    print(minParentheses(p)) 
      
# this code is contributed by  
# sahilshelangia 

