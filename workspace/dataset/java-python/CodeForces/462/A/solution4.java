import java.util.*;public class ApplemanAndEasyTask {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        char[][] arr = new char[n][n];        boolean flag = true;         for(int i = 0;i<n;i++)        {               String s = sc.next();             for(int j = 0;j<n;j++)            {                arr[i][j] = s.charAt(j);            }        }        sc.close();         for(int i = 0;i<n;i++)        {            for(int j = 0;j<n;j++)            {                int counter = 0;                if(j+1<n && arr[i][j+1]=='o')                {                    counter++;                }                 if(j-1>=0 && arr[i][j-1]=='o')                {                    counter++;                }                 if(i+1<n && arr[i+1][j]=='o')                {                    counter++;                }                if(i-1>=0 && arr[i-1][j]=='o')                {                    counter++;                }                 if(counter!=0)                {                    if(counter%2!=0)                    {                                               System.out.println("NO");                        flag = false;                        break;                    }                                     }            }            if(flag == false)            break;                     }        if(flag)        System.out.println("YES");     }    }
