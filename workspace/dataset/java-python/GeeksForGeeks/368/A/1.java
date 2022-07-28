

// Java implementation of above approach 
import java.util.*; 
  
class solution 
{ 
  
static int max_profit(int a[],int b[],int n,int fee) 
{ 
int i, j, profit; 
  
int l, r, diff_day = 1, sum = 0; 
  
//b[0] will contain the maximum profit 
    b[0]=0;                  
//b[1] will contain the day 
//on which we are getting the maximum profit 
    b[1]=diff_day; 
for(i=1;i<n;i++) 
{ 
    l=0; 
    r=diff_day; 
        sum=0;      
  
    for(j=n-1;j>=i;j--) 
        { 
        //here finding the max profit 
            profit=(a[r]-a[l])-fee;  
      
        //if we get less then or equal to zero 
        // it means we are not getting the profit  
            if(profit>0)      
                { 
                sum=sum+profit; 
                } 
            l++;  
      
            r++; 
            } 
//check if sum is greater then maximum then store the new maximum 
    if(b[0] < sum)  
{ 
    b[0] = sum; 
      
    b[1] = diff_day;  
  
    } 
diff_day++; 
} 
  
return 0; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 6, 1, 7, 2, 8, 4 }; 
    int n = arr.length; 
    int[] b = new int[2]; 
    int tranFee = 2; 
  
    max_profit(arr, b, n, tranFee); 
  
    System.out.println(b[0]+", "+b[1]); 
  
} 
} 
  
//This code is contributed by Surendra_Gangwar 

