

# Python implementation of the above approach 
  
def fun(marks, n): 
    # Initializing one tablet for each student 
    dp = [ 1 for i in range(0, n) ] 
  
    for i in range(0, n-1): 
  
        # if left adjacent is having higher marks 
        # review and change all the dp values assigned before 
        # until assigned dp values are found wrong  
        # according to given constrains 
        if marks[i] > marks[i + 1]: 
            temp = i 
            while True: 
                if marks[temp] > marks[temp + 1] and temp >= 0: 
                    if dp[temp] > dp[temp + 1]: 
                        temp -= 1
                        continue
                    else: 
                        dp[temp] = dp[temp + 1] + 1
                        temp -= 1                        
                else: 
                    break    
  
        # if right adjacent is having higher marks 
        # add one in dp of left adjacent and assign to right one 
        elif marks[i] < marks[i + 1]: 
            dp[i + 1] = dp[i] + 1
  
    return(sum(dp)) 
  
  
  
# driver code 
  
# n number of students 
n = 6
  
# marks of students 
marks = [ 1, 4, 5, 2, 2, 1] 
  
# solution of problem 
print(fun(marks, n)) 

