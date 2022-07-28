import java.util.*;
import java.io.*;
import java.math.*;

   public class ModelB
   {
      public static void main(String args[]) throws Exception
      {
         //query based
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int T = Integer.parseInt(st.nextToken());
         StringBuilder sb = new StringBuilder();
         while(T-->0)
         {
            st = new StringTokenizer(infile.readLine());
            int N = Integer.parseInt(st.nextToken());
            long K = Long.parseLong(st.nextToken())%2;
            if(K == 0)  K = 2;
            int[] arr = new int[N];
            st = new StringTokenizer(infile.readLine());
            for(int i=0; i < N; i++)
               arr[i] = Integer.parseInt(st.nextToken());
            for(int turns=0; turns < K; turns++)
            {
               int max = arr[0];
               for(int x: arr)
                  max = Math.max(max, x);
               for(int i=0; i < N; i++)
                  arr[i] = max-arr[i];
            }
            for(int i=0; i < N; i++)
            {
               sb.append(arr[i]);
               if(i+1 < N)
                  sb.append(" ");
            }
            sb.append("\n");
         }
         System.out.print(sb);
      }
   }
