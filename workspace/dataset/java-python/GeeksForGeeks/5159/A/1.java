

// Java code to check balanced parentheses with 
// O(1) space. 
  
class GFG { 
  
// Function1 to match closing bracket 
    static int matchClosing(char X[], int start, 
            int end, char open, char close) { 
        int c = 1; 
        int i = start + 1; 
        while (i <= end) { 
            if (X[i] == open) { 
                c++; 
            } else if (X[i] == close) { 
                c--; 
            } 
            if (c == 0) { 
                return i; 
            } 
            i++; 
        } 
        return i; 
    } 
  
// Function1 to match opening bracket 
    static int matchingOpening(char X[], int start, 
            int end, char open, char close) { 
        int c = -1; 
        int i = end - 1; 
  
        while (i >= start) { 
            if (X[i] == open) { 
                c++; 
            } else if (X[i] == close) { 
                c--; 
            } 
            if (c == 0) { 
                return i; 
            } 
            i--; 
        } 
        return -1; 
    } 
  
// Function to check balanced parentheses 
    static boolean isBalanced(char X[], int n) { 
        // helper variables 
        int i, j = 0, k, x, start, end; 
  
        for (i = 0; i < n; i++) { 
            // Handling case of opening parentheses 
            if (X[i] == '(') { 
                j = matchClosing(X, i, n - 1, '(', ')'); 
            } else if (X[i] == '{') { 
                j = matchClosing(X, i, n - 1, '{', '}'); 
            } else if (X[i] == '[') { 
                j = matchClosing(X, i, n - 1, '[', ']'); 
            } // Handling case of closing parentheses 
            else { 
                if (X[i] == ')') { 
                    j = matchingOpening(X, 0, i, '(', ')'); 
                } else if (X[i] == '}') { 
                    j = matchingOpening(X, 0, i, '{', '}'); 
                } else if (X[i] == ']') { 
                    j = matchingOpening(X, 0, i, '[', ']'); 
                } 
  
                // If corresponsing matching 
                // opening parentheses doesn't 
                // lie in given interval return 0 
                if (j < 0 || j >= i) { 
                    return false; 
                } 
  
                // else continue 
                continue; 
            } 
  
            // If corresponding closing parentheses 
            // doesn't lie in given interval 
            // return 0 
            if (j >= n || j < 0) { 
                return false; 
            } 
  
            // if found, now check for each 
            // opening and closing parentheses 
            // in this interval 
            start = i; 
            end = j; 
  
            for (k = start + 1; k < end; k++) { 
                if (X[k] == '(') { 
                    x = matchClosing(X, k, end, '(', ')'); 
                    if (!(k < x && x < end)) { 
                        return false; 
                    } 
                } else if (X[k] == ')') { 
                    x = matchingOpening(X, start, k, '(', ')'); 
                    if (!(start < x && x < k)) { 
                        return false; 
                    } 
                } 
  
                if (X[k] == '{') { 
                    x = matchClosing(X, k, end, '{', '}'); 
                    if (!(k < x && x < end)) { 
                        return false; 
                    } 
                } else if (X[k] == '}') { 
                    x = matchingOpening(X, start, k, '{', '}'); 
                    if (!(start < x && x < k)) { 
                        return false; 
                    } 
                } 
                if (X[k] == '[') { 
                    x = matchClosing(X, k, end, '[', ']'); 
                    if (!(k < x && x < end)) { 
                        return false; 
                    } 
                } else if (X[k] == ']') { 
                    x = matchingOpening(X, start, k, '[', ']'); 
                    if (!(start < x && x < k)) { 
                        return false; 
                    } 
                } 
            } 
        } 
  
        return true; 
    } 
  
// Driver Code 
    public static void main(String[] args) { 
          
    char X[] = "[()]()".toCharArray(); 
    int n = 6; 
    if (isBalanced(X, n)) 
        System.out.printf("Yes\n"); 
    else
        System.out.printf("No\n"); 
   
    char Y[] = "[[()]])".toCharArray(); 
    n = 7; 
    if (isBalanced(Y, n)) 
        System.out.printf("Yes\n"); 
    else
        System.out.printf("No\n"); 
    } 
} 
//this code contributed by Rajput-Ji 

