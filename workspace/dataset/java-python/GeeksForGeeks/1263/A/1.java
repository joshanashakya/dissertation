

/* Java code to implement maximum perfect cube  
formed after deleting minimum digits */
import java.util.*; 
class GFG  
{ 
  
    // Returns vector of Pre Processed perfect cubes 
    static Vector<String> preProcess(int n)  
    { 
        Vector<String> preProcessedCubes = new Vector<>(); 
        for (int i = 1; i * i * i <= n; i++) 
        { 
            int iThCube = i * i * i; 
  
            // convert the cube to String and push into 
            // preProcessedCubes vector 
            String cubeString = String.valueOf(iThCube); 
            preProcessedCubes.add(cubeString); 
        } 
        return preProcessedCubes; 
    } 
  
    /* Utility function for findLargestCube().  
    Returns the Largest cube number that can be formed */
    static String findLargestCubeUtil(String num, 
            Vector<String> preProcessedCubes)  
    { 
        // reverse the preProcessed cubes so that we  
        // have the largest cube in the beginning 
        // of the vector 
        Collections.reverse(preProcessedCubes); 
  
        int totalCubes = preProcessedCubes.size(); 
  
        // iterate over all cubes 
        for (int i = 0; i < totalCubes; i++) 
        { 
            String currCube = preProcessedCubes.get(i); 
  
            int digitsInCube = currCube.length(); 
            int index = 0; 
            int digitsInNumber = num.length(); 
            for (int j = 0; j < digitsInNumber; j++) 
            { 
  
                // check if the current digit of the cube 
                // matches with that of the number num 
                if (num.charAt(j) == currCube.charAt(index))  
                { 
                    index++; 
                } 
  
                if (digitsInCube == index)  
                { 
                    return currCube; 
                } 
            } 
        } 
  
        // if control reaches here, the its  
        // not possible to form a perfect cube 
        return "Not Possible"; 
    } 
  
    // wrapper for findLargestCubeUtil() 
    static void findLargestCube(int n)  
    { 
        // pre process perfect cubes 
        Vector<String> preProcessedCubes = preProcess(n); 
  
        // convert number n to String 
        String num = String.valueOf(n); 
  
        String ans = findLargestCubeUtil(num, preProcessedCubes); 
  
        System.out.println("Largest Cube that can be formed from "
                + n + " is " + ans); 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int n; 
        n = 4125; 
        findLargestCube(n); 
  
        n = 876; 
        findLargestCube(n); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

