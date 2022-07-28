

import java.util.Collections; 
import java.util.Vector; 
  
// Java program to find four factors of N  
// with maximum product and sum equal to N  
class GFG  
{ 
  
    // Function to find factors  
    // and to print those four factors  
    static void findfactors(int n)  
    { 
        Vector<Integer> vec = new Vector<Integer>(); 
  
        // inserting all the factors in a vector s  
        for (int i = 1; i * i <= n; i++)  
        { 
            if (n % i == 0)  
            { 
                vec.add(i); 
                vec.add(n / i); 
            } 
        } 
  
        // sort the vector  
        Collections.sort(vec); 
  
        // print all the factors  
        System.out.println("All the factors are -> "); 
        for (int i = 0; i < vec.size(); i++)  
        { 
            System.out.print(vec.get(i) + " "); 
        } 
        System.out.println(); 
  
        // Any elements is divisible by 1  
        int maxProduct = 1; 
        boolean flag = true; 
  
        // using three loop we'll find  
        // the three maximum factors  
        for (int i = 0; i < vec.size(); i++)  
        { 
            for (int j = i; j < vec.size(); j++)  
            { 
                for (int k = j; k < vec.size(); k++)  
                { 
                    // storing the fourth factor in y  
                    int y = n - vec.get(i) - vec.get(j) -  
                                    vec.get(k); 
  
                    // if the fouth factor become negative  
                    // then break  
                    if (y <= 0) 
                    { 
                        break; 
                    } 
  
                    // we will replace more optimum number  
                    // than the previous one  
                    if (n % y == 0)  
                    { 
                        flag = false; 
                        maxProduct = Math.max(vec.get(i) * vec.get(j) *  
                                            vec.get(k) * y, maxProduct); 
                    } 
                } 
            } 
        } 
  
        // print the product if the numbers exist  
        if (flag == false)  
        { 
            System.out.println("Product is -> " + maxProduct); 
        } 
        else 
        { 
            System.out.println("Not possible"); 
        } 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        int n; 
        n = 50; 
        findfactors(n); 
    } 
}  
  
// This code is contributed by PrinciRaj1992 

