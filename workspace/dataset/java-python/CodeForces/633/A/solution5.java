import java.util.*;import java.lang.*;import java.io.*; public class ebonyAndIvory {        public static void main (String[] args) throws IOException {		InputStreamReader ir = new  InputStreamReader(System.in);        BufferedReader br = new BufferedReader(ir);         String[] line1 = br.readLine().split(" ");            int a = Integer.parseInt(line1[0]);            int b = Integer.parseInt(line1[1]);            int c = Integer.parseInt(line1[2]);                        if(c%a==0||c%b==0)            System.out.println("Yes");            else            {                int flag = 0;                //int n = c/(a+b);                for(int i =1; i<c/a +1;i++)                {                    for(int j = 1;j<c/b +1;j++)                    {                        if(a*i+b*j==c)                        {                           System.out.println("Yes");                           flag = 1;                           break;                        }                    }                    if(flag==1)                    break;                 }                if(flag==0)                System.out.println("No");            }                     }}