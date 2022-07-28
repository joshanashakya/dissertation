

// Java implementation of the approach  
class GFG 
{ 
  
static void findpair(int l, int r)  
{  
    int c = 0;  
    for (int i = l; i <= r; i++)  
    {  
        for (int j = i + 1; j <= r; j++)  
        {  
            if (j % i == 0 && j != i)  
            {  
                System.out.println( i +", " + j);  
                c = 1;  
                break;  
            }  
        }  
        if (c == 1)  
            break;  
    }  
}  
  
// Driver code 
public static void main(String args[])  
{  
    int l = 1, r = 10;  
    findpair(l, r);  
}  
} 
  
// This code is contributed by Arnab Kundu 

