import java.util.Scanner; public class ArrayList {    public static void main(String[] args) {                      Scanner sc = new Scanner(System.in);                    int n=sc.nextInt();                    int min=0,c=0;                   boolean f[]=new boolean[10000001];                   for (int i=0;i<n;i++) {                       String s = sc.next();                       int r=sc.nextInt();                       if(s.charAt(0)=='-'){                           if (!f[r]) min++;                           else c--;                       }                       else c++;                       f[r]=true;                       if(c>min)min=c;                    }          System.out.println(min);             }        }
