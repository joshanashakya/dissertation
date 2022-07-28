

# Python3 program to find the remaining balance 
  
# Function to find the balance 
def findBalance(x,bal): 
  
    # Check if the transaction 
    # can be successful or not 
    if (x % 10 == 0 and (x + 1.50) <= bal): 
  
        #Transaction is successful 
        print(round(bal - x - 1.50, 2)) 
    else: 
  
        # Transaction is unsuccessful 
        print(round(bal, 2)) 
  
# Driver Code 
x = 50
bal = 100.50
  
findBalance(x, bal) 
  
# This code is contributed by Mohit Kumar 

