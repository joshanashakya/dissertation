

// Java program to find first element that  
// is strictly greater than given target.  
    
class GfG {  
    private static int next(int[] arr, int target)  
    {  
        int start = 0, end = arr.length - 1;  
    
        int ans = -1;  
        while (start <= end) {  
            int mid = (start + end) / 2;  
    
            // Move to right side if target is  
            // greater.  
            if (arr[mid] <= target) {  
                start = mid + 1;  
            }  
    
            // Move left side.  
            else {  
                ans = mid;  
                end = mid - 1;  
            }  
        }  
        return ans;  
    }  
    
    // Driver code  
    public static void main(String[] args)  
    {  
        int[] arr = { 1, 2, 3, 5, 8, 12 };  
        System.out.println(next(arr, 8));  
    }  
}  

