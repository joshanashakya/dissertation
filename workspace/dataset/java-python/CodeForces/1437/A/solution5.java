//package codechef; import java.io.*;public class CodeChef{    public static void main(String[] args)throws IOException    {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        int t = Integer.parseInt(br.readLine());        while(t-->0)        {            String []str = br.readLine().split(" ");            int l = Integer.parseInt(str[0]), r = Integer.parseInt(str[1]);            if(l>r/2)            {                System.out.println("YES");            }            else System.out.println("NO");        }    }}