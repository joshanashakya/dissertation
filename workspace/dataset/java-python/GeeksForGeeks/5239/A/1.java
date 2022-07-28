

// Java implementation of  
// above approach 
class GFG  
{ 
static int MAX = 50; 
  
// Print the answer to each query 
static void solveQuery(int n, int q, 
                       int qi[], int qj[]) 
{ 
int[] arr = new int[MAX]; 
for (int i = 0; i <= n; i++) 
    arr[i] = 0; 
  
for (int k = 0; k < q; k++)  
{ 
  
    // setting the flag for exception 
    int flag = 0; 
  
    // replacing the greater  
    // element in i and j 
    if (qj[k] < qi[k]) 
    { 
        int temp = qi[k]; 
        qi[k] = qj[k]; 
        qj[k] = temp; 
    } 
  
    // checking if that box is not 
    // used in previous query. 
    if (arr[qi[k]] != 0 ||  
        arr[qj[k]] != 0) 
        flag = 1; 
  
    // checking if connecting  
    // to the same box 
    else if (qi[k] == qj[k]) 
        flag = 1; 
  
    else 
    { 
  
        // case 1: x < i and y lies 
        // between i and j 
        for (int i = 1; i < qi[k]; i++)  
        { 
            if (arr[i] != 0 && arr[i] < qj[k] &&  
                                qi[k] < arr[i])  
            { 
                flag = 1; 
                break; 
            } 
        } 
  
        // case 2: x lies between  
        // i and j and y >j 
        if (flag == 0)  
        { 
            for (int i = qi[k] + 1;  
                     i < qj[k]; i++) 
            { 
                if (arr[i] != 0 && arr[i] > qj[k]) 
                { 
                    flag = 1; 
                    break; 
                } 
            } 
        } 
    } 
  
    // if flag is not reset inbetween. 
    if (flag == 0) 
    { 
        System.out.println("YES"); 
        arr[qi[k]] = qj[k]; 
        arr[qj[k]] = qi[k]; 
    } 
    else
        System.out.println("NO"); 
} 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 10; 
    int q = 7; 
    int qi[] = { 1, 2, 2, 2, 9, 10, 8 }; 
    int qj[] = { 5, 7, 3, 4, 9, 9, 6 }; 
  
    solveQuery(n, q, qi, qj); 
} 
}  
  
// This code is contributed 
// by ChitraNayal 

