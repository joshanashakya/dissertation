/*If you want to aim high, aim highDon't let that studying and grades consume youJust live life young******************************What do you think? What do you think?1st on Billboard, what do you think of itNext is a Grammy, what do you think of itHowever you think, I’m sorry, but shit, I have no fcking interest*******************************I'm standing on top of my Monopoly boardThat means I'm on top of my game and it don't stoptil my hip don't hop anymorehttps://www.a2oj.com/Ladder16.html*******************************Shining through the city with a little funk and soul*******************************300iq as writer = Sad!*/import java.util.*;import java.io.*;import java.math.*;    public class x828A   {      public static void main(String hi[]) throws Exception      {         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));         StringTokenizer st = new StringTokenizer(infile.readLine());         int N = Integer.parseInt(st.nextToken());         int A = Integer.parseInt(st.nextToken());         int B = Integer.parseInt(st.nextToken());         int[] arr = new int[N];         st = new StringTokenizer(infile.readLine());         for(int i=0; i < N; i++)            arr[i] = Integer.parseInt(st.nextToken());         int res = 0;         int half = 0;         for(int x: arr)         {            if(x == 2)            {               if(B > 0)                  B--;               else                  res += 2;            }            else            {               if(A > 0)                  A--;               else if(B > 0)               {                  B--;                  half++;               }               else if(half > 0)                  half--;               else                  res++;            }         }         System.out.println(res);      }   }