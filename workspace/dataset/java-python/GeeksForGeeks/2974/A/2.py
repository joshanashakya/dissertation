

# Python 3 implementation of above approach 
  
# Function that calculates marks. 
def markingScheme( N, answerKey, studentAnswer): 
      
    positive = 0
    negative = 0
    notattempt = 0
      
    for i in range (0, N): 
  
        # for not attempt score + 0 
        if (studentAnswer[i] == 0): 
            notattempt += 1
  
        # for each correct answer score + 3 
        elif (answerKey[i] == studentAnswer[i]): 
            positive += 1
  
        # for each wrong answer score - 1 
        elif (answerKey[i] != studentAnswer[i]): 
            negative += 1
  
    # calculate total marks 
    return (positive * 3) + (negative * -1) 
  
  
# Driver code 
def main(): 
    answerKey = [1, 2, 3, 4, 1] 
    studentAnswer = [1, 2, 3, 4, 0] 
    N = 5
    print (markingScheme(N, answerKey, studentAnswer)) 

