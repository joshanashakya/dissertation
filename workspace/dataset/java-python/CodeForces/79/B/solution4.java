import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.lang.reflect.Array;import java.nio.Buffer;import java.util.Arrays;import java.util.HashSet;import java.util.Set;import java.util.StringTokenizer; public class ColoredFields {     public static int floorSearch(int arr[],int low ,int high,int x){         if (low > high)            return -1;         // If last element is smaller than x        if (x >= arr[high])            return high;         // Find the middle point        int mid = (low + high) / 2;         // If middle point is floor.        if (arr[mid] == x)            return mid;         // If x lies between mid-1 and mid        if (mid > 0 && arr[mid - 1] <= x                && x < arr[mid])            return mid - 1;         // If x is smaller than mid, floor        // must be in left half.        if (x < arr[mid])            return floorSearch(                    arr, low, mid - 1, x);         // If mid-1 is not floor and x is        // greater than arr[mid],        return floorSearch(arr, mid + 1, high, x);     }        public static void main(String[] args) throws IOException {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer(br.readLine());        int n=Integer.parseInt(st.nextToken());        int m=Integer.parseInt(st.nextToken());        int k=Integer.parseInt(st.nextToken());        int t=Integer.parseInt(st.nextToken());        Set<Integer> wastes=new HashSet<>();        int w[]=new int[k];        String adj[]={"Carrots","Kiwis","Grapes"};         for(int i=1;i<=k;i++){            st=new StringTokenizer(br.readLine());            int a=Integer.parseInt(st.nextToken());            int b=Integer.parseInt(st.nextToken());            int num=(a-1)*m+b-1;            wastes.add(num);            w[i-1]=num;         }         Arrays.sort(w);        for(int i=1;i<=t;i++){            st=new StringTokenizer(br.readLine());            int a=Integer.parseInt(st.nextToken());            int b=Integer.parseInt(st.nextToken());            int val=(a-1)*m+b-1;//            System.out.println("val :"+val );            String result="";            if(wastes.contains(val)){                result="Waste";            }else{                int index=floorSearch(w,0,w.length-1,val);                int countWastes=index+1;//                System.out.println("index: "+index);                result=adj[(val-countWastes)%3];             }            System.out.println(result);        } //        int arr[]={1,5, 10,18,29,43};//        System.out.println(binarySearch(arr,30));     }}
