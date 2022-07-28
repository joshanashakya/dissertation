

// Java program to find the sum of the elements of an array  
// whose prime factors are present in the same array  
  
import java.util.*;   
  
public class GFG{ 
  
final static int MAXN = 1000001 ; 
  
// Stores smallest prime factor for every number  
static int spf[] = new int [MAXN];  
  
    // Function to calculate SPF (Smallest Prime Factor)  
    // for every number till MAXN  
    static void sieve()  
    {  
        spf[1] = 1;  
        for (int i = 2; i < MAXN; i++)  
      
            // Marking smallest prime factor for every  
            // number to be itself.  
            spf[i] = i;  
      
        // Separately marking spf for every even  
        // number as 2  
        for (int i = 4; i < MAXN; i += 2)  
            spf[i] = 2;  
      
        for (int i = 3; i * i < MAXN; i++) {  
      
            // If i is prime  
            if (spf[i] == i) {  
      
                // Marking SPF for all numbers divisible by i  
                for (int j = i * i; j < MAXN; j += i)  
      
                    // Marking spf[j] if it is not  
                    // previously marked  
                    if (spf[j] == j)  
                        spf[j] = i;  
            }  
        }  
    }  
      
    // Function to return the sum of the elements of an array  
    // whose prime factors are present in the same array  
    static int sumFactors(int arr[], int n)  
    {  
      
        // Function call to calculate smallest prime factors of  
        // all the numbers upto MAXN  
        sieve();  
      
        // Create map for each element  
        Map map=new HashMap(); 
          
        for(int i = 0 ; i < MAXN ; ++i) 
            map.put(i,0) ; 
              
        for (int i = 0; i < n; ++i)  
            map.put(arr[i],1);  
          
      
        int sum = 0;  
      
        for (int i = 0; i < n; ++i) {  
            int num = arr[i];  
      
            // If smallest prime factor of num is present in array  
            while (num != 1 && (int)(map.get(spf[num])) == 1) {  
                num /= spf[num];  
            }  
      
            // Each factor of arr[i] is present in the array  
            if (num == 1)  
                sum += arr[i];  
        }  
      
        return sum;  
    }  
      
    // Driver program  
     public static void main(String []args) 
    {  
        int arr[] = { 5, 11, 55, 25, 100 };  
        int n = arr.length ; 
      
        // Function call to print required answer  
         System.out.println(sumFactors(arr, n)) ; 
    }  
    // This code is contributed by Ryuga 
} 

