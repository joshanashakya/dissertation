

// Java implementation of above approach 
  
// Function that calculates marks. 
class geeksforgeeks 
{ 
static int markingScheme(int N, int answerKey[], int studentAnswer[]) 
{ 
    int positive = 0, negative = 0, notattempt = 0; 
  
    for (int i = 0; i < N; i++) { 
  
        // for not attempt score + 0 
        if (studentAnswer[i] == 0) 
            notattempt++; 
  
        // for each correct answer score + 3 
        else if (answerKey[i] == studentAnswer[i]) 
            positive++; 
  
        // for each wrong answer score - 1 
        else if (answerKey[i] != studentAnswer[i]) 
            negative++; 
    } 
  
    // calculate total marks 
    return (positive * 3) + (negative * -1); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int answerKey[] = { 1, 2, 3, 4, 1 }; 
    int studentAnswer[] = { 1, 2, 3, 4, 0 };  
    int N = answerKey.length; 
    int marking_Scheme = markingScheme(N, answerKey, studentAnswer);   
    System.out.println(marking_Scheme); 
} 
} 

