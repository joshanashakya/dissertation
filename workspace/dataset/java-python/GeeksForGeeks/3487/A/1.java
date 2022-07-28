

// Java implementation of the  
// above approach  
  
public class GFG { 
  
    static long fun(int marks[],int n)  
    {  
        // Initializing one tablet   
        // for each student  
        long dp[] = new long[n] ; 
        int temp;  
          
        for (int i = 0;i < n;i ++) 
            dp[i] = 1 ;  
            
        for(int i = 0; i < n - 1; i++)  
        {  
            // if left adjacent is having   
            // higher marks review and change   
            // all the dp values assigned before  
            // until assigned dp values are found   
            // wrong according to given constrains  
            if (marks[i] > marks[i + 1])  
            {   
                temp = i;  
                while (true)  
                {  
                    if ((marks[temp] > marks[temp + 1]) &&   
                                             temp >= 0)  
                    {  
                        if (dp[temp] > dp[temp + 1])  
                        {  
                            temp -= 1;  
                            continue;  
                        }  
                        else
                        {  
                            dp[temp] = dp[temp + 1] + 1;  
                            temp -= 1;  
                        }  
                    }                      
                    else
                        break;   
                }   
            }  
                
            // if right adjacent is having higher  
            // marks add one in dp of left adjacent  
            // and assign to right one  
            else if( marks[i] < marks[i + 1])  
                dp[i + 1] = dp[i] + 1;  
        }  
        
        int sum = 0;  
        
        for(int i = 0; i < n; i++)  
        sum += dp[i];  
        
        return sum;  
    }  
      
    public static void main(String args[]) 
    { 
        // n number of students  
        int n = 6;  
            
        // marks of students  
        int marks[] = { 1, 4, 5, 2, 2, 1};  
            
        // solution of problem  
        System.out.println(fun(marks, n));  
    } 
    // This code is contributed by ANKITRAI1 
} 

