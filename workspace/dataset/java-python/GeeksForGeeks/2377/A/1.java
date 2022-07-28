

// Java implementation of the above approach  
class GFG  
{ 
      
    // Function to return the  
    // GCD of A and B  
    static int gcd(int A, int B)  
    {  
        if (B == 0)  
            return A;  
        return gcd(B, A % B);  
    }  
      
    // Function to return the  
    // LCM of A and B  
    static int lcm(int A, int B)  
    {  
        return (A * B) / gcd(A, B);  
    }  
      
    // Function to return the Kth element from  
    // the required set if it a multiple of A  
    static int checkA(int A, int B, int C, int K)  
    {  
        // Start and End for Binary Search  
        int start = 1;  
        int end = K;  
      
        // If no answer found return -1  
        int ans = -1;  
      
        while (start <= end)  
        {  
            int mid = (start + end) / 2;  
            int value = A * mid;  
      
            int divA = mid - 1;  
            int divB = (value % B == 0) ? value / B - 1
                                        : value / B;  
            int divC = (value % C == 0) ? value / C - 1
                                        : value / C;  
            int divAB = (value % lcm(A, B) == 0) ?  
                           value / lcm(A, B) - 1 :  
                           value / lcm(A, B);  
            int divBC = (value % lcm(C, B) == 0) ?  
                           value / lcm(C, B) - 1 :  
                           value / lcm(C, B);  
            int divAC = (value % lcm(A, C) == 0) ?  
                           value / lcm(A, C) - 1 :  
                           value / lcm(A, C);  
            int divABC = (value % lcm(A, lcm(B, C)) == 0) ?  
                            value / lcm(A, lcm(B, C)) - 1 : 
                            value / lcm(A, lcm(B, C));  
      
            // Inclusion and Exclusion  
            int elem = divA + divB + divC - divAC -  
                              divBC - divAB + divABC;  
            if (elem == (K - 1))  
            {  
                ans = value;  
                break;  
            }  
      
            // Multiple should be smaller  
            else if (elem > (K - 1)) 
            {  
                end = mid - 1;  
            }  
      
            // Multiple should be bigger  
            else 
            {  
                start = mid + 1;  
            }  
        }  
        return ans;  
    }  
      
    // Function to return the Kth element from  
    // the required set if it a multiple of B  
    static int checkB(int A, int B, int C, int K)  
    {  
        // Start and End for Binary Search  
        int start = 1;  
        int end = K;  
      
        // If no answer found return -1  
        int ans = -1;  
      
        while (start <= end)  
        {  
            int mid = (start + end) / 2;  
            int value = B * mid;  
      
            int divB = mid - 1;  
            int divA = (value % A == 0) ? value / A - 1
                                        : value / A;  
            int divC = (value % C == 0) ? value / C - 1
                                        : value / C;  
            int divAB = (value % lcm(A, B) == 0) ?  
                           value / lcm(A, B) - 1 : 
                           value / lcm(A, B);  
            int divBC = (value % lcm(C, B) == 0) ?  
                           value / lcm(C, B) - 1 :  
                           value / lcm(C, B);  
            int divAC = (value % lcm(A, C) == 0) ?  
                           value / lcm(A, C) - 1 :  
                           value / lcm(A, C);  
            int divABC = (value % lcm(A, lcm(B, C)) == 0) ?  
                            value / lcm(A, lcm(B, C)) - 1 :  
                            value / lcm(A, lcm(B, C));  
      
            // Inclusion and Exclusion  
            int elem = divA + divB + divC - divAC  
                    - divBC - divAB + divABC;  
            if (elem == (K - 1)) 
            {  
                ans = value;  
                break;  
            }  
      
            // Multiple should be smaller  
            else if (elem > (K - 1)) 
            {  
                end = mid - 1;  
            }  
      
            // Multiple should be bigger  
            else 
            {  
                start = mid + 1;  
            }  
        }  
        return ans;  
    }  
      
    // Function to return the Kth element from  
    // the required set if it a multiple of C  
    static int checkC(int A, int B, int C, int K)  
    {  
        // Start and End for Binary Search  
        int start = 1;  
        int end = K;  
      
        // If no answer found return -1  
        int ans = -1;  
      
        while (start <= end)  
        {  
            int mid = (start + end) / 2;  
            int value = C * mid;  
      
            int divC = mid - 1;  
            int divB = (value % B == 0) ? value / B - 1
                                        : value / B;  
            int divA = (value % A == 0) ? value / A - 1
                                        : value / A;  
            int divAB = (value % lcm(A, B) == 0) ?  
                           value / lcm(A, B) - 1 :  
                           value / lcm(A, B);  
            int divBC = (value % lcm(C, B) == 0) ?  
                           value / lcm(C, B) - 1 :  
                           value / lcm(C, B);  
            int divAC = (value % lcm(A, C) == 0) ?  
                           value / lcm(A, C) - 1 :  
                           value / lcm(A, C);  
            int divABC = (value % lcm(A, lcm(B, C)) == 0) ?  
                            value / lcm(A, lcm(B, C)) - 1 :  
                            value / lcm(A, lcm(B, C));  
      
            // Inclusion and Exclusion  
            int elem = divA + divB + divC - divAC -  
                       divBC - divAB + divABC;  
            if (elem == (K - 1))  
            {  
                ans = value;  
                break;  
            }  
      
            // Multiple should be smaller  
            else if (elem > (K - 1)) 
            {  
                end = mid - 1;  
            }  
      
            // Multiple should be bigger  
            else
            {  
                start = mid + 1;  
            }  
        }  
        return ans;  
    }  
      
    // Function to return the Kth element from  
    // the set of multiples of A, B and C  
    static int findKthMultiple(int A, int B, int C, int K)  
    {  
      
        // Apply binary search on the multiples of A  
        int res = checkA(A, B, C, K);  
      
        // If the required element is not a  
        // multiple of A then the multiples  
        // of B and C need to be checked  
        if (res == -1)  
            res = checkB(A, B, C, K);  
      
        // If the required element is neither  
        // a multiple of A nor a multiple  
        // of B then the multiples of C  
        // need to be checked  
        if (res == -1)  
            res = checkC(A, B, C, K);  
      
        return res;  
    }  
      
    // Driver code  
    public static void main(String args[]) 
    {  
        int A = 2, B = 4, C = 5, K = 5;  
      
        System.out.println(findKthMultiple(A, B, C, K));  
    }  
} 
  
// This code is contributed by AnkitRai01 

