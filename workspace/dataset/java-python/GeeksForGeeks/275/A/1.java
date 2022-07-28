

// Java implementation of the above approach  
class GFG { 
      
// NFA variable that keeps track of  
// the state while transaction.  
static int nfa = 1;  
  
// This checks for invalid input.  
static int flag = 0;  
  
// Function for the state Q2  
static void state1(char c)  
{  
    // State transitions  
    // 'a' takes to Q4, and  
    // 'b' and 'c' remain at Q2  
    if (c == 'a')  
        nfa = 2;  
    else if (c == 'b' || c == 'c')  
        nfa = 1;  
    else
        flag = 1;  
}  
  
// Function for the state Q3  
static void state2(char c)  
{  
    // State transitions  
    // 'a' takes to Q3, and  
    // 'b' and 'c' remain at Q4  
    if (c == 'a')  
        nfa = 3;  
    else if (c == 'b' || c == 'c')  
        nfa = 2;  
    else
        flag = 1;  
}  
  
// Function for the state Q4  
static void state3(char c)  
{  
    // State transitions  
    // 'a' takes to Q2, and  
    // 'b' and 'c' remain at Q3  
    if (c == 'a')  
        nfa = 1;  
    else if (c == 'b' || c == 'c')  
        nfa = 3;  
    else
        flag = 1;  
}  
  
// Function for the state Q5  
static void state4(char c)  
{  
    // State transitions  
    // 'b' takes to Q6, and  
    // 'a' and 'c' remain at Q5  
    if (c == 'b')  
        nfa = 5;  
    else if (c == 'a' || c == 'c')  
        nfa = 4;  
    else
        flag = 1;  
}  
  
// Function for the state Q6  
static void state5(char c)  
{  
    // State transitions  
    // 'b' takes to Q7, and  
    // 'a' and 'c' remain at Q7  
    if (c == 'b')  
        nfa = 6;  
    else if (c == 'a' || c == 'c')  
        nfa = 5;  
    else
        flag = 1;  
}  
  
// Function for the state Q7  
static void state6(char c)  
{  
    // State transitions  
    // 'b' takes to Q5, and  
    // 'a' and 'c' remain at Q7  
    if (c == 'b')  
        nfa = 4;  
    else if (c == 'a' || c == 'c')  
        nfa = 6;  
    else
        flag = 1;  
}  
  
// Function for the state Q8  
static void state7(char c)  
{  
    // State transitions  
    // 'c' takes to Q9, and  
    // 'a' and 'b' remain at Q8  
    if (c == 'c')  
        nfa = 8;  
    else if (c == 'b' || c == 'a')  
        nfa = 7;  
    else
        flag = 1;  
}  
  
// Function for the state Q9  
static void state8(char c)  
{  
    // State transitions  
    // 'c' takes to Q10, and  
    // 'a' and 'b' remain at Q9  
    if (c == 'c')  
        nfa = 9;  
    else if (c == 'b' || c == 'a')  
        nfa = 8;  
    else
        flag = 1;  
}  
  
// Function for the state Q10  
static void state9(char c)  
{  
    // State transitions  
    // 'c' takes to Q8, and  
    // 'a' and 'b' remain at Q10  
    if (c == 'c')  
        nfa = 7;  
    else if (c == 'b' || c == 'a')  
        nfa = 9;  
    else
        flag = 1;  
}  
  
// Function to check for 3 a's  
static boolean checkA(String s, int x)  
{  
    for (int i = 0; i < x; i++) {  
        if (nfa == 1)  
            state1(s.charAt(i));  
        else if (nfa == 2)  
            state2(s.charAt(i));  
        else if (nfa == 3)  
            state3(s.charAt(i));  
    }  
    if (nfa == 1) {  
        return true;  
    }  
    else {  
        nfa = 4;  
    }  
    return false; 
}  
  
// Function to check for 3 b's  
static boolean checkB(String s, int x)  
{  
    for (int i = 0; i < x; i++) {  
        if (nfa == 4)  
            state4(s.charAt(i));  
        else if (nfa == 5)  
            state5(s.charAt(i));  
        else if (nfa == 6)  
            state6(s.charAt(i));  
    }  
    if (nfa == 4) {  
  
        return true;  
    }  
    else {  
        nfa = 7;  
    }  
    return false; 
}  
  
// Function to check for 3 c's  
static boolean checkC(String s, int x)  
{  
    for (int i = 0; i < x; i++) {  
        if (nfa == 7)  
            state7(s.charAt(i));  
        else if (nfa == 8)  
            state8(s.charAt(i));  
        else if (nfa == 9)  
            state9(s.charAt(i));  
    }  
    if (nfa == 7) {  
  
        return true;  
    }  
    return false; 
}  
  
// Driver Code  
public static void main (String[] args) 
{  
    String s = "bbbca";  
    int x = 5;  
  
    // If any of the states is true, that is, if either  
    // the number of a's or number of b's or number of c's  
    // is a multiple of three, then the string is accepted  
    if (checkA(s, x) || checkB(s, x) || checkC(s, x)) {  
        System.out.println("ACCEPTED");  
    }  
  
    else {  
        if (flag == 0) {  
            System.out.println("NOT ACCEPTED");  
              
        }  
        else {  
            System.out.println("INPUT OUT OF DICTIONARY.");  
              
        }  
    }  
}  
} 
  
// This code is contributed by AnkitRai01 

