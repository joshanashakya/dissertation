

# Python3 program to assign grades  
# to a student using nested if-else 
  
if __name__ == "__main__": 
  
    # Store marks of all the subjects 
    # in an array 
    marks = [25, 65, 46, 98, 78, 65 ] 
  
    # Max marks will be 100 * number 
    # of subjects 
    max_marks = len(marks)* 100
  
    # Initialize student's total  
    # marks to 0 
    total = 0
  
    # Initialize student's grade 
    # marks to F 
    grade = 'F'
  
    # Traverse though the marks array 
    # to find the sum. 
    for i in range(len(marks)): 
        total += marks[i] 
  
    # Calculate the percentage. 
    # Since all the marks are integer, 
    percentage = ((total) /max_marks) * 100
  
    # Nested if else 
    if (percentage >= 90): 
        grade = 'A'
          
    else : 
        if (percentage >= 80 and
            percentage <= 89) : 
            grade = 'B'
              
        else : 
            if (percentage >= 60 and 
                percentage <= 79) : 
                grade = 'C'
                  
            else : 
                if (percentage >= 33 and 
                    percentage <= 59) : 
                    grade = 'D'
                      
                else: 
                    grade = 'F'
          
    print(grade) 
  
# This code is contributed by ita_c 

