/*If you want to aim high, aim highDon't let that studying and grades consume youJust live life young******************************What do you think? What do you think?1st on Billboard, what do you think of itNext is a Grammy, what do you think of itHowever you think, I’m sorry, but shit, I have no fcking interest*******************************I'm standing on top of my Monopoly boardThat means I'm on top of my game and it don't stoptil my hip don't hop anymorehttps://www.a2oj.com/Ladder16.html*******************************300iq as writer = Sad!*/import java.util.*;import java.io.*;import java.math.*;    public class x1202A   {      public static void main(String hi[]) throws Exception      {         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));         StringTokenizer st = new StringTokenizer(infile.readLine());         int T = Integer.parseInt(st.nextToken());         while(T-->0)         {            char[] arr = infile.readLine().toCharArray();            char[] brr = infile.readLine().toCharArray();            int N = arr.length;            int M = brr.length;            int dist2 = 0;            for(int i=M-1; i >= 0; i--)            {               if(brr[i] == '1')                  break;               dist2++;            }            int dist = 0;            for(int i=N-1; i >= 0; i--)            {               if(arr[i] == '1' && dist >= dist2)                  break;               dist++;            }            int res = dist-dist2;            System.out.println(res);         }      }   }
