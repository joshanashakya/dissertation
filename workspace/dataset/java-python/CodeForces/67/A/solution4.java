import java.io.*;import java.util.*;public class Solution{        public static void main(String args[])throws IOException{        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        PrintWriter pw = new PrintWriter(System.out);                int n = Integer.parseInt(reader.readLine());                String s = reader.readLine();                int arr[] = new int[n], arr_1[] = new int[n], arr_2[] = new int[n];        arr_1[0] = 1;        arr_2[n-1] = 1;                for(int i=1; i<n; i++){            if(s.charAt(i-1) == 'R')                arr_1[i] = arr_1[i-1] + 1;            else if(s.charAt(i-1) == '=')                arr_1[i] = arr_1[i-1];            else                arr_1[i] = 1;        }                for(int i=n-2; i>=0; i--){            if(s.charAt(i) == 'L')                arr_2[i] = arr_2[i+1] + 1;            else if(s.charAt(i) == '=')                arr_2[i] = arr_2[i+1];            else                arr_2[i] = 1;        }                for(int i=0; i<n; i++){            arr[i] = Math.max(arr_1[i], arr_2[i]);            pw.print(+arr[i]+" ");        }                pw.flush();        pw.close();                    // System.out.println(+sum);    }}