

// Java program to print all factors combination 
import java.io.*; 
import java.util.*; 
class FactorsCombination { 
  
    // Returns a list containing all ways to factorize 
    // a number n. 
    public static List<List<Integer> > factComb(int n) 
    { 
        // making list of lists to store all 
        // possible combinations of factors 
        List<List<Integer> > result_list = 
                     new ArrayList<List<Integer> >(); 
        List<Integer> list = new ArrayList<Integer>(); 
  
        // function to calculate all the combinations 
        // of factors 
        factorsListFunc(2, 1, n, result_list, list); 
        return result_list; 
    } 
  
    // First is current factor to be considered. 
    // each_product is current product of factors.     
    public static void factorsListFunc(int first,  
                             int each_prod, int n,  
    List<List<Integer> > result_list, List<Integer>         
                               single_result_list) 
    { 
        // Terminating condition of this recursive  
        // function 
        if (first > n || each_prod > n) 
            return; 
  
        // When each_prod is equal to n, we get 
        // the list of factors in 'single_result_ 
        // _list' so it is  added to the result_ 
        // _list list . 
        if (each_prod == n) { 
  
            ArrayList<Integer> t = 
          new ArrayList<Integer>(single_result_list); 
  
            result_list.add(t); 
  
            return; 
        } 
  
        // In this loop we first calculate factors 
        // of n and then it's combination so that 
        // we get the value n in a recursive way . 
        for (int i = first; i < n; i++) { 
            if (i * each_prod > n) 
                break; 
  
            // if i divides n 
            // properly then it 
            // is factor of n 
            if (n % i == 0) { 
  
                // it is added to 'single_result_list' list 
                single_result_list.add(i); 
  
                // Here function is called recursively 
                // and when (i*each_prod) is equal to n 
                // we will store the 'single_result_list' (it is 
                // basically the list containing all 
                // combination of factors) into result_list. 
                factorsListFunc(i, i * each_prod, n, 
                  result_list, single_result_list); 
  
                // here we will empty the 'single_result_list'  
                // List so that new combination of factors 
                // get stored in it. 
                single_result_list.remove(single_result_list.size() - 1); 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 16; 
        List<List<Integer> > resultant = factComb(n); 
  
        // printing all possible combination 
        // of factors stored in resultant list 
        for (List<Integer> i : resultant) { 
            for (int j : i)  
                System.out.print(j + " ");             
            System.out.println(); 
        } 
    } 
} 

